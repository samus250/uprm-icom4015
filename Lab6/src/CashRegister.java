/**
 * This class represents a Cash Register.
 *
 * @author samus250
 *
 */
public class CashRegister {
  /**
   * Total cash in the register.
   */
  private Cash registerTotal;
  /**
   * Total payment received.
   */
  private Cash payment = new Cash();
  /**
   * Total of purchases made so far.
   */
  private double purchaseTotal = 0;

  /**
   * Default constructor - CashRegister with 100 coins of each denomination.
   */
  public CashRegister() {
    int[] amounts = { 100, 100, 100, 100, 100 };
    this.registerTotal = new Cash(amounts);
  }

  /**
   * Constructs a CashRegister with the given coin denominations.
   *
   * @param registerTotal
   */
  public CashRegister(Cash registerTotal) {
    this.registerTotal = registerTotal;
  }

  /**
   * Make a purchase.
   *
   * @param amount
   *          of purchase.
   * @return purchase total so far.
   */
  public double purchase(double amount) {
    if (amount > 0) {
      this.purchaseTotal += amount;
    }

    return this.purchaseTotal;
  }

  /**
   * Receive a payment.
   *
   * @param amount
   *          of payment received.
   */
  public void payment(Cash amount) {
    this.payment.add(amount);
  }

  /**
   * Gives change to the customer.
   *
   * @return a Cash object with the given change.
   */
  public Cash giveChange() {
    // add the payment to the register
    this.registerTotal.add(payment);

    // calculate change
    this.payment.remove(purchaseTotal);

    // take out change from register
    this.registerTotal.remove(payment);

    // reset the purchase
    this.purchaseTotal = 0;

    // reset the payment
    int[] amounts = { this.payment.getAmount(Cash.DENOMINATIONS[0]),
      this.payment.getAmount(Cash.DENOMINATIONS[1]), this.payment.getAmount(Cash.DENOMINATIONS[2]),
      this.payment.getAmount(Cash.DENOMINATIONS[3]), this.payment.getAmount(Cash.DENOMINATIONS[4]) };
    Cash change = new Cash(amounts);
    this.payment = new Cash();

    return change;
  }

  /**
   * Gets the total purchase value so far.
   *
   * @return Total purchases made so far.
   */
  public double getPurchaseTotal() {
    return this.purchaseTotal;
  }

  /**
   * Gets the payment made to the register.
   *
   * @return Total payments made so far.
   */
  public Cash getPayment() {
    return this.payment;
  }

  /**
   * Gets the total Cash in the register.
   *
   * @return Total Cash in the register.
   */
  public Cash getRegisterTotal() {
    return this.registerTotal;
  }

}
