public class GameSpinnerTester {
    public static void main(String[] args) {
        GameSpinner g = new GameSpinner(4);
        int i = 1;
        Debug.print(g.currentRun());
        Debug.print(g.spin());
        Debug.print(g.currentRun());
        Debug.print(g.spin());
        Debug.print(g.currentRun());
    }
}
