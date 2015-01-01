public class BasicTaxTest {

  /**
   * @param args
   */
  public static void main(String[] args) {
    BasicTax theTax = null;
    boolean married = false;
    System.out.println("Scenario 1: Single, salary $15,000");
    theTax = new BasicTax(married, 15000);
    System.out.println("Your baseTax is: $" + theTax.baseTax());
    System.out.println("Scenario 2: Single, salary $80,000");
    theTax = new BasicTax(married, 80000);
    System.out.println("Your baseTax is: $" + theTax.baseTax());
    System.out.println("Scenario 3: Married, salary $48,000");
    married = true;
    theTax = new BasicTax(married, 48000);
    System.out.println("Your baseTax is: $" + theTax.baseTax());
    System.out.println("Scenario 4: Married, salary $200,000");
    theTax = new BasicTax(married, 200000);
    System.out.println("Your baseTax is: $" + theTax.baseTax());

  }

}
