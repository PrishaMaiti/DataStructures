package FRQs;
import java.util.Scanner;
public class HiddenWordTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5-letter word: ");
        String original = sc.nextLine();
        HiddenWord hiddenWord = new HiddenWord("HEART");
        hiddenWord.getHint("HARPS");
    }
}
