public class Car {
  /**
   * The amount of gas in gallons.
   */
  private double gas;

  /**
   * The amount gas in gallons used per mile traveled.
   */
  private double gasEfficiency;

  /**
   * The total miles traveled.
   */
  private double odometer;

  /**
   * @param gasEfficiency
   */
  public Car(double gasEfficiency) {
    this(gasEfficiency, 0.0);
  }

  /**
   * @param gasEfficiency
   * @param gas
   */
  public Car(double gasEfficiency, double gas) {
    this.gas = gas;
    this.gasEfficiency = gasEfficiency;
    this.odometer = 0.0;
  }

  /**
   * Drive the car the number of miles given. Decreases the gas by the amount
   * needed to travel and increases the odometer by the number of miles
   * traveled.
   * 
   * @param miles
   * @return the number of miles driven.
   */
  public double drive(double miles) {
    double milesDriven = Math.min(range(), miles);

    odometer += milesDriven;
    gas -= milesDriven / gasEfficiency;

    return milesDriven;
  }

  /**
   * Adds gas to the car.
   * 
   * @param newGas
   * @return the new total amount of gas in the tank.
   */
  public double addGas(double newGas) {
    gas += newGas;
    return gas;

  }

  /**
   * Calculates the maximum number of miles the car can travel, given the amount
   * of gas in the tank.
   * 
   * @return the range
   */
  public double range() {
    return gas * gasEfficiency;
  }

  /**
   * @return the gas
   */
  public double getGas() {
    return gas;
  }

  /**
   * @return the gasEfficiency
   */
  public double getGasEfficiency() {
    return gasEfficiency;
  }

  /**
   * @return the odometer
   */
  public double getOdometer() {
    return odometer;
  }

}
