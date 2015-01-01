public class PriceComparator implements LabComparator {
  @Override
  public int compare(Object o1, Object o2) {

    Purchasable d1 = (Purchasable) o1;
    Purchasable d2 = (Purchasable) o2;

    int ret = 0;
    if (d1.getPrice() < d2.getPrice()) {
      ret = -1;
    } else if (d1.getPrice() > d2.getPrice()) {
      ret = 1;
    }

    return ret;

  }
}
