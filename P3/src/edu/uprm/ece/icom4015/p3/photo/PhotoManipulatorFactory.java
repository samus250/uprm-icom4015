package edu.uprm.ece.icom4015.p3.photo;

/**
 * This class creates a new instance of a PhotoManipulatorObject
 *
 * @author samus250
 *
 */
public class PhotoManipulatorFactory {
  /**
   * Returns a new instance of a PhotoManipulatorObject
   *
   * @return a new PhotoManipulatorObject
   */
  public static PhotoManipulator newInstance() {
    return new PhotoManipulatorObject();
  }

}
