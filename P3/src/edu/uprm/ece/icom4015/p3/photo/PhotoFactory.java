package edu.uprm.ece.icom4015.p3.photo;

/**
 * This class is used to create new instances of the Photo type using the
 * PhotoObject class.
 *
 * @author samus250
 *
 */
public class PhotoFactory {
  /**
   * Returns a new empty Photo with given width and height.
   *
   * @param width
   *          - The width of the empty Photo.
   * @param height
   *          - The height of the empty Photo.
   * @return The new Photo object.
   */
  public static Photo newInstance(int width, int height) {
    return new PhotoObject(width, height);
  }
}
