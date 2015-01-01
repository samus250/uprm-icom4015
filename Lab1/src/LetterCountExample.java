/**
 * @author samus250
 * This is the main class for LetterCounterExample that outputs an example of using the
 * LetterCounter.doCount method.
 */

public class LetterCountExample {
  public static void main(String[] args) {
    // The default value of LetterCounter object is 'a'.
    LetterCounter letter = new LetterCounter();
    String word = "abracadabra";

    System.out.printf("There are %d occurences of the letter %c in the word %s.\n",
        letter.doCount(word), letter.getLetter(), word);
  }
}
