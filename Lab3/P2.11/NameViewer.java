import javax.swing.JFrame;

/**
 * This class contains the main class to view my name on the frame.
 *
 * @author samus250
 *
 */
public class NameViewer {

  /**
   * This is the main class that crates the frame and the component object and
   * adds it to the frame.
   *
   * @param args
   */
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(200, 100);
    frame.setTitle("My Name");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    NameComponent component = new NameComponent();

    frame.add(component);
    frame.setVisible(true);

  }

}
