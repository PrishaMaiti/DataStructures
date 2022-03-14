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
## Challenge 3
