# Code Explanations

## Challenge 1

DynamicMenu.java
Shows a try and catch logic vs. a commented out if and else logic
```
while(true) {
            System.out.print("What menu item do you want to click? ");
            String item = in.nextLine();
            if(item.equals("LAST") || item.equals("DONE")) {
                break;
            }
            Runnable action = myDynMenu.getActionFor(item);
            try {
                action.run();
            }
            catch(Exception e) {
                System.out.println("Oops... no such menu item exists!");
            }

            // if(action != null) {
            //     action.run();
            // } else {
            //     System.out.println("Oops... no such menu item exists!");
            // }
        }
```
## Challenge 2

SwapObjects.java has a toString method to print a formatted string for the numbers to be swapped if not already in low to high order
```
public String toString() {
        return "Object with value = " + Integer.toString(value);
    }

    // static method that enables me to see numbers swapped by reference (before, after)
    public static void swapper(int n0, int n1) {
        SwapObjects a = new SwapObjects(n0);
        SwapObjects b = new SwapObjects(n1);
        System.out.println("Before: a = " + a + " & b = " + b);
        a.swapToLowHighOrder(b);  // conditionally build swap method to change values of a, b
        System.out.println("After: a = " + a + " & b = " + b);
        System.out.println();
    }
 ```
 And here's the swapToLowHighOrder method:
 ```
 public void swapToLowHighOrder(SwapObjects otherObj) {
        if(this.value >= otherObj.value) {
            int temp = this.value;
            this.value = otherObj.value;
            otherObj.value = temp;
        } else {
            System.out.println("No swap needed, as numbers are not in high to low order");
        }
    }
 ```

## Challenge 3

Matrix.java has a toString method to print out a keypad
```
public String toString() {
        String str = "";
        String SEP = "  ";

        int ROWS = 4;
        int COLS = 3;

        for(int i=0; i<4; i++) {
            for(int j=0; j<3; j++) {
                int value = this.matrix[i][j];
                if(value == -1) {
                    str += " " + SEP;
                } else {
                    str += Integer.toString(value) + SEP;
                }
            }
            str += "\n";
        }

        str += "\n";

        for(int i=ROWS-1; i>=0; i--) {
            for(int j=COLS-1; j>=0; j--) {
                int value = this.matrix[i][j];
                if(value == -1) {
                    str += " " + SEP;
                } else {
                    str += Integer.toString(value) + SEP;
                }
            }
            str += "\n";
        }

        return str;
    }
```

# Queue
The add and delete methods use an if-else statement which are based on whether or not the head of the queue's node is null. Accordingly, add will increment the count of the number of items in the queue and delete will decrement the count.
```
public void add(T data) {
        // add new object to end of Queue
        LinkedList<T> newTailNode = new LinkedList<T>(data, null);

        if (head == null)  // initial condition
            this.head = this.tail = newTailNode;
        else {  // nodes in queue
            this.tail.setNextNode(newTailNode); // current tail points to new tail
            this.tail = newTailNode;  // update tail
        }
        this.count++;
}

    /**
     *  Delete/remove an existing object from the front/head of the Queue,
     */
    public T delete() {
        if (head == null)  // initial condition
            return null;
        else {  // nodes in queue
            T oldHeadData = this.head.getData();
            this.head = this.getHead().getNext();  // update head
            if(this.head != null) {
                this.head.setPrevNode(null);
            }
            this.count--;
            return oldHeadData;
    }
}
```

# Stack
The nature of building a Stack is through creating a push and pop function. My push function uses the parameter of the data in the stack that's of type T and increments the count of the new, empty stack that serves as a template in order to reverse the Queue. My pop function has no parameters and returns the data of the node to be returned by calling the getData method in LinkedList.java and then finally decrements the count in order for the queue to be fully reversed.
```
public void push(T data) {
        // push new object to top of Stack
        LinkedList<T> newTopNode = new LinkedList<T>(data, null);

        if (top == null)  // initial condition
            this.top = this.bottom = newTopNode;
        else {  // nodes exist in Stack
            LinkedList<T> oldTopNode = this.top;
            this.top.setNextNode(newTopNode); // current top points to new top
            this.top = newTopNode;  // update top
            this.top.setPrevNode(oldTopNode);
        }

        count++;
}

    /**
     *  Delete/remove an existing object from the top of the Stack,
     *
     * @param  data, is the data to be found & popped off from the Stack.
     */
    public T pop() {
        if (top == null)  // initial condition
            return null;
        else {  // nodes in Stack
            LinkedList<T> retNode = this.getTop();
            this.top = this.getTop().getPrevious();  // update top
            if(this.top != null) {
                this.top.setNextNode(null);
            }
            count--;
            return retNode.getData();
    }
}
```

