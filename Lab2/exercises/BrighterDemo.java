import java.awt.Color;

/**
 * @author samus250
 * Exercise P2.5: This programs constructs a Color object and prints the result of the brighter()
 * method.
 *
 */
public class BrighterDemo {

  public static void main(String[] args) {
    Color c = new Color(50, 100, 150);
    System.out.println("Brighter version of " + c + " is " + c.brighter() + ".");
  }
}
