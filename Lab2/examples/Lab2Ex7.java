import java.awt.Rectangle;

public class Lab2Ex7 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Rectangle[] rectArray;

    rectArray = new Rectangle[3];
    rectArray[0] = new Rectangle();
    rectArray[1] = new Rectangle(10, 20, 30, 40);
    rectArray[2] = new Rectangle(110, 120, 130, 140);

    System.out.println("rectArray as " + rectArray.length + " elements.");
    System.out.println("rectArray[0] = " + rectArray[0]);
    System.out.println("rectArray[1] = " + rectArray[1]);
    System.out.println("rectArray[2] = " + rectArray[2]);
  }
}