# Calculator
The basis of the calculator is the stack data structure. When evaluating expressions, there are three main phases: parsing the expression that's originally one string into tokens (tokenizing), converting expression into Reverse Polish Notation (RPN), and using RPN to get the mathematical result. The following code snippets show the method written for each respective phase. In Phase 1, the expression is parsed into tokens in the method termTokenizer(). In Phase 2, the operators are pushed into the stack and if the operator being scanned is of lower precedence than that of what is at the top of the stack, as obtained from the java.util.Stack peek() function, then that operator in the stack is popped out of the stack and appended to the RPN. If the operator being scanned is of higher or equal precedence than that of what is at the top of the stack, as obtained from the java.util.Stack peek() function, then the scanned operator is pushed into the stack. Operands directly get appended to the RPN, and the final expression in RPN form is obtained in the method tokensToReversePolishNotation(). In Phase 3, now that RPN is obtained, it's the operators that are pushed into the stack and operators, since they're binary operators, take the top two numbers of the stack and evaluate them, then push the new number into the operand stack. This process repeats until there is only one number left in the stack, and that number is the final result, and what is obtained int he method rpnToResult().
```
private void termTokenizer() {
    // contains final list of tokens
    this.tokens = new ArrayList<String>();

    int start = 0;  // term split starting index
    StringBuilder multiCharTerm = new StringBuilder();    // term holder
    
    for (int i = 0; i < this.expression.length(); i++) {
        Character c = this.expression.charAt(i);

        if ( isOperator(c.toString() ) || isSeperator(c.toString())  ) {
            // 1st check for working term and add if it exists
            if (multiCharTerm.length() > 0) {
                tokens.add(this.expression.substring(start, i));
            }
            // Add operator or parenthesis term to list
            if (c != ' ') {
                this.tokens.add(c.toString());
            }
            // Get ready for next term
            start = i + 1;
            multiCharTerm = new StringBuilder();
        }    
        else {
            // multi character terms: numbers, functions, perhaps non-supported elements
            // Add next character to working term
            multiCharTerm.append(c);
        }
    }

    // Add last term
    if (multiCharTerm.length() > 0) {
      tokens.add(this.expression.substring(start));
    }
  }
```
```
private void tokensToReversePolishNotation () {
    // contains final list of tokens in RPN
    this.reverse_polish = new ArrayList<String>();

    // stack is used to reorder for appropriate grouping and precedence
    Stack operatorStack = new Stack<String>();
    for (String token : this.tokens) {
        switch (token) {
            // If left bracket push token on to stack
            case "(":
                operatorStack.push(token);
                break;
            case ")":
                while (!operatorStack.empty() &&
                    !operatorStack.peek().equals("(")) {
                    reverse_polish.add( (String)operatorStack.pop() );
                }
                operatorStack.pop();
                break;
            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
            case "^":
                // While stack
                // not empty AND stack top element
                // and is an operator
                while ( !operatorStack.empty() && 
                        isOperator((String) operatorStack.peek()) ) {
                    if ( isPrecedent(token, (String) operatorStack.peek() )) {
                        break;
                    } else {
                        // new token-operator is of lower or equal precedence, so
                        // pop stack-top-operator and add to RPN
                        reverse_polish.add((String)operatorStack.pop());
                        continue;
                    }
                }
                // Push the new high precedence operator on the stack
                operatorStack.push(token);
                break;
            default:    // Default should be a number(operand), there could be test here
                this.reverse_polish.add(token);
                break;
        }
    }

    // Empty remaining tokens
    while (!operatorStack.empty()) {
        reverse_polish.add((String)operatorStack.pop());
    }
  }
  ```
  ```
  private void rpnToResult() {
    // Stack used to hold operands while evaluating an RPN format of the calculation
    Stack operandStack = new Stack();

    // for loop to process RPN, example: 100 200 3 * +
    for (String tokens : this.reverse_polish) {
      // If the token is a number
      if (!isOperator(tokens)) {
        // Push number to stack
        Double num = Double.parseDouble(tokens);
        operandStack.push(num);
      }
        // else
      else {
        // Pop the two top entries
        Double temp1 = (Double)operandStack.pop();
        Double temp2 = (Double)operandStack.pop();
        Double answer = 0.0;

        // Based off of Token operator calculate result
        if (tokens.equals("^")) {
          answer = Math.pow(temp2, temp1);
        }
        if (tokens.equals("*")) {
          answer = temp1 * temp2;
        }
        if (tokens.equals("/")) {
          answer = temp2 / temp1;
        }
        if (tokens.equals("%")) {
          answer = temp2 % temp1;
        }
        if (tokens.equals("+")) {
          answer = temp2 + temp1;
        }
        if (tokens.equals("-")) {
          answer = temp2 - temp1;
        }

        operandStack.push(answer);
      }
    }
        // Pop final result and set as final result for expression
    result = (Double)operandStack.pop();
  }
  ```
  
{% include navigation.html %}
