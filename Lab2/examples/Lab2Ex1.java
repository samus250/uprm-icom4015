import java.math.BigDecimal;

public class Lab2Ex1 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int num1 = 2147483647;
    System.out.printf("num1 = %d\n", num1 + 1);

    // pi = 3.1415926535897932384626433832795028841971
    double piDouble = 3.1415926535897932384626433832795028841971;
    float piFloat = (float) 3.1415926535897932384626433832795028841971;
    BigDecimal piBD = new BigDecimal("3.1415926535897932384626433832795028841971");

    System.out.printf("BigDecimal                   = %1.50g\n", piBD);
    System.out.printf("Double                       = %1.35g\n", piDouble);
    System.out.printf("BigDecimal to Double         = %1.35g\n", piBD.doubleValue());
    System.out.printf("Float                        = %1.35g\n", piFloat);
  }
}
