/**
 * @author samus250
 * This is the LetterCounter class. It includes a method that counts occurrences of this.letter in a
 * given string.
 */

public class LetterCounter {
  private char letter;

  // Defaults to 'a'
  public LetterCounter() {
    this.letter = 'a';

  }

  public LetterCounter(char l) {
    this.letter = l;
  }

  public char getLetter() {
    return this.letter;
  }

  // Setter is used primarily for JUnit test cases
  public void setLetter(char l) {
    this.letter = l;
  }

  // Counts occurrences of this.letter in word w
  public int doCount(String w) {
    int c = 0;
    for (int i = 0; i < w.length(); i++) {
      if (w.charAt(i) == this.letter) {
        c++;
      }
    }
    return c;

  }
}
