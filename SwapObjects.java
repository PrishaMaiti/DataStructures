public class SwapObjects {
    private int value;

    // Hack: create IntByReference, swapToLowHighOrder and toString methods

    //Constructor for SwapObjects must have an int parameter. We'll call it n
    public SwapObjects(int n) {
        value = n;
    }

    //method to swap numbers to low high order if necessary, otherwise numbers remain in the original order
    public void swapToLowHighOrder(SwapObjects otherObj) {
        if(this.value >= otherObj.value) {
            int temp = this.value;
            this.value = otherObj.value;
            otherObj.value = temp;
            System.out.println("swapped " + this.value + " & " + otherObj.value);
        } else {
            System.out.println("No swap needed, as numbers are not in high to low order");
        }
    }

    // A method to represent the object as string
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

    // static main method that provides some simple test cases
    public static void main(String[] args) {
        SwapObjects.swapper(21, 16);
        SwapObjects.swapper(16, 21);
        SwapObjects.swapper(16, -1);
    }
}
