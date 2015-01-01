import javax.swing.JFrame;

/**
 * This class contains the main class to view 12 colored strings on the frame.
 *
 * @author samus250
 *
 */
public class ColorNameViewer {

  /**
   * This is the main class that crates the frame and the component object and
   * adds it to the frame.
   *
   * @param args
   */
  public static void main(String[] args) {
    // create frame and set its values
    JFrame frame = new JFrame();
    frame.setSize(200, 220);
    frame.setTitle("12 Strings");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // create the component to be added to frame
    ColorNameComponent component = new ColorNameComponent();

    frame.add(component);
    frame.setVisible(true);

  }

}
