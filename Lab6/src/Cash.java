import java.util.ArrayList;

public class Cash {

  public static final CashDenomination DENOMINATIONS[] = new CashDenomination[] {
    new CashDenomination("ONE_BILL", 100), new CashDenomination("QUARTER", 25),
    new CashDenomination("DIME", 10), new CashDenomination("NICKEL", 5),
    new CashDenomination("PENNY", 1)
  };

  private final ArrayList<Integer> amounts;

  private int value = 0;

  /* Empty constructor, fill amounts with 0s... */
  public Cash() {
    amounts = new ArrayList<Integer>();
    for (int i = 0; i < DENOMINATIONS.length; i++) {
      amounts.add(0);
    }

  }

  /* Constructor that takes the amounts of each denomination */
  public Cash(int[] amounts) {
    this();

    if (amounts != null && amounts.length == DENOMINATIONS.length) {
      for (CashDenomination cd : DENOMINATIONS) {
        this.add(cd, amounts[cd.getIndex()]);
      }
    }
  }

  /* Add amount of a given denomination */
  public double add(CashDenomination denom, int amount) {
    if (amount > 0 && denom != null) {
      int index = denom.getIndex();

      // Auto boxing and unboxing here
      amounts.set(index, amounts.get(index) + amount);
      value += amount * denom.getValue();
    }

    return value / 100.0;
  }

  /* Add the denomination amounts to the given cash object */
  public double add(Cash c) {
    if (c != null) {
      for (CashDenomination cd : DENOMINATIONS) {
        this.add(cd, c.getAmount(cd));
      }
    }

    return value / 100.0;
  }

  public int remove(CashDenomination denom, int amount) {
    int removed = 0;

    // remove only what can be removed
    if (amount > 0 && denom != null) {
      int index = denom.getIndex();
      removed = Math.min(amount, amounts.get(index));

      amounts.set(index, amounts.get(index) - removed);
      value -= removed * denom.getValue();
    }

    return removed;
  }

  public double remove(Cash c) {
    if (c != null) {
      for (CashDenomination cd : DENOMINATIONS) {
        this.remove(cd, c.getAmount(cd));
      }
    }

    return value / 100.0;
  }

  public Cash remove(double amount) {
    Cash c = null;

    int toRemove = 0;
    int amountInCents = (int) (amount * 100.0);

    if (amountInCents > 0 && amountInCents <= value) {
      c = new Cash();

      for (CashDenomination cd : DENOMINATIONS) {
        toRemove = amountInCents / cd.getValue();
        c.add(cd, remove(cd, toRemove));
        amountInCents -= c.getAmount(cd) * cd.getValue();
      }
    }

    return c;
  }

  public int getAmount(CashDenomination denom) {
    if (denom != null) {
      return amounts.get(denom.getIndex());
    }

    return 0;
  }

  public double getValue() {
    return value / 100.0;
  }

}
