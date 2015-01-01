import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 * This class extends JComponent and draws my name using the paintComponent
 * method.
 *
 * @author samus250
 *
 */
public class NameComponent extends JComponent {

  @Override
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    // Draw the containing rectangle
    Rectangle r = new Rectangle(20, 20, 150, 20);
    g2.setColor(Color.BLUE);
    g2.draw(r);

    // Draw my name
    g2.setColor(Color.RED);
    g2.drawString("Samuel Rodr�guez", 40, 35);
  }
}
