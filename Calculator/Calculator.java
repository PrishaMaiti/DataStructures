package Calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

class Debug {
    public static boolean on = false;
    public static void print( String s ) {
        if (on) System.out.println(s);
    }
}

public class Calculator {
  private final String expression;
  private ArrayList<String> tokens;
  private ArrayList<String> reverse_polish;
  private Double result;

  public Calculator(String expression) {
    // original input
    this.expression = expression;

    // parse expression into terms
    this.termTokenizer();

    // place terms into reverse polish notation
    this.tokensToReversePolishNotation();

    // calculate reverse polish notation
    this.rpnToResult();
  }

  private final HashMap<String, Integer> OPERATORS = new HashMap<>();
  {
    // Map<"token", precedence> - lower number means higher precedence
    OPERATORS.put("^", 2);
    OPERATORS.put("*", 3);
    OPERATORS.put("/", 3);
    OPERATORS.put("%", 3);
    OPERATORS.put("+", 4);
    OPERATORS.put("-", 4);
  }

   // Helper definition for supported operators
  private final HashMap<String, Integer> SEPARATORS = new HashMap<String, Integer>();
  {
    // Map<"separator", not_used>
    SEPARATORS.put(" ", 0);
    SEPARATORS.put("(", 0);
    SEPARATORS.put(")", 0);
  }

  // Test if token is an operator
  private boolean isOperator(String token) {
    // find the token in the hash map
    return OPERATORS.containsKey(token);
  }

  // Test if token is an separator
  private boolean isSeperator(String token) {
    // find the token in the hash map
    return SEPARATORS.containsKey(token);
  }

  // Compare precedence of operators, return true if token1 is higher precedence
  private Boolean isPrecedent(String token1, String token2) {
    // token 1 is precedent if it is lower than token 2
    return (OPERATORS.get(token1) < OPERATORS.get(token2)) ;
  }

   // Term Tokenizer takes original expression and converts it to ArrayList of tokens
  private void termTokenizer() {
    // contains final list of tokens
    this.tokens = new ArrayList<String>();

    int start = 0;  // term split starting index
    StringBuilder multiCharTerm = new StringBuilder();    // term holder
    
    for (int i = 0; i < this.expression.length(); i++) {
        Character c = this.expression.charAt(i);

        if ( isOperator(c.toString() ) || isSeperator(c.toString())  ) {
            Debug.print("termTokenizer append operator/separator char => [" + c + "]");
            // 1st check for working term and add if it exists
            if (multiCharTerm.length() > 0) {
                tokens.add(this.expression.substring(start, i));
            }
            // Add operator or parenthesis term to list
            if (c != ' ') {
                Debug.print("  termTokenizer found operator");
                this.tokens.add(c.toString());
            }
            // Get ready for next term
            start = i + 1;
            multiCharTerm = new StringBuilder();
        }    
        else {
            // multi character terms: numbers, functions, perhaps non-supported elements
            // Add next character to working term
            Debug.print("termTokenizer append operand char => [" + c + "]");
            multiCharTerm.append(c);
        }
    }

    // Add last term
    if (multiCharTerm.length() > 0) {
      tokens.add(this.expression.substring(start));
    }

    Debug.print("termTokenizer this.tokens => " + this.tokens);
  }

  private void tokensToReversePolishNotation () {
    // contains final list of tokens in RPN
    this.reverse_polish = new ArrayList<String>();

    // stack is used to reorder for appropriate grouping and precedence
    Stack<String> operatorStack = new Stack<>();
    for (String token : this.tokens) {
        Debug.print("token : " + token);
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
                    Debug.print("  peek-stack-top: " + operatorStack.peek());
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

    Debug.print("tokensToReversePolishNotation this.reverse_polish => " + this.reverse_polish);
  }

  // Takes RPN and produces a final result
  private void rpnToResult() {
    // Stack used to hold operands while evaluating an RPN format of the calculation
    Stack<Double> operandStack = new Stack<>();

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

  public String toString() {
    return ("Original expression: " + this.expression + "\n" +
            "Tokenized expression: " + this.tokens.toString() + "\n" +
            "Reverse Polish Notation: " + this.reverse_polish.toString() + "\n" +
            "Final result: " + String.format("%.2f", this.result));
  }
}