public class Algebra {
  public static final double EPSILON = 0.001;

  public static double multiProduct(double a, double t, double c) {

    if (a < 0) {
      return a * a + (a * t * t) / c;

    } else if (a > 0) {
      return (t * t * t) / (a * c);

    } else {
      return t * c * c;
    }
  }
}
