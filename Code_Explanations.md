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
