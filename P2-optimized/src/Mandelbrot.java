import java.awt.Color;

/**
 * A Utility class that provides static methods for generating Mandelbrot sets.
 *
 * @author samus250
 *
 */
public class Mandelbrot {

  /**
   * Private constructor enforces that no instances will be created.
   */
  private Mandelbrot() {

  }

  /**
   * Checks if the given ComplexNumber diverges.
   *
   * @param C
   *          - The ComplexNumber to be evaluated.
   * @return boolean - true if the ComplexNumber C diverges, false otherwise.
   */
  public static boolean diverges(ComplexNumber C) {
    final int N = 256;
    final int normLimit = 2;
    int i;

    // set Z = Z0
    ComplexNumber Z = new ComplexNumber(C.getRealPart(), C.getImaginaryPart());

    // iterate
    for (i = 1; i <= N; i++) {
      ComplexNumber Z2 = Z.multiply(Z).add(C);
      Z = Z2.add(C);

      if (Z.norm().getValue() >= normLimit) {
        return true;
      }
    }

    return false;
  }

  /**
   * Returns the index of divergence of the given ComplexNumber C.
   *
   * @param C
   *          - The ComplexNumber to be evaluated.
   * @return int - The divergence index i (0 <= i <= 256), returns -1 if C
   *         converges.
   */
  public static int divergenceIndex(ComplexNumber C) {
    final int N = 256;
    final int normLimit = 2;
    int i;

    // set Z = Z0
    ComplexNumber Z = new ComplexNumber(C.getRealPart(), C.getImaginaryPart());

    // iterate
    for (i = 1; i <= N; i++) {
      ComplexNumber Z2 = Z.multiply(Z);
      Z = Z2.add(C);

      if (Z.norm().getValue() >= normLimit) {
        return i;
      }
    }

    return -1;
  }

  /**
   * Returns an appropriate color from a given divergence index.
   *
   * @param colorIndex
   *          - The divergence index of the ComplexNumber from the pixel to be
   *          colored.
   * @return A Color object with the appropriate color for coloring the pixel.
   */
  public static Color getColor(int colorIndex) {
    Color[] colors = { Color.blue.brighter(), Color.blue, Color.cyan, Color.green.brighter(),
      Color.green, Color.yellow.brighter(), Color.yellow, Color.orange.brighter(), Color.orange,
      Color.pink, Color.pink.darker(), Color.magenta, Color.red.brighter(), Color.red };

    return colors[colorIndex % colors.length];
  }
}
