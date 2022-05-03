public class GameSpinnerTester {
    public static void main(String[] args) {
        GameSpinner g = new GameSpinner(4);
        int i = 1;
        System.out.println(g.currentRun());
        System.out.println(g.spin());
        System.out.println(g.currentRun());
        System.out.println(g.spin());
        System.out.println(g.currentRun());
    }
}
