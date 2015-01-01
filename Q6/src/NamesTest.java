public class NamesTest {

  /**
   * Main program
   *
   * @param args
   */
  public static void main(String[] args) {
    Names theNames = new Names(6);

    addNames(theNames);
    System.out.println("Strings in list larger than Joe: " + theNames.largerCount("Joe"));
    System.out.println("Strings in list larger than Xi: " + theNames.largerCount("Xi"));
    System.out.println("Strings in list larger than Amy: " + theNames.largerCount("Amy"));
    System.out.println("Strings in list larger than Ron: " + theNames.largerCount("Ron"));
    System.out.println("Strings in list larger than Kevin: " + theNames.largerCount("Kevin"));

  }

  private static void addNames(Names N) {
    N.set(0, "Joe");
    N.set(1, "Jil");
    N.set(2, "Ned");
    N.set(3, "Apu");
    N.set(4, "Xi");
    N.set(5, "Amy");
  }

}
