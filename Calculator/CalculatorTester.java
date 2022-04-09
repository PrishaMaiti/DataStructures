package Calculator;

import java.util.Scanner;

public class CalculatorTester {

    public static void main(String[] args) {

      // PREVIOUS TEST CASES HAVE BEEN COMMENTED OUT SO THAT USER GETS LIBERTY OF CHOOSING ANY EXPRESSION AND NOT DEALING WITH SO MANY EXPRESSIONS AT ONCE
      
      /*Calculator simpleMathCalc = new Calculator("100 + 200  * 3");
      System.out.println("Simple Math\n" + simpleMathCalc);
  
      Calculator parenthesisMathCalc = new Calculator("(100 + 200)  * 3");
      System.out.println("Parenthesis Math\n" + parenthesisMathCalc);
      
      Calculator fractionMathCalc = new Calculator("100.2 - 99.3");
      System.out.println("Fraction Math\n" + fractionMathCalc);
      
  
      Calculator allMathCalc = new Calculator("200 % 300 + 5 + 300 / 200 + 1 * 100");
      System.out.println("All Math\n" + allMathCalc);
  
      
  
      Calculator allMath2Calc = new Calculator("200 % (300 + 5 + 300) / 200 + 1 * 100"); // ambiguous order % vs /
      Calculator allMath2Calc = new Calculator("(200 % (300 + 5 + 300)) / 200 + 1 * 100");
        Calculator allMath2Calc = new Calculator("200 % ((300 + 5 + 300) / 200) + 1 * 100");
        System.out.println("All Math2\n" + allMath2Calc);
    
        
      Calculator powerMathCalc = new Calculator("2 ^ 3 * 4");
      System.out.println("Power Math\n" + powerMathCalc); */


      Scanner sc = new Scanner(System.in);
      System.out.println("What expression would you like to calculate?: ");
      String original = sc.nextLine();
      Calculator input = new Calculator(original);
      System.out.println("Result: " + input);

  }


}