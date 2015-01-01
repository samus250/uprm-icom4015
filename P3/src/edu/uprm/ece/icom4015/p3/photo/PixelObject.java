package edu.uprm.ece.icom4015.p3.photo;

/**
 * This class represents a Pixel and it implements the Pixel interface.
 *
 * @author samus250
 *
 */
public class PixelObject implements Pixel {
  private int RGB;

  /**
   * Constructs an RGB{0, 0, 0} pixel.
   */
  public PixelObject() {
    // pixel {0, 0, 0}
    this.RGB = 0x0;
  }

  /**
   * Constructs an RGB pixel from given RGB value.
   *
   * @param RGB
   *          value.
   */
  public PixelObject(int RGB) {
    // constructor from RGB
    this.RGB = RGB;
  }

  /**
   * Returns the red color component.
   *
   * @return the red color component.
   */
  @Override
  public int getRed() {
    // byte 2, shift 16 bits
    return (this.RGB & 0xFF0000) >> 16;
  }

  /**
   * Returns the blue color component.
   *
   * @return the blue color component.
   */
  @Override
  public int getBlue() {
    // byte 0, no shift necessary
    return this.RGB & 0xFF;
  }

  /**
   * Returns the green color component.
   *
   * @return the green color component.
   */
  @Override
  public int getGreen() {
    // byte 1, shift 8 bits
    return (this.RGB & 0xFF00) >> 8;
  }

  /**
   * Get the RGB color combination for this pixel.
   *
   * @return the RGB value.
   */
  @Override
  public int getRGB() {
    return this.RGB;
  }

  /**
   * Returns true if the argument is a pixel equal to this pixel.
   *
   * @param Object
   *          parameter pixel for comparison.
   * @return true if both pixels have the same RBG values, false otherwise.
   */
  @Override
  public boolean equals(Object obj) {
    return this.RGB == ((PixelObject) obj).getRGB();
  }

  /**
   * Creates a new copy of this pixel.
   *
   * @return a new copy of the pixel.
   */
  @Override
  public Pixel copy() {
    return new PixelObject(this.RGB);
  }

  /**
   * Creates a new Pixel from an int representing the RGB value.
   *
   * @param the
   *          RGB value
   * @return a new pixel of based on the RGB value.
   */
  @Override
  public Pixel fromRGB(int rgb) {
    return new PixelObject(rgb);
  }

  /**
   * Returns the pixel as a string of the format: (R, G, B). For example: (3,
   * 12, 0).
   *
   * @return a string representation of the pixel with the format: (R, G, B).
   */
  @Override
  public String toString() {
    return "(" + this.getRed() + ", " + this.getGreen() + ", " + this.getBlue() + ")";
  }
}
