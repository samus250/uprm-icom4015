public class HelloWorld {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Hello World.");

    Summation s = new Summation();
    s.sumUB = 20;
    int result = s.doSum();
    System.out.println("The sum of 1 to " + s.sumUB + " = " + result);
  }
}
