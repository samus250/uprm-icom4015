/**
 * @author samus250
 * This contains the JUnit test cases for the LetterCounter class, the only method to test is
 * LetterCounter.doCount.
 */

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class test_LetterCounter {

  /**
   * Test method for {@link LetterCounter#doCount(java.lang.String)}.
   */
  @Test
  public void testDoCount() {
    LetterCounter l = new LetterCounter();
    String w = "abracadabra";

    // test every letter
    assertTrue(l.doCount(w) == 5);

    l.setLetter('b');
    assertTrue(l.doCount(w) == 2);

    l.setLetter('c');
    assertTrue(l.doCount(w) == 1);

    l.setLetter('d');
    assertTrue(l.doCount(w) == 1);

    l.setLetter('r');
    assertTrue(l.doCount(w) == 2);
  }

}
