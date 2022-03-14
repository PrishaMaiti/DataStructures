// Challenge 1: Dynamic Menu
package MyUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.RunnableFuture;
import java.util.ArrayList;
import java.util.Set;

public class DynamicMenu {
  String title;
  HashMap<String, Runnable> menuMap; // menuitem -> action

  public DynamicMenu(String title) {
    menuMap = new HashMap<>();
    this.title = title;
  }

  public String getTitle() {
    return this.title;
  }

  public void add(String item, Runnable action) {
    this.menuMap.put(item, action);
  }

  public void remove(String item) {
    this.menuMap.remove(item);
  }

  public Set<String> getAllMenuItems() {
    return this.menuMap.keySet();
  }

  public void removeAll() {
    this.menuMap.clear();
  }

  public void printAllItems() {
    System.out.println(this.menuMap.keySet());
  }

  public Runnable getActionFor(String item) {
    return this.menuMap.get(item);
  }
}