public class Lab2Ex4 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String s1 = "Hello World";
    String s2 = "Wello Horld";
    String s3 = s1;

    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);
    System.out.println("s3 = " + s3);

    s3 = s2;

    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);
    System.out.println("s3 = " + s3);
  }
}
