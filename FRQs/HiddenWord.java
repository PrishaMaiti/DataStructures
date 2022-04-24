package FRQs;
import java.util.Scanner;

public class HiddenWord {
    String hiddenWord;
    public HiddenWord(String h) {
        this.hiddenWord = h;
    }

    // user will guess a 5 letter word, and we will return
    // string showing the exactly matching position character along with *s for incorrecct places
    // If hiddenword = HEART, and user guesses HARPS, we should show
    // H****
    public String getHint(String guess) {
        StringBuilder hint = new StringBuilder(guess);
        char c;
        for(int i = 0; i < guess.length(); i++) {
            if(guess.charAt(i) == hiddenWord.charAt(i)) {
                hint.setCharAt(i, guess.charAt(i));
            } else {
                hint.setCharAt(i, '*');
            }
        }
        System.out.println(hint); // debug
        return new String(hint);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5-letter word: ");
        String original = sc.nextLine();
        HiddenWord hiddenWord = new HiddenWord("HEART");
        hiddenWord.getHint("HARPS");
        sc.close();
    }
}
