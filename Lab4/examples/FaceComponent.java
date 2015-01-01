import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class FaceComponent extends JComponent {
  private Face face;

  public FaceComponent(Face face) {
    this.face = face;
  }

  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    face.draw(g2);

  }
}
