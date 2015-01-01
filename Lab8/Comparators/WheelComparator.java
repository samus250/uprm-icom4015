public class WheelComparator implements LabComparator {
  @Override
  public int compare(Object o1, Object o2) {
    Drivable d1 = (Drivable) o1;
    Drivable d2 = (Drivable) o2;

    int ret = 0;
    if (d1.getNumWheels() < d2.getNumWheels()) {
      ret = -1;
    } else if (d1.getNumWheels() > d2.getNumWheels()) {
      ret = 1;
    }

    return ret;
  }
}
