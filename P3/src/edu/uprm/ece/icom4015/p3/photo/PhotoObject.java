package edu.uprm.ece.icom4015.p3.photo;

public class PhotoObject implements Photo {
  private int width;
  private int height;
  private Pixel[][] pixels;

  /**
   * Creates an empty Photo with given width and height.
   * 
   * @param width
   *          - the width of the Photo.
   * @param height
   *          - the height of the Photo.
   */
  public PhotoObject(int width, int height) {
    this.width = width;
    this.height = height;
    this.pixels = new Pixel[width][height];
  }

  /**
   * Returns the Pixel at position (x, y) in the photo.
   * 
   * @param x
   *          - Horizontal coordinate.
   * @param y
   *          - Vertical coordinate.
   * @return the Pixel at position (x, y) in the photo.
   */
  public Pixel getPixel(int x, int y) {
    return pixels[x][y];
  }

  /**
   * Sets the Pixel at given position (x, y)
   * 
   * @param x
   *          - Horizontal coordinate.
   * @param y
   *          - Vertical coordinate.
   * @param P
   *          - The pixel to be set into the given position.
   */
  public void setPixel(int x, int y, Pixel P) {
    pixels[x][y] = P;
  }

  /**
   * Returns the width of the Photo.
   * 
   * @return Width of the Photo.
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the Photo.
   * 
   * @return Height of the Photo.
   */
  public int getHeight() {
    return this.height;
  }

}
