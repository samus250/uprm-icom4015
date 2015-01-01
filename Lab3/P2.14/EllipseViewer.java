import javax.swing.JFrame;

/**
 * This class contains the main class to view an Ellipse on the frame.
 *
 * @author samus250
 *
 */
public class EllipseViewer {

  /**
   * This is the main class that crates the frame and the component object and
   * adds it to the frame.
   *
   * @param args
   */
  public static void main(String[] args) {
    // create the frame
    JFrame frame = new JFrame();
    frame.setSize(515, 435);
    frame.setTitle("Ellipse");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // create the component object
    EllipseComponent component = new EllipseComponent();
    frame.add(component);
    frame.setVisible(true);

  }

}
