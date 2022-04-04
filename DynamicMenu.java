// Challenge 1: Dynamic Menu
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.RunnableFuture;

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

        System.out.println("Menu:");
        for (Map.Entry<Integer, DynamicMenu> pair : menu.entrySet()) {
            System.out.println(pair.getKey() + " ==> " + pair.getValue().getTitle());
        }

        int input = sc.nextInt();
        DynamicMenu m = menu.get(input);
        m.getAction().run();
    }
}