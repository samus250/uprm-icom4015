public class Dome {
  private double h, d;
  static final double PI = 3.1416;

  // constructor
  public Dome(double h, double d) {
    this.h = h;
    this.d = d;
  }

  // getters
  public double getHeight() {
    return this.h;
  }

  public double getDiameter() {
    return this.d;
  }

  // setters
  public void setHeight(double h) {
    this.h = h;
  }

  public void setDiameter(double d) {
    this.h = d;
  }

  public double radius() {
    return (this.h * this.h + (this.d / 2) * (this.d / 2)) / (2 * this.h);
  }

  public double area() {
    return 2 * PI * this.radius() * this.h;
  }

  public double volume() {
    return PI * this.radius() * this.h * this.h - (PI * this.h * this.h * this.h) / 3;
  }

  public String toString() {
    return "D<" + this.d + ", " + this.h + ">";
  }
}
