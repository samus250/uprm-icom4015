import javax.swing.JFrame;

public class FaceViewer {

  /**
   * @param args
   */
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(300, 400);
    frame.setTitle("Testing new components");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Face f = new Face(150, 120);

    f.setX(150);
    f.setY(120);
    f.setEyeHeight(40.0);
    f.setEyeSeparation(10.0);
    f.setMouthHeight(10);

    FaceComponent component = new FaceComponent(f);

    frame.add(component);

    frame.setVisible(true);
  }

}
