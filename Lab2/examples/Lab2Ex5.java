import java.awt.Rectangle;

public class Lab2Ex5 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(5, 15, 60, 45);
    Rectangle r2 = new Rectangle();

    System.out.println("r1 = " + r1);
    System.out.println("r2 = " + r2);

    r2 = r1;
    r2.translate(10, 15);

    System.out.println("r1 = " + r1);
    System.out.println("r2 = " + r2);
  }
}
