/**
 * This class Represents a Real Number.
 *
 * @author samus250
 *
 */
public class RealNumber {
  private double value;

  /**
   * Constructs a RealNumber with value 0.0.
   */
  public RealNumber() {
    this.value = 0;
  }

  /**
   * Constructs a RealNumber from a given primitive double.
   *
   * @param n
   *          - Value of the number.
   */
  public RealNumber(double n) {
    this.value = n;
  }

  /**
   * Constructs a RealNumber from a given RealNumber.
   *
   * @param R
   *          - RealNumber object.
   */
  public RealNumber(RealNumber R) {
    this.value = R.value;
  }

  /**
   * Returns a double with the value of this RealNumber.
   *
   * @return double - Value of this RealNumber.
   */
  public double getValue() {
    return value;
  }

  /**
   * Sets the value of this RealNumber.
   *
   * @param value
   *          - The desired value of this RealNumber.
   */
  public void setValue(double value) {
    this.value = value;
  }

  /**
   * Returns a new RealNumber object with the absolute value of this RealNumber.
   *
   * @return A new RealNumber object with the absolute value of this RealNumber.
   */
  public RealNumber absoluteValue() {
    if (this.value < 0) {
      return new RealNumber(-this.value);
    }
    else {
      return new RealNumber(this.value);
    // be sure you should not return the same object (return this)
    }
  }

  /**
   * Adds a given RealNumber with this RealNumber.
   *
   * @param R
   *          - RealNumber to be added to this.
   * @return a new RealNumber with the sum of R and this.
   */
  public RealNumber add(RealNumber R) {
    return new RealNumber(this.value + R.value);
  }

  /**
   * Multiplies this with a given RealNumber.
   *
   * @param R
   *          The RealNumber to be multiplied with this.
   * @return The product of R and this.
   */
  public RealNumber multiply(RealNumber R) {
    return new RealNumber(this.value * R.value);
  }

  /**
   * Subtracts a given RealNumber from this.
   *
   * @param R
   *          The RealNumber to be subtracted from this.
   * @return The difference of this minus R.
   */
  public RealNumber subtract(RealNumber R) {
    return new RealNumber(this.value - R.value);
  }

  /**
   * Divides this with a given RealNumber divisor.
   *
   * @param R
   *          - The RealNumber divisor.
   * @return The result of dividing this with R.
   */
  public RealNumber divide(RealNumber R) {
    return new RealNumber(this.value / R.value);
  }

  /**
   * Returns the square root of this RealNumber.
   *
   * @return The square root of this.
   */
  public RealNumber sqrt() {
    return new RealNumber(Math.sqrt(this.value));
  }

  /**
   * Returns the square of this RealNumber.
   *
   * @return The square of this RealNumber.
   */
  public RealNumber sqr() {
    return new RealNumber(this.value * this.value);
  }

  /**
   * Determines if this RealNumber is equal to a given RealNumber.
   *
   * @param R
   *          - The RealNumber to be compared with this.
   * @return boolean - true if this is equal to R, false otherwise.
   */
  public boolean equals(RealNumber R) {
    return this.value == R.value;
  }

  /**
   * Compares a given RealNumber to this.
   *
   * @param R
   *          The RealNumber to be compared to this.
   * @return 0 if the numbers are equal, 1 if this is greater than R, -1 if this
   *         is less than R.
   */
  public int compareTo(RealNumber R) {
    if (this.equals(R)) {
      return 0;
    } else if (this.value > R.value) {
      return 1;
    } else {
      return -1;
    }
  }

  /**
   * Returns a String representation of this RealNumber.
   *
   * @return A String representation of this RealNumber.
   */
  @Override
  public String toString() {
    return "" + this.value;
  }

}
