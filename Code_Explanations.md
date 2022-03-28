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

{% include navigation.html %}
