import static org.junit.Assert.*;

import org.junit.Test;

public class AlgebraTest {

  @Test
  public void testMultiProduct() {
    assertTrue(Algebra.multiProduct(2, 10, 5) - 100.0 < Algebra.EPSILON);
    assertTrue(Algebra.multiProduct(3.2, -8, 1.1) + 145.454545 < Algebra.EPSILON);
    assertTrue(Algebra.multiProduct(-2, 4, 4) + 4.0 < Algebra.EPSILON);

  }

}
