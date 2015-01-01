package edu.uprm.ece.icom4015.p3.photo;

/**
 * This class represents a PhotoManipulator Object, It includes many methods for
 * Photo Manipulations.
 *
 * @author samus250
 *
 */
public class PhotoManipulatorObject implements PhotoManipulator {

  /**
   * Creates a new instance of a PhotoManipulatorObject
   */
  public PhotoManipulatorObject() {

  }

  /**
   * Creates a new empty photo with given width and height.
   *
   * @param width
   *          photo width
   * @param height
   *          photo height
   * @return new empty photo with given width and height.
   */
  @Override
  public Photo newPhoto(int width, int height) {
    return PhotoFactory.newInstance(width, height);
  }

  /**
   * Creates a new, independent copy of the parameter photo. This method
   * performs a deep copy of the photo, meaning that all pixel as independent
   * copies of the pixels in the original photo.
   *
   * @param thePhoto
   *          the photo to be copied
   * @return the new, independent copy of the original.
   */
  @Override
  public Photo copy(Photo thePhoto) {
    int width = thePhoto.getWidth();
    int height = thePhoto.getHeight();
    Photo result = PhotoFactory.newInstance(width, height);

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        result.setPixel(i, j, thePhoto.getPixel(i, j));
      }
    }

    return result;
  }

  /**
   * Returns a new photo that is a copy of the original but with only the red
   * channel visible in all pixels. The remaining channels are set to 0.
   *
   * @param thePhoto
   *          the photo to be copied.
   * @return new photo that is a copy of the original but with only the red
   *         channel visible
   */
  @Override
  public Photo isolateRed(Photo thePhoto) {
    int width = thePhoto.getWidth();
    int height = thePhoto.getHeight();
    Photo result = PhotoFactory.newInstance(width, height);

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        // extract red part
        int red = thePhoto.getPixel(i, j).getRed();

        // shift 16 bits, move to byte 2
        red <<= 16;

        // store result
        result.setPixel(i, j, PixelFactory.newInstance().fromRGB(red));
      }
    }
    return result;
  }

  /**
   * Returns a new photo that is a copy of the original but with only the green
   * channel visible in all pixels. The remaining channels are set to 0.
   *
   * @param thePhoto
   *          the photo to be copied.
   * @return new photo that is a copy of the original but with only the green
   *         channel visible
   */
  @Override
  public Photo isolateGreen(Photo thePhoto) {
    int width = thePhoto.getWidth();
    int height = thePhoto.getHeight();
    Photo result = PhotoFactory.newInstance(width, height);

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        // extract green part
        int green = thePhoto.getPixel(i, j).getGreen();

        // shift 8 bits, move to byte 1
        green <<= 8;

        // store result
        result.setPixel(i, j, PixelFactory.newInstance().fromRGB(green));
      }
    }
    return result;
  }

  /**
   * Returns a new photo that is a copy of the original but with only the blue
   * channel visible in all pixels. The remaining channels are set to 0.
   *
   * @param thePhoto
   *          the photo to be copied.
   * @return new photo that is a copy of the original but with only the blue
   *         channel visible
   */
  @Override
  public Photo isolateBlue(Photo thePhoto) {
    int width = thePhoto.getWidth();
    int height = thePhoto.getHeight();
    Photo result = PhotoFactory.newInstance(width, height);

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        // extract blue part
        int blue = thePhoto.getPixel(i, j).getBlue();

        // store result
        result.setPixel(i, j, PixelFactory.newInstance().fromRGB(blue));
      }
    }
    return result;
  }

  /**
   * Returns a new photo that is a copy of the original but in gray scale. To
   * set gray scale you need to take the average of the red, green, and blue
   * channels of the corresponding pixel in the parameter photo, and set all
   * three levels for the pixel in the new photo equal to this value. You need
   * to round down the averages.
   *
   * @param thePhoto
   *          the photo to be copied.
   * @return new photo that is a copy of the original but in gray scale.
   */
  @Override
  public Photo grayScale(Photo thePhoto) {
    int width = thePhoto.getWidth();
    int height = thePhoto.getHeight();
    Photo result = PhotoFactory.newInstance(width, height);

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        // extract parts
        int sum = thePhoto.getPixel(i, j).getRed();
        sum += thePhoto.getPixel(i, j).getGreen();
        sum += thePhoto.getPixel(i, j).getBlue();

        // calculate average
        int avg = sum / 3;

        // populate RGB int
        int rgb = (avg << 16) + (avg << 8) + avg;

        // store result
        result.setPixel(i, j, PixelFactory.newInstance().fromRGB(rgb));
      }
    }
    return result;
  }

  /**
   * Returns a new photo that is a copy of the original but with black lines
   * horizontally interleaved with the original image. The first 10 rows look
   * like the original, the next 10 rows are all black, and so on. To create the
   * black pixels, set all three of the red, green and blue channels to 0.
   *
   * @param thePhoto
   *          the photo to be copied.
   * @return new photo that is a copy of the original but with horizontal black
   *         stripes.
   */
  @Override
  public Photo horizontalStripes(Photo thePhoto) {
    int width = thePhoto.getWidth();
    int height = thePhoto.getHeight();
    Photo result = PhotoFactory.newInstance(width, height);

    int color = 0;
    int counter = 0;
    boolean flag = false;

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {

        // if pixel is to be colored
        if (flag) {
          result.setPixel(j, i, PixelFactory.newInstance().fromRGB(color));
        } else {
          result.setPixel(j, i, thePhoto.getPixel(j, i));
        }
      }

      if (counter == 9) {
        flag = !flag;
        counter = 0;
      } else {
        counter++;
      }
    }

    return result;
  }

  /**
   * Returns a new photo that is a copy of the original but with black lines
   * vertically interleaved with the original image. The first 10 columns look
   * like the original, the next 10 columns are all black, and so on. To create
   * the black pixels, set all three of the red, green and blue channels to 0.
   *
   * @param thePhoto
   *          the photo to be copied.
   * @return new photo that is a copy of the original but with vertical black
   *         stripes.
   */
  @Override
  public Photo verticalStripes(Photo thePhoto) {
    int width = thePhoto.getWidth();
    int height = thePhoto.getHeight();
    Photo result = PhotoFactory.newInstance(width, height);

    int color = 0;
    int counter = 0;
    boolean flag = false;

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {

        // if pixel is to be colored
        if (flag) {
          result.setPixel(i, j, PixelFactory.newInstance().fromRGB(color));
        } else {
          result.setPixel(i, j, thePhoto.getPixel(i, j));
        }
      }

      if (counter == 9) {
        flag = !flag;
        counter = 0;
      } else {
        counter++;
      }
    }
    return result;
  }

  /**
   * Returns a new photo that is a copy of the original but rotated 90 degrees
   * clockwise.
   *
   * @param thePhoto
   *          the photo to be copied.
   * @return new photo that is a copy of the original but rotated 90 degrees
   *         clockwise.
   *
   */
  @Override
  public Photo rotate(Photo thePhoto) {
    int width = thePhoto.getWidth();
    int height = thePhoto.getHeight();

    // invert height and width dimensions
    Photo result = PhotoFactory.newInstance(height, width);

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        // counterclockwise
        // result.setPixel(j, width - i - 1, thePhoto.getPixel(i, j));
        // clockwise
        result.setPixel(height - j - 1, i, thePhoto.getPixel(i, j));
      }
    }

    return result;
  }

  /**
   * Returns a new photo that is a copy of the original but with twice the
   * width.
   *
   * @param thePhoto
   *          the photo to be copied.
   * @return new photo that is a copy of the original but with twice the width.
   *
   */
  @Override
  public Photo horizontalStretch(Photo thePhoto) {
    int width = thePhoto.getWidth();
    int height = thePhoto.getHeight();
    Photo result = PhotoFactory.newInstance(width * 2, height);

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        result.setPixel(i * 2, j, thePhoto.getPixel(i, j));
        result.setPixel(i * 2 + 1, j, thePhoto.getPixel(i, j));
      }
    }

    return result;
  }

  /**
   * Returns a new photo that is a copy of the original but with twice the
   * height.
   *
   * @param thePhoto
   *          the photo to be copied.
   * @return new photo that is a copy of the original but with twice the height.
   *
   */
  @Override
  public Photo verticalStretch(Photo thePhoto) {
    int width = thePhoto.getWidth();
    int height = thePhoto.getHeight();
    Photo result = PhotoFactory.newInstance(width, height * 2);

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        result.setPixel(i, j * 2, thePhoto.getPixel(i, j));
        result.setPixel(i, j * 2 + 1, thePhoto.getPixel(i, j));
      }
    }

    return result;
  }

  /**
   * Returns a new photo that is a copy of the original but with twice the width
   * and height.
   *
   * @param thePhoto
   *          the photo to be copied.
   * @return new photo that is a copy of the original but with twice the width
   *         and height.
   *
   */
  @Override
  public Photo enlarge(Photo thePhoto) {
    int width = thePhoto.getWidth();
    int height = thePhoto.getHeight();
    Photo result = PhotoFactory.newInstance(width * 2, height * 2);

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        result.setPixel(i * 2, j * 2, thePhoto.getPixel(i, j));
        result.setPixel(i * 2, j * 2 + 1, thePhoto.getPixel(i, j));
        result.setPixel(i * 2 + 1, j * 2, thePhoto.getPixel(i, j));
        result.setPixel(i * 2 + 1, j * 2 + 1, thePhoto.getPixel(i, j));
      }
    }

    return result;
  }

}
