import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

/**
 * This class extends JComponent and draws an ellipse using the paintComponent
 * method.
 *
 * @author samus250
 *
 */
public class EllipseComponent extends JComponent {

  @Override
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    // create ellipse
    Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, this.getWidth(), this.getHeight());
    g2.draw(ellipse);
    g2.setColor(Color.blue);
    g2.fill(ellipse);

  }
}
