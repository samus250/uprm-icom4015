import javax.swing.JFrame;

/**
 * This class contains the main class to view two squares on the frame.
 *
 * @author samus250
 *
 */
public class TwoSquareViewer {

  /**
   * This is the main class that crates the frame and the component object and
   * adds it to the frame.
   *
   * @param args
   */
  public static void main(String[] args) {
    // Create the frame.
    JFrame frame = new JFrame();
    frame.setSize(400, 400);
    frame.setTitle("Two Squares");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TwoSquareComponent component = new TwoSquareComponent();
    frame.add(component);
    frame.setVisible(true);

  }

}
