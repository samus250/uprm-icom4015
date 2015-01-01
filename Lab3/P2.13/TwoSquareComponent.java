import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 * This class extends JComponent and draws two squares using the paintComponent
 * method.
 *
 * @author samus250
 *
 */
public class TwoSquareComponent extends JComponent {

  @Override
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    g2.setColor(Color.pink);

    Rectangle r = new Rectangle(10, 10, 100, 100);
    g2.fill(r);

    Color c = new Color(127, 0, 127);
    g2.setColor(c);
    r.translate(140, 0);
    g2.fill(r);

  }
}
