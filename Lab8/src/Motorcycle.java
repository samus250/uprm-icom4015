import java.util.Calendar;

public class Motorcycle implements LabComparable, Drivable, Purchasable {
  private int mileage;
  private int numWheels = 2;
  private double price;
  private Calendar purchaseDate;

  public Motorcycle(int mileage) {
    this.mileage = mileage;
  }

  public Motorcycle(int mileage, Calendar purchaseDate, double price) {
    this.mileage = mileage;
    this.purchaseDate = purchaseDate;
    this.price = price;

  }

  public int getMileage() {
    return mileage;
  }

  public int getNumWheels() {
    return numWheels;
  }

  public double getPrice() {
    return price;
  }

  public Calendar getPurchaseDate() {
    return purchaseDate;
  }

  public int compareTo(Object o) {
    Motorcycle c = (Motorcycle) o;

    int ret = 0;
    if (mileage < c.getMileage())
      ret = -1;
    else if (mileage > c.getMileage())
      ret = 1;

    return ret;
  }

}
