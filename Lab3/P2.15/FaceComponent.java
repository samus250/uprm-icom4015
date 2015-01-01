import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

/**
 * This class extends JComponent and draws a face using the paintComponent
 * method.
 *
 * @author samus250
 *
 */
public class FaceComponent extends JComponent {

  @Override
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    // draw head
    Ellipse2D.Double head = new Ellipse2D.Double(20, 20, 75, 75);
    g2.setColor(Color.blue);
    g2.draw(head);

    // draw eyes
    Ellipse2D.Double eye1 = new Ellipse2D.Double(37, 44, 7, 7);
    g2.draw(eye1);

    Ellipse2D.Double eye2 = new Ellipse2D.Double(69, 44, 7, 7);
    g2.draw(eye2);

    // draw mouth
    Line2D.Double mouth = new Line2D.Double(37, 75, 76, 75);
    g2.draw(mouth);

  }
}
