public class iPhone4 implements SmartPhone {
  private double price;
  private String cellularCarrier;
  private int storage;
  private String CPUModel = "ARM 7";
  private String name = "iPhone 4";

  public iPhone4(String carrier, int storage, double price) {
    this.price = price;
    this.cellularCarrier = carrier;
    this.storage = storage;
  }

  public double getPrice() {
    return this.price;
  }

  public String getCellularCarrier() {
    return cellularCarrier;
  }

  public int getStorage() {
    return storage;
  }

  public String getCPUModel() {
    return CPUModel;
  }

  public String getName() {
    return name;
  }

}
