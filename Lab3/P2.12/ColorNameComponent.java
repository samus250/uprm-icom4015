import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * This class extends JComponent and draws 12 colored strings using the
 * paintComponent method.
 *
 * @author samus250
 *
 */
public class ColorNameComponent extends JComponent {

  @Override
  public void paintComponent(Graphics g) {
    Color[] colors = { Color.black, Color.darkGray, Color.gray, Color.lightGray, Color.cyan,
      Color.pink, Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.magenta };

    // Cast to 2D graphics object
    Graphics2D g2 = (Graphics2D) g;

    // draw all strings
    for (int i = 0; i < colors.length; i++) {
      g2.setColor(colors[i]);
      g2.drawString("String " + (i + 1), 5, 15 * (i + 1));
    }
  }

}
