// Challenge 1: Dynamic Menu
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.RunnableFuture;
import MyUtils.DynamicMenuTest;
import MyUtils.SwapObjects;

public class Main {

    private static void testerMethod_dynamicMenu() {
      DynamicMenuTest x = new DynamicMenuTest();
      //x.testDynamicMenu2();
      x.testDynamicMenu();
    }
  
    public static void main(String[] args) {
      testerMethod_dynamicMenu();
      // SwapObjects.swapper(21, 16);
      // SwapObjects.swapper(16, 21);
      // SwapObjects.swapper(16, -1);
    }
}