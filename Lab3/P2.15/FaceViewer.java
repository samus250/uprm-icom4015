import javax.swing.JFrame;

/**
 * This class contains the main class to view a face on the frame.
 *
 * @author samus250
 *
 */
public class FaceViewer {

  /**
   * This is the main class that crates the frame and the component object and adds it to the frame.
   *
   * @param args
   */
  public static void main(String[] args) {
    // create frame object
    JFrame frame = new JFrame();
    frame.setSize(400, 400);
    frame.setTitle("Face");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // create component object
    FaceComponent component = new FaceComponent();
    frame.add(component);
    frame.setVisible(true);

  }

}
