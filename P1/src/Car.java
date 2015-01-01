import java.io.PrintStream;

/**
 * This class represents a car.
 *
 * @author samus250
 *
 */
public class Car {

  private String make;
  private String model;
  private String year;
  private String registration;
  private int mileage;
  private double rentPrice;
  private boolean isLeased;
  private int daysLeased;

  /**
   * Constructs a Car object.
   *
   * @param make The make of the car.
   * @param model The model of the car.
   * @param year The year of the car.
   * @param registration The license plate registration of the car.
   * @param mileage The initial mileage in the car.
   * @param rentPrice The daily renting price of the car.
   */
  public Car(String make, String model, String year, String registration, int mileage,
      double rentPrice) {
    super();
    this.make = make;
    this.model = model;
    this.year = year;
    this.registration = registration;
    this.mileage = mileage;
    this.rentPrice = rentPrice;
  }

  /**
   * Returns the make of the car.
   *
   * @return The make of the car.
   */
  public String getMake() {
    return make;
  }

  /**
   * Sets the make of the car.
   *
   * @param make Make of the car.
   */
  public void setMake(String make) {
    this.make = make;
  }

  /**
   * Returns the model of the car.
   *
   * @return The model of the car.
   */
  public String getModel() {
    return model;
  }

  /**
   * Sets the model of the car.
   *
   * @param model Model of the car.
   */
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * Returns the year of the car.
   *
   * @return The year of the car.
   */
  public String getYear() {
    return year;
  }

  /**
   * Sets the year of the car.
   *
   * @param year Year of the car.
   */
  public void setYear(String year) {
    this.year = year;
  }

  /**
   * Returns the registration (license plate) of the car.
   *
   * @return The registration (license plate) of the car.
   */
  public String getRegistration() {
    return registration;
  }

  /**
   * Sets the registration (license plate) of the car.
   *
   * @param registration Registration (license plate) of the car.
   */
  public void setRegistration(String registration) {
    this.registration = registration;
  }

  /**
   * Returns the mileage of the car.
   *
   * @return Mileage of the car.
   */
  public int getMileage() {
    return mileage;
  }

  /**
   * Sets the mileage of the car.
   *
   * @param mileage Mileage of the car.
   */
  public void setMileage(int mileage) {
    this.mileage = mileage;
  }

  /**
   * Returns the daily rent price of the car.
   *
   * @return The daily rent price of the car.
   */
  public double getRentPrice() {
    return rentPrice;
  }

  /**
   * Sets the daily rent price of the car.
   *
   * @param rentPrice The daily rent price of the car.
   */
  public void setRentPrice(double rentPrice) {
    this.rentPrice = rentPrice;
  }

  /**
   * Returns true if the car is leased, false if it is not leased.
   *
   * @return true if the car is leased, false otherwise.
   */
  public boolean isLeased() {
    return isLeased;
  }

  /**
   * Sets the leasing status of the car
   *
   * @param isLeased Should be true if the car is leased, false otherwise.
   */
  public void setLeased(boolean isLeased) {
    this.isLeased = isLeased;
  }

  /**
   * Returns the number of days the car has been leased.
   *
   * @return The number of days the car has been leased.
   */
  public int getDaysLeased() {
    return daysLeased;
  }

  /**
   * Sets the number of days the car has been leased.
   *
   * @param daysLeased The numer of days the car has been leased.
   */
  public void setDaysLeased(int daysLeased) {
    this.daysLeased = daysLeased;
  }

  /**
   * Sets the leasing status of the car and changes the number of days the car
   * has been leased.
   *
   * @param days The number of days the car has been leased for.
   */
  public void leaseCar(int days) {
    this.isLeased = true;
    this.daysLeased += days;
  }

  /**
   * Releases the lease of the car.
   */
  public void returnCar() {
    this.isLeased = false;
  }

  /**
   * Calculates the total profit the car has generated.
   *
   * @return The total profit the car has generated.
   */
  public double profit() {
    return this.rentPrice * this.daysLeased;
  }

  /**
   * Prints all information of the car to the specified PrintStream object.
   *
   * @param out The PrintStream object where the information will be printed to.
   */
  public void print(PrintStream out) {
    out.printf("Make: " + this.make + ", Model: " + this.model + ", Year: " + this.year
        + ", Mileage: " + this.mileage + ", Price: %f" + ", Registration: " + this.registration
        + ", Leased: " + Util.convertBool(this.isLeased), this.rentPrice);
  }

}
