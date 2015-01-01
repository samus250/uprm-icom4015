public class TestSmartPhone {

  /**
   * @param args
   */
  public static void main(String[] args) {
    SmartPhone P = new iPhone4("ATT", 16 * 1024, 199.9);
    System.out.printf("Name: %s, Carrier: %s, CPU: %s, Storage (MB): %d, Price: $%f", P.getName(),
        P.getCellularCarrier(), P.getCPUModel(), P.getStorage(), P.getPrice());
    System.out.println(P.getPrice());

    P = new HTCAria(99.99, "Claro");
    System.out.printf("Name: %s, Carrier: %s, CPU: %s, Storage (MB): %d, Price: $%f", P.getName(),
        P.getCellularCarrier(), P.getCPUModel(), P.getStorage(), P.getPrice());
    System.out.println(P.getPrice());
  }

}
