package MyUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import MyUtils.DynamicMenu;

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

  public void testDynamicMenu() {
      DynamicMenu myDynMenu = new DynamicMenu("Prisha");
      
      String item1 = "AA";
      Runnable action1 = new MyRunnableImpl1();
      myDynMenu.add(item1, action1);

      myDynMenu.printAllItems();

      myDynMenu.getActionFor(item1).run();

      String item2 = "BB";
      Runnable action2 = new MyRunnableImpl2();
      myDynMenu.add(item2, action2);

      myDynMenu.printAllItems();

      myDynMenu.getActionFor(item2).run();
      myDynMenu.getActionFor(item1).run();
  };

  public void testDynamicMenu2() {
    Scanner
  };

  public static void main (String args[]) {
    DynamicMenuTest x = new DynamicMenuTest();
    x.testDynamicMenu();
  }

}