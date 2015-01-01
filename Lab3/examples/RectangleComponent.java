import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 * A JComponent class that draws two rectangles
 */

/**
 * @author samus250
 *
 */
public class RectangleComponent extends JComponent {

  @Override
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    Rectangle r = new Rectangle(10, 20, 30, 40);

    g2.draw(r);

    r.translate(15, 25);

    g2.draw(r);
  }
}
