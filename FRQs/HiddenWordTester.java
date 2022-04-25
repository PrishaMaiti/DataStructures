
public class HiddenWordTester {

    static void testCase1() {
        HiddenWord hiddenWord = new HiddenWord("HEART");
        System.out.println(hiddenWord.getHint("HARPS"));
        System.out.println(hiddenWord.getHint("HXXXT"));
        System.out.println(hiddenWord.getHint("SWORD"));
        System.out.println(hiddenWord.getHint("MEANS"));
        System.out.println(hiddenWord.getHint("HEART"));
        System.out.println(hiddenWord.getHint("ABCDE"));
        //hiddenWord.getHint("ABCDEFGH");
    }
    public static void main(String[] args) {
        testCase1();
    }
}
