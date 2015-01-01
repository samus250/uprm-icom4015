import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Face {
  private double x = 5.0;

  private double y = 10.0;

  private double headHeight = 150.0;

  private double headWidth = 100.0;

  private double eyeWidth = 20.0;

  private double eyeHeight = 20.0;

  private double eyeSeparation = 20.0;

  private double eyeLocation = 70.0;

  private double mouthHeight = 5.0;

  private double mouthWidth = 50.0;

  private double mouthLocation = 122.5;

  // Add Constructor as instructed

  /**
   * @param x
   * @param y
   */
  public Face(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * @param x
   * @param y
   * @param headHeight
   * @param headWidth
   */
  public Face(double x, double y, double headHeight, double headWidth) {
    this.x = x;
    this.y = y;
    this.headHeight = headHeight;
    this.headWidth = headWidth;
  }

  /**
   * @return the x
   */
  public double getX() {
    return x;
  }

  /**
   * @param x
   *          the x to set
   */
  public void setX(double x) {
    this.x = x;
  }

  /**
   * @return the y
   */
  public double getY() {
    return y;
  }

  /**
   * @param y
   *          the y to set
   */
  public void setY(double y) {
    this.y = y;
  }

  /**
   * @return the headHeight
   */
  public double getHeadHeight() {
    return headHeight;
  }

  /**
   * @param headHeight
   *          the headHeight to set
   */
  public void setHeadHeight(double headHeight) {
    this.headHeight = headHeight;
  }

  /**
   * @return the headWidth
   */
  public double getHeadWidth() {
    return headWidth;
  }

  /**
   * @param headWidth
   *          the headWidth to set
   */
  public void setHeadWidth(double headWidth) {
    this.headWidth = headWidth;
  }

  /**
   * @return the eyeWidth
   */
  public double getEyeWidth() {
    return eyeWidth;
  }

  /**
   * @param eyeWidth
   *          the eyeWidth to set
   */
  public void setEyeWidth(double eyeWidth) {
    this.eyeWidth = eyeWidth;
  }

  /**
   * @return the eyeHeight
   */
  public double getEyeHeight() {
    return eyeHeight;
  }

  /**
   * @param eyeHeight
   *          the eyeHeight to set
   */
  public void setEyeHeight(double eyeHeight) {
    this.eyeHeight = eyeHeight;
  }

  /**
   * @return the eyeSeparation
   */
  public double getEyeSeparation() {
    return eyeSeparation;
  }

  /**
   * @param eyeSeparation
   *          the eyeSeparation to set
   */
  public void setEyeSeparation(double eyeSeparation) {
    this.eyeSeparation = eyeSeparation;
  }

  /**
   * @return the eyeLocation
   */
  public double getEyeLocation() {
    return eyeLocation;
  }

  /**
   * @param eyeLocation
   *          the eyeLocation to set
   */
  public void setEyeLocation(double eyeLocation) {
    this.eyeLocation = eyeLocation;
  }

  /**
   * @return the mouthHeight
   */
  public double getMouthHeight() {
    return mouthHeight;
  }

  /**
   * @param mouthHeight
   *          the mouthHeight to set
   */
  public void setMouthHeight(double mouthHeight) {
    this.mouthHeight = mouthHeight;
  }

  /**
   * @return the mouthWidth
   */
  public double getMouthWidth() {
    return mouthWidth;
  }

  /**
   * @param mouthWidth
   *          the mouthWidth to set
   */
  public void setMouthWidth(double mouthWidth) {
    this.mouthWidth = mouthWidth;
  }

  /**
   * @return the mouthLocation
   */
  public double getMouthLocation() {
    return mouthLocation;
  }

  /**
   * @param mouthLocation
   *          the mouthLocation to set
   */
  public void setMouthLocation(double mouthLocation) {
    this.mouthLocation = mouthLocation;
  }

  public void draw(Graphics2D g2) {
    g2.setColor(Color.BLACK);

    // Draw head
    Ellipse2D.Double head = new Ellipse2D.Double(x, y, headWidth, headHeight);
    g2.draw(head);

    // Draw eyes
    double x1 = x + headWidth / 2.0 - eyeSeparation / 2.0 - eyeWidth;
    double y1 = y + eyeLocation - eyeHeight / 2.0;
    double x2 = x1 + eyeWidth;
    double y2 = y1 + eyeHeight;
    Line2D.Double eye1 = new Line2D.Double(x1, y1, x2, y2);
    g2.draw(eye1);

    // Draw eyes
    x1 = x + headWidth / 2.0 + eyeSeparation / 2.0 + eyeWidth;
    x2 = x1 - eyeWidth;
    Line2D.Double eye2 = new Line2D.Double(x1, y1, x2, y2);
    g2.draw(eye2);

    // Draw mouth
    x1 = x + headWidth / 2.0 - mouthWidth / 2.0;
    y1 = y + mouthLocation - mouthHeight / 2.0;
    Rectangle2D.Double mouth = new Rectangle2D.Double(x1, y1, mouthWidth, mouthHeight);
    g2.setColor(Color.RED);
    g2.fill(mouth);

    // Draw the greeting
    g2.setColor(Color.BLUE);
    g2.drawString("Hello, World!", (int) x, (int) (y + headHeight + 20));
  }

}
