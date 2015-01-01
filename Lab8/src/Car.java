import java.util.Calendar;

public class Car implements LabComparable, Drivable, Purchasable {
  private int mileage;
  private int numWheels = 4;
  private double price;
  private Calendar purchaseDate;

  public Car(int mileage) {
    this.mileage = mileage;
  }

  public Car(int mileage, Calendar purchaseDate, double price) {
    this.mileage = mileage;
    this.purchaseDate = purchaseDate;
    this.price = price;

  }

  @Override
  public int getMileage() {
    return mileage;
  }

  @Override
  public int getNumWheels() {
    return numWheels;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public Calendar getPurchaseDate() {
    return purchaseDate;
  }

  @Override
  public int compareTo(Object o) {
    Car c = (Car) o;

    int ret = 0;
    if (mileage < c.getMileage()) {
      ret = -1;
    } else if (mileage > c.getMileage()) {
      ret = 1;
    }

    return ret;
  }
}
