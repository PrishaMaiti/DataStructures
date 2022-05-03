import java.util.*;
// Challenge 1: Dynamic Menu
public class DynamicMenu {
    String title;
    Runnable action;

    public DynamicMenu(String title, Runnable action) {
        this.title = title;
        this.action = action;
    }

    public String getTitle() {
        return this.title;
    }

    public Runnable getAction() {
        return this.action;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      Map<Integer, DynamicMenu> menu = new HashMap<>();

      menu.put(1, new DynamicMenu("Swap Two Numbers", () -> SwapObjects.main(null) ) );
      menu.put(2, new DynamicMenu("Matrix", () -> Matrix.main(null) ) );
      menu.put(3, new DynamicMenu("Queue", () -> QueueTester.main(null)));
      menu.put(4, new DynamicMenu("Stack to Reverse Queue", () -> StackTester.main(null) ) );
      menu.put(5, new DynamicMenu("Calculator Using Stack", () -> CalculatorTester.main(null)));
      menu.put(6, new DynamicMenu("Bubble Sort", () -> BubbleSort.main(null)));
      menu.put(7, new DynamicMenu("Selection Sort", () -> SelectionSort.main(null)));
      menu.put(8, new DynamicMenu("Insertion Sort", () -> InsertionSort.main(null)));
      menu.put(9, new DynamicMenu("Merge Sort", () -> MergeSort.main(null)));
      menu.put(10, new DynamicMenu("Diverse Array", () -> DiverseArrayTester.main(null)));
      menu.put(11, new DynamicMenu("Hidden Word", () -> HiddenWordTester.main(null)));
      menu.put(12, new DynamicMenu("Interfaces", () -> MultipleGroupsTester.main(null)));
      menu.put(13, new DynamicMenu("Game Spinner", () -> GameSpinnerTester.main(null)));
      menu.put(14, new DynamicMenu("Review Collector", () -> ReviewCollectorTester.main(null)));

      System.out.println("Menu:");
      for (Map.Entry<Integer, DynamicMenu> pair : menu.entrySet()) {
      System.out.println(pair.getKey() + " ==> " + pair.getValue().getTitle());
      }
  
      int input = sc.nextInt();
      try {
        if (input == 0) {
          return;
        }
        DynamicMenu m = menu.get(input);
        m.getAction().run();
      }
      catch(Exception e) {
        System.out.println("Please enter a number listed in the menu.");
      }
      main(null);
  }
}