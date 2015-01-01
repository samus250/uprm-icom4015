/**
 * This class represents a Complex Number of the form x + yi.
 *
 * @author samus250
 *
 */
public class ComplexNumber {
  private RealNumber x;
  private RealNumber y;

  /**
   * Constructs a Complex Number 0 + 0i.
   */
  public ComplexNumber() {
    this.x = new RealNumber();
    this.y = new RealNumber();
  }

  /**
   * Constructs a Complex Number of the form x + yi with the given parameters.
   *
   * @param x
   *          - A RealNumber object, the real part of the Complex Number.
   * @param y
   *          - A RealNumber object, the imaginary part of the Complex Number.
   */
  public ComplexNumber(RealNumber x, RealNumber y) {
    this.x = new RealNumber(x);
    this.y = new RealNumber(y);
  }

  /**
   * Returns a RealNumber object with the real part of the Complex Number.
   *
   * @return a RealNumber object with the real part of the Complex Number.
   */
  public RealNumber getRealPart() {
    return this.x;
  }

  /**
   * Sets the real part of the Complex Number.
   *
   * @param x
   *          - A RealNumber with the real part of the Complex Number.
   */
  public void setRealPart(RealNumber x) {
    this.x = x;
  }

  /**
   * Returns a RealNumber object with the imaginary part of the Complex Number.
   *
   * @return a RealNumber object with the imaginary part of the Complex Number.
   */
  public RealNumber getImaginaryPart() {
    return this.y;
  }

  /**
   * Sets the imaginary part of the Complex Number.
   *
   * @param y
   *          - A Real Number with the imaginary part of the Complex Number.
   */
  public void setImaginaryPart(RealNumber y) {
    this.y = y;
  }

  /**
   * Adds a given ComplexNumber with this.
   *
   * @param C
   *          - ComplexNumber to be added.
   * @return A new ComplexNumber with the sum of C and this.
   */
  public ComplexNumber add(ComplexNumber C) {
    return new ComplexNumber(this.x.add(C.getRealPart()), this.y.add(C.getImaginaryPart()));
  }

  /**
   * Subtracts a given ComplexNumber with this.
   *
   * @param C
   *          - ComplexNumber to be subtracted from this.
   * @return A new ComplexNumber with the subtraction of C from this.
   */
  public ComplexNumber subtract(ComplexNumber C) {
    return new ComplexNumber(this.x.subtract(C.getRealPart()),
        this.y.subtract(C.getImaginaryPart()));
  }

  /**
   * Multiplies a given ComplexNumber with this.
   *
   * @param C
   *          - ComplexNumber to me multiplied.
   * @return A new ComplexNumber with the product of C and this.
   */
  public ComplexNumber multiply(ComplexNumber C) {
    RealNumber xa = this.x.multiply(C.getRealPart());
    RealNumber xb = this.x.multiply(C.getImaginaryPart());
    RealNumber by = C.getImaginaryPart().multiply(this.y);
    RealNumber ay = C.getRealPart().multiply(this.y);

    RealNumber X = xa.subtract(by);
    RealNumber Y = xb.add(ay);
    return new ComplexNumber(X, Y);
  }

  /**
   * Divides this with a given ComplexNumber.
   *
   * @param C
   *          - The divisor.
   * @return A new ComplexNumber with the result of this divided by C.
   */
  public ComplexNumber divide(ComplexNumber C) {
    RealNumber xa = this.x.multiply(C.getRealPart());
    RealNumber xb = this.x.multiply(C.getImaginaryPart());
    RealNumber yb = this.y.multiply(C.getImaginaryPart());
    RealNumber ya = this.y.multiply(C.getRealPart());

    RealNumber aa = C.getRealPart().sqr();
    RealNumber bb = C.getImaginaryPart().sqr();
    RealNumber a2b2 = aa.add(bb);

    RealNumber X1 = xa.add(yb);
    RealNumber X = X1.divide(a2b2);
    RealNumber Y1 = ya.subtract(xb);
    RealNumber Y = Y1.divide(a2b2);

    return new ComplexNumber(X, Y);
  }

  /**
   * Returns the norm (a RealNumber) of this ComplexNumber.
   *
   * @return - A RealNumber with the norm of this.
   */
  public RealNumber norm() {
    RealNumber x2 = this.x.sqr();
    RealNumber y2 = this.y.sqr();
    RealNumber x2y2 = x2.add(y2);

    return x2y2.sqrt();

  }

  /**
   * Returns a String representation of this ComplexNumber.
   *
   * @return - A String representation of this ComplexNumber.
   */
  @Override
  public String toString() {
    return this.x.toString() + " + " + this.y.toString() + "i";
  }

  /**
   * Compares a given ComplexNumber to this ComplexNumber.
   *
   * @param C
   *          - ComplexNumber to be compared to this.
   * @return boolean - true if C is equal to this, false otherwise.
   */
  public boolean equals(ComplexNumber C) {
    return this.x.equals(C.getRealPart()) && this.y.equals(C.getImaginaryPart());
  }
}
