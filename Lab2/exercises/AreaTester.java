import java.awt.Rectangle;

/**
 * @author samus250
 * Exercise P2.1: This program creates a rectangle object and calculates it's area using the
 * getWidth() and getHeight() methods. It also prints the expected value.
 *
 */
public class AreaTester {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(0, 0, 100, 100);
    double area = r1.getWidth() * r1.getHeight();

    System.out.println("The expected area is 10000");
    System.out.printf("The area is %f", area);
  }
}
