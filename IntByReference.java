import java.util.Scanner;

// Challenge 2: Swap Two Numbers
    // A class to take any two int values and arrange them in low to high order if numbers are initially in high to low order
    // Else program will say that the numbers cannot be swapped and return the same order of numbers
public class IntByReference {
  private int value;
  
  // Hack: create IntByReference, swapToLowHighOrder and toString methods
  public IntByReference(int n) {
      
  }
  
  public void swapToLowHighOrder(int a, int b) {
      if(a >= b) {
          int temp = 0;
          temp = a;
          a = b;
          b = temp;
      } else {
          System.out.println("Oops! Cannot swap if numbers are not in high to low order");
      }
  }
  
  public String toString() {
    int a;
    int b;
    Scanner intScan = new Scanner(System.in);
    System.out.println("Enter first number:");
    a = intScan.nextInt();
    System.out.println("Enter second number:");
    b = intScan.nextInt();
    intScan.close();
    String before = "Before: " + a + " " + b + " \n";
    String after = "After: " + a + " " + b;
    String output = before + after;
    return output;
  }
  
  //static method that enables me to see numbers swapped by reference (before, after)
  public static void swapper(int n0, int n1) {
    IntByReference a = new IntByReference(n0);
    IntByReference b = new IntByReference(n1);
    System.out.println("Before: " + a + " " + b);
    IntByReference.swapToLowHighOrder(a, b);  // conditionally build swap method to change values of a, b
    System.out.println("After: " + a + " " + b);
    System.out.println();
  }
  
  // static main method that provides some simple test cases is testerMethod_swap outside the class
        
    }