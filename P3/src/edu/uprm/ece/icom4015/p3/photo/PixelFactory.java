package edu.uprm.ece.icom4015.p3.photo;

/**
 * This class creates new instances of PixelObjects
 *
 * @author samus250
 *
 */
public class PixelFactory {
  /**
   * Returns a new pixel set to RGB (0,0,0)
   *
   * @return a new Pixel set to RGB (0,0,0)
   */
  public static Pixel newInstance() {
    return new PixelObject();
  }

}
