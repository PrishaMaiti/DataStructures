
public class HiddenWordTester {

    static void testCase1() {
        HiddenWord hiddenWord = new HiddenWord("HEART");
        hiddenWord.getHint("HARPS");
        hiddenWord.getHint("HXXXT");
        hiddenWord.getHint("SWORD");
        hiddenWord.getHint("MEANS");
        hiddenWord.getHint("HEART");
        hiddenWord.getHint("ABCDE");
        //hiddenWord.getHint("ABCDEFGH");
    }
    public static void main(String[] args) {
        testCase1();
    }
}
