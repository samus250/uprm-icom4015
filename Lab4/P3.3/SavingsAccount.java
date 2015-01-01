/**
 * Represents a Savings Account
 *
 * @author samus250
 *
 */
public class SavingsAccount {
  /**
   * The balance of the account.
   */
  private double balance;

  /**
   * The interest rate of the account.
   */
  private double interest;

  /**
   * @param balance
   * @param interest
   */
  public SavingsAccount(double balance, double interest) {
    this.balance = balance;
    this.interest = interest;
  }

  /**
   * @param interest
   */
  public SavingsAccount(double interest) {
    this(0.0, interest);
  }

  /**
   * @return the balance
   */
  public double getBalance() {
    return balance;
  }

  /**
   * @return the interest
   */
  public double getInterest() {
    return interest;
  }

  /**
   * Deposit money into the account.
   *
   * @param amount
   * @return the balance after deposit.
   */
  public double deposit(double amount) {
    this.balance += amount;
    return this.balance;
  }

  /**
   * Withdraw money from the account.
   *
   * @param amount
   * @return the balance after withdrawal.
   */
  public double withdraw(double amount) {
    this.balance -= amount;
    return this.balance;
  }

  /**
   * Add interest into the account.
   *
   * @return the added interest.
   */
  public double addInterest() {
    double amount = balance * (interest / 12);
    this.balance += amount;
    return amount;
  }
}
