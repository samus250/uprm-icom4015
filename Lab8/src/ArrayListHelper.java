import java.util.ArrayList;

public class ArrayListHelper {
  /**
   * Return the minimum element as determined by the compareTo method of the
   * LabComparable objects.
   *
   * @param a An arraylist of LabComparable objects
   * @return the minimum element
   */
  public static Object min(ArrayList<LabComparable> a) {
    LabComparable min = a.get(0);

    for (LabComparable c : a) {
      if (c.compareTo(min) < 0) {
        min = c;
      }
    }

    return min;
  }

  /**
   * Returns the minimal element as determined by the LabComparator comp
   *
   * @param a ArrayList of objects. The objects can be of any type.
   * @param comp The object used to compare the objects in a.
   * @return
   */
  public static Object min(ArrayList<?> a, LabComparator comp) {
    Object min = a.get(0);

    for (Object o : a) {
      if (comp.compare(o, min) < 0) {
        min = o;
      }
    }

    return min;
  }

  public static ArrayList<Object> lessThan(ArrayList<?> a, LabComparator comp, Object b) {
    ArrayList<Object> results = new ArrayList<Object>();

    for (Object current : a) {
      if (comp.compare(current, b) < 0) {
        results.add(current);
      }
    }

    return results;
  }

}
