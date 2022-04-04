package MyUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;
import MyUtils.DynamicMenu;
import MyUtils.SwapObjects;

public class DynamicMenuTest {
  
  private class Debug {
    public static boolean on = true;

    public static void print( String s ) {
        if (on) System.out.println(s);
    }
  }

  private class MyRunnableImpl implements Runnable {
      public void run() {
          System.out.println(" => clicked");
      }
  }
  
  private class MyRunnableImpl1 implements Runnable {
      public void run() {
          System.out.println(" => menu item 1 clicked");
      }
  }
      
  private class MyRunnableImpl2 implements Runnable {
      public void run() {
          System.out.println(" => menu item 2 clicked");
      }
  }

  private class MyRunnableImpl3 implements Runnable {
      public void run() {
        System.out.println(" => menu item Swap clicked");
        
        SwapObjects a = new SwapObjects(21);
        SwapObjects b = new SwapObjects(16);
        a.swapToLowHighOrder(b);

        SwapObjects a2 = new SwapObjects(16);
        SwapObjects b2 = new SwapObjects(21);
        a2.swapToLowHighOrder(b2);

        new SwapObjects(16).swapToLowHighOrder(new SwapObjects(-1));
      }
  }

  public void testDynamicMenu() {
    DynamicMenu myDynMenu = new DynamicMenu("MyMenu");
    
    String item1 = "AA";
    Runnable action1 = new MyRunnableImpl1();
    myDynMenu.add(item1, action1);
    
    String item2 = "BB";
    Runnable action2 = new MyRunnableImpl2();
    myDynMenu.add(item2, action2);
  
    String item3 = "Swap";
    Runnable action3 = new MyRunnableImpl3();
    myDynMenu.add(item3, action3);
  
    myDynMenu.printAllItems();
  
    myDynMenu.getActionFor(item1).run();
    myDynMenu.getActionFor(item2).run();
    myDynMenu.getActionFor(item3).run();
  };

  public void testDynamicMenu2() {
    // Using Scanner for Getting Input from User
    Scanner in = new Scanner(System.in);

    System.out.print("Enter Menu Title: ");
    String title = in.nextLine();
    DynamicMenu myDynMenu = new DynamicMenu(title);

    while(true) {
        System.out.print("Enter menu item name: ");
        String item = in.nextLine();
        if(item.equals("LAST") || item.equals("DONE")) {
            break;
        }
        Runnable action = new MyRunnableImpl();
        myDynMenu.add(item, action);
    }


    System.out.println("Your menu items are: ");
    myDynMenu.printAllItems();

    while(true) {
        System.out.print("What menu item do you want to click? ");
        String item = in.nextLine();
        if(item.equals("LAST") || item.equals("DONE")) {
            break;
        }
        Runnable action = myDynMenu.getActionFor(item);
        if(action != null) {
            action.run();
        } else {
            System.out.println("Oops... no such menu item exists!");
        }
    }


    // close scanner
    in.close();
  };

  public static void main (String args[]) {
    DynamicMenuTest x = new DynamicMenuTest();
    x.testDynamicMenu2();
  }

}