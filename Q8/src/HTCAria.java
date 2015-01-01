public class HTCAria implements SmartPhone {
  private double price;
  private String cellularCarrier;
  private int storage = 512;
  private String CPUModel = "ARM 6";
  private String name = "HTC Aria";

  public HTCAria(double price, String carrier) {
    this.price = price;
    this.cellularCarrier = carrier;
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
