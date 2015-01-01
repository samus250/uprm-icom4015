/**
 * Represents physical Cash.
 *
 * @author Samuel
 *
 */
public class Cash {
  /**
   * One dollar bill value in cents.
   */
  public static final int ONE_BILL_VALUE = 100;
  /**
   * Quarter value in cents.
   */
  public static final int QUARTER_VALUE = 25;
  /**
   * Dime value in cents.
   */
  public static final int DIME_VALUE = 10;
  /**
   * Nickel value in cents.
   */
  public static final int NICKEL_VALUE = 5;
  /**
   * Penny value in cents.
   */
  public static final int PENNY_VALUE = 1;

  /**
   * Number of bills in the collection.
   */
  private int bills = 0;
  /**
   * Number of quarters in the collection.
   */
  private int quarters = 0;
  /**
   * Number of dimes in the collection.
   */
  private int dimes = 0;
  /**
   * Number of nickels in the collection.
   */
  private int nickels = 0;
  /**
   * Number of pennies in the collection.
   */
  private int pennies = 0;
  /**
   * Value of the collection.
   */
  private int value = 0;

  /**
   * Default constructor - Collection with no money.
   */
  public Cash() {

  }

  /**
   * @param bills
   * @param quarters
   * @param dimes
   * @param nickels
   * @param pennies
   */
  public Cash(int bills, int quarters, int dimes, int nickels, int pennies) {
    addBills(bills);
    addQuarters(quarters);
    addDimes(dimes);
    addNickels(nickels);
    addPennies(pennies);
  }

  /**
   * @return the bills
   */
  public int getBills() {
    return bills;
  }

  /**
   * @return the quarters
   */
  public int getQuarters() {
    return quarters;
  }

  /**
   * @return the dimes
   */
  public int getDimes() {
    return dimes;
  }

  /**
   * @return the nickels
   */
  public int getNickels() {
    return nickels;
  }

  /**
   * @return the pennies
   */
  public int getPennies() {
    return pennies;
  }

  /**
   * @return the value
   */
  public double getValue() {
    return value / 100.0;
  }

  /**
   * Add bills to the collection.
   *
   * @param amount
   * @return New value in collection.
   */
  public double addBills(int amount) {
    if (amount > 0) {
      bills += amount;
      value += amount * ONE_BILL_VALUE;
    }
    return value / 100.0;
  }

  /**
   * Add quarters to the collection.
   *
   * @param amount
   * @return New value in collection.
   */
  public double addQuarters(int amount) {
    if (amount > 0) {
      quarters += amount;
      value += amount * QUARTER_VALUE;
    }
    return value / 100.0;
  }

  /**
   * Add dimes to the collection.
   *
   * @param amount
   * @return New value in collection.
   */
  public double addDimes(int amount) {
    if (amount > 0) {
      dimes += amount;
      value += amount * DIME_VALUE;
    }
    return value / 100.0;
  }

  /**
   * Add nickels to the collection.
   *
   * @param amount
   * @return New value in collection.
   */
  public double addNickels(int amount) {
    if (amount > 0) {
      nickels += amount;
      value += amount * NICKEL_VALUE;
    }
    return value / 100.0;
  }

  /**
   * Add pennies to the collection.
   *
   * @param amount
   * @return New value in collection.
   */
  public double addPennies(int amount) {
    if (amount > 0) {
      pennies += amount;
      value += amount * PENNY_VALUE;
    }
    return value / 100.0;
  }

  /**
   * Remove bills from the collection.
   *
   * @param amount
   * @return New value in collection.
   */
  public int removeBills(int amount) {
    int removed = 0;

    if (amount > 0) {
      removed = Math.min(amount, bills);
      bills -= removed;
      value -= removed * ONE_BILL_VALUE;
    }

    return removed;
  }

  /**
   * Remove quarters from the collection.
   *
   * @param amount
   * @return Amount removed from collection.
   */
  public int removeQuarters(int amount) {
    int removed = 0;

    if (amount > 0) {
      removed = Math.min(amount, quarters);
      quarters -= removed;
      value -= removed * QUARTER_VALUE;
    }

    return removed;
  }

  /**
   * Remove dimes from the collection.
   *
   * @param amount
   * @return Amount removed from collection.
   */
  public int removeDimes(int amount) {
    int removed = 0;

    if (amount > 0) {
      removed = Math.min(amount, dimes);
      dimes -= removed;
      value -= removed * DIME_VALUE;
    }

    return removed;
  }

  /**
   * Remove nickels from the collection.
   *
   * @param amount
   * @return Amount removed from collection.
   */
  public int removeNickels(int amount) {
    int removed = 0;

    if (amount > 0) {
      removed = Math.min(amount, nickels);
      nickels -= removed;
      value -= removed * NICKEL_VALUE;
    }

    return removed;
  }

  /**
   * Remove pennies from the collection.
   *
   * @param amount
   * @return Amount removed from collection.
   */
  public int removePennies(int amount) {
    int removed = 0;

    if (amount > 0) {
      removed = Math.min(amount, pennies);
      pennies -= removed;
      value -= removed * PENNY_VALUE;
    }

    return removed;
  }

  /**
   * Remove cash from the collection.
   *
   * @param amount
   *          to remove.
   * @return Cash removed.
   */
  public Cash remove(double amount) {
    Cash c = null;

    int toRemove = 0;
    int amountInCents = (int) (amount * 100.0);
    if (amountInCents > 0 && amountInCents <= value) {
      c = new Cash();

      toRemove = amountInCents / ONE_BILL_VALUE;
      c.addBills(removeBills(toRemove));
      amountInCents -= c.getBills() * ONE_BILL_VALUE;

      toRemove = amountInCents / QUARTER_VALUE;
      c.addQuarters(removeQuarters(toRemove));
      amountInCents -= c.getQuarters() * QUARTER_VALUE;

      toRemove = amountInCents / DIME_VALUE;
      c.addDimes(removeDimes(toRemove));
      amountInCents -= c.getDimes() * DIME_VALUE;

      toRemove = amountInCents / NICKEL_VALUE;
      c.addNickels(removeNickels(toRemove));
      amountInCents -= c.getNickels() * NICKEL_VALUE;

      toRemove = amountInCents / PENNY_VALUE;
      c.addPennies(removePennies(toRemove));
      amountInCents -= c.getPennies() * PENNY_VALUE;
    }
    return c;
  }

  /**
   * Add cash to the collection.
   *
   * @param c Cash to add.
   * @return New value of collection.
   */
  public double add(Cash c) {
    this.addBills(c.getBills());
    this.addQuarters(c.getQuarters());
    this.addDimes(c.getDimes());
    this.addNickels(c.getNickels());
    this.addPennies(c.getPennies());

    return this.getValue();
  }
}
