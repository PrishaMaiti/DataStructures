public class Matrix {
    private final int[][] matrix;

    // store matrix
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // Hack: create toString method using nested for loops to format output of a matrix

    //toString method to print a formatted output of type String
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
  
  
  // declare and initialize a matrix for a keypad
  static int[][] keypad() {
      return new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} };
  }
  
  // declare and initialize a random length arrays
  static int[][] numbers() {
      return new int[][]{ { 0, 1 },
              { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
              { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };
  }
  
  // tester method for matrix formatting
  public static void main(String[] args) {
      Matrix m0 = new Matrix(keypad());
      System.out.println("Keypad:");
      System.out.println(m0);
  
      // Matrix m1 = new Matrix(numbers());
      // System.out.println("Numbers Systems:");
      // System.out.println(m1);
  }
}