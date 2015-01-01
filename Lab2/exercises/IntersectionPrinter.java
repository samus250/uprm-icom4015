import java.awt.Rectangle;

/**
 * @author samus 250
 * Exercise P2.4: This program constructs two Rectangle objects, calculates and prints their
 * intersection. It then calculates and prints the intersection of two rectangles that do not
 * overlap.
 */
public class IntersectionPrinter {

  public static void main(String[] args) {
    // Rectangles that intersect.
    Rectangle r1 = new Rectangle(0, 0, 100, 100);
    Rectangle r2 = new Rectangle(25, 25, 100, 100);

    System.out.println("r1.intersects(r2) = " + r1.intersects(r2));
    System.out.println("Intersection of r1 and r2 is " + r1.intersection(r2) + "\n");

    // Rectangles that are very far apart and do not intersect.
    Rectangle r3 = new Rectangle(100, 100, 25, 25);
    Rectangle r4 = new Rectangle(0, 0, 25, 25);

    System.out.println("r3.intersects(r4) = " + r3.intersects(r4));
    System.out.println("Intersection of r3 and r4 is " + r3.intersection(r4));

  }

}
