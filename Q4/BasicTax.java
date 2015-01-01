public class BasicTax {
  private boolean married;
  private double salary;

  public BasicTax(final boolean married, double salary) {
    super();
    this.married = married;
    this.salary = salary;
  }

  public boolean isMarried() {
    return married;
  }

  public void setMarried(boolean married) {
    this.married = married;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double baseTax() {
    if (this.married) {
      if (this.salary > 100000) {
        return 0.33 * salary;
      } else if (this.salary > 50000) {
        return 0.25 * salary;
      } else if (this.salary > 25000) {
        return 0.20 * salary;
      } else {
        return 0.15 * salary;
      }
    } else {
      if (this.salary > 75000) {
        return 0.33 * salary;
      } else if (this.salary > 45000) {
        return 0.25 * salary;
      } else if (this.salary > 20000) {
        return 0.20 * salary;
      } else {
        return 0.15 * this.salary;
      }
    }
  }
}
