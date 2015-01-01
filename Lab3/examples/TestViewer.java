import javax.swing.JFrame;

public class TestViewer {

  /**
   * @param args
   */
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(300, 400);
    frame.setTitle("An Alien Face");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TestComponent component = new TestComponent();

    frame.add(component);

    frame.setVisible(true);
  }

}
