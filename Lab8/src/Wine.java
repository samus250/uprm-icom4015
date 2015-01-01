import java.util.Calendar;

public class Wine implements Purchasable {
  private double price;
  private Calendar purchaseDate;

  public Wine(double price, Calendar purchaseDate) {
    this.price = price;
    this.purchaseDate = purchaseDate;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public Calendar getPurchaseDate() {
    return purchaseDate;
  }

}
