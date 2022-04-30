public class GameSpinner {
    int numSectors;
    int numSpins;
    int currentRun = 0;

    public GameSpinner(int numSectors) {
        this.numSectors = numSectors;
    }
    public int spin() {
        this.numSpins = (int) (Math.random() * 5);
        currentRun++;
        return numSpins;
    }
    public int currentRun() {
        return currentRun;
    }
}
