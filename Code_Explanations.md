{% include navigation.html %}
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
