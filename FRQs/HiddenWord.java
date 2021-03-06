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
        for(int i = 0; i < guess.length(); i++) {
            if(guess.charAt(i) == hiddenWord.charAt(i)) {
                hint.setCharAt(i, guess.charAt(i));
            } else {
                hint.setCharAt(i, '*');
            }
        }
        return new String(hint);
    }
}
