public class Lab2Ex3 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    long numLong = 2147483647;
    numLong++;
    int numInt = (int) numLong;
    System.out.printf("Long = %d, Int = %d\n", numLong, numInt);

    double piDouble = 3.1415926535897932384626433832795028841971;
    float piFloat = (float) piDouble;
    System.out.printf("Double     = %1.15g\n", piDouble);
    System.out.printf("Float      = %1.15g\n", piFloat);
  }
}
