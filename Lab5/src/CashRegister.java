/**
 * This class represents a Cash Register.
 *
 * @author Samuel
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
  private Cash payment = new Cash(0, 0, 0, 0, 0);
  /**
   * Total of purchases made so far.
   */
  private double purchaseTotal = 0;

  /**
   * Default constructor - CashRegister with 100 coins of each denomination.
   */
  public CashRegister() {
    this.registerTotal = new Cash(100, 100, 100, 100, 100);
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
    this.registerTotal.remove(this.payment.getValue());

    // reset the purchase
    this.purchaseTotal = 0;

    // reset the payment
    Cash change = new Cash(this.payment.getBills(), this.payment.getQuarters(),
        this.payment.getDimes(), this.payment.getNickels(), this.payment.getPennies());
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
