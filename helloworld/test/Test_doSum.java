import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Test_doSum {

  /**
   * Test method for {@link Summation#doSum()}.
   */
  @Test
  public void testDoSum() {
    Summation s = new Summation();
    s.sumUB = 2;
    assertTrue(s.doSum() == 3);
  }

}
