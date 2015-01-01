import edu.uprm.ece.icom4015.p3.photo.PixelObject;
import junit.framework.TestCase;

public class PixelObjectTest extends TestCase {

  public void testPixelObject() {
    PixelObject pixel = new PixelObject();

    assertTrue(pixel.getRed() == 0 && pixel.getBlue() == 0 && pixel.getGreen() == 0
        && pixel.getRGB() == 0);
  }

  public void testPixelObjectInt() {
    PixelObject pixel = new PixelObject(0xC9BE62);

    assertTrue(pixel.getRed() == 0xC9 && pixel.getBlue() == 0x62 && pixel.getGreen() == 0xBE
        && pixel.getRGB() == 0xC9BE62);
  }

  public void testGetRed() {
    PixelObject pixel = new PixelObject();
    assertTrue(pixel.getRed() == 0);

    pixel = new PixelObject(0xC9BE62);
    assertTrue(pixel.getRed() == 0xC9);
  }

  public void testGetBlue() {
    PixelObject pixel = new PixelObject();
    assertTrue(pixel.getBlue() == 0);

    pixel = new PixelObject(0xC9BE62);
    assertTrue(pixel.getBlue() == 0x62);
  }

  public void testGetGreen() {
    PixelObject pixel = new PixelObject();
    assertTrue(pixel.getGreen() == 0);

    pixel = new PixelObject(0xC9BE62);
    assertTrue(pixel.getGreen() == 0xBE);
  }

  public void testGetRGB() {
    PixelObject pixel = new PixelObject();
    assertTrue(pixel.getRGB() == 0);

    pixel = new PixelObject(0xC9BE62);
    assertTrue(pixel.getRGB() == 0xC9BE62);
  }

  public void testCopy() {
    PixelObject pixel = new PixelObject();
    PixelObject pixel2 = (PixelObject) pixel.copy();
    assertTrue(pixel.equals(pixel2));

    PixelObject pixel3 = new PixelObject(0xC9BE62);
    PixelObject pixel4 = (PixelObject) pixel3.copy();
    assertTrue(pixel3.equals(pixel4));
  }

  public void testFromRGB() {
    PixelObject pixel = new PixelObject();
    PixelObject pixel2 = (PixelObject) pixel.fromRGB(0xC9BE62);
    assertTrue(pixel2.getRGB() == 0xC9BE62);
  }

  public void testToString() {
    PixelObject pixel = new PixelObject();
    assertTrue(pixel.toString().equals("(0, 0, 0)"));

    PixelObject pixel2 = new PixelObject(0xC9BE62);
    assertTrue(pixel2.toString().equals("(201, 190, 98)"));
  }

}
