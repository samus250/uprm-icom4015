public class PurchaseDateComparator implements LabComparator {
  @Override
  public int compare(Object o1, Object o2) {
    Purchasable d1 = (Purchasable) o1;
    Purchasable d2 = (Purchasable) o2;

    return d1.getPurchaseDate().compareTo(d2.getPurchaseDate());
  }
}
