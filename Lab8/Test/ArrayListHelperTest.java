import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Test;

public class ArrayListHelperTest {

  @Test
  public void ArrayListHelperMinTest1() {
    ArrayList<LabComparable> ac = new ArrayList<LabComparable>();

    Calendar cal = Calendar.getInstance();
    cal.set(1985, 0, 14);
    ac.add(new Car(20000, cal, 25000));

    cal = Calendar.getInstance();
    cal.set(1997, 2, 22);
    ac.add(new Car(18000, cal, 28756));

    cal = Calendar.getInstance();
    cal.set(1984, 5, 18);
    ac.add(new Car(22000, cal, 37950));

    Car c = (Car) ArrayListHelper.min(ac);
    assertTrue(c.getMileage() == 18000);
  }

  @Test
  public void ArrayListHelperMinTest2() {
    ArrayList<Drivable> ac = new ArrayList<Drivable>();

    Calendar cal = Calendar.getInstance();
    cal.set(1985, 0, 14);
    ac.add(new Car(20000, cal, 25000));

    cal = Calendar.getInstance();
    cal.set(1997, 2, 22);
    ac.add(new Motorcycle(28000, cal, 28756));

    cal = Calendar.getInstance();
    cal.set(1984, 5, 18);
    ac.add(new Car(22000, cal, 37950));

    Drivable d = (Drivable) ArrayListHelper.min(ac, new MilageComparator());
    assertTrue(d.getMileage() == 20000);
    try {
      Car c = (Car) d;
      System.out.println("The Drivable object is a Car: " + c);
    } catch (Exception e) {
      System.out.println("The Drivable object is not a Car: " + d);
    }

    d = (Drivable) ArrayListHelper.min(ac, new WheelComparator());
    assertTrue(d.getNumWheels() == 2);
    try {
      Car c = (Car) d;
      System.out.println("The Drivable object is a Car: " + c);
    } catch (Exception e) {
      System.out.println("The Drivable object is not a Car: " + d);
    }
  }

  @Test
  public void ArrayListHelperMinTest3() {
    ArrayList<Purchasable> ac = new ArrayList<Purchasable>();

    Calendar cal = Calendar.getInstance();
    cal.set(1985, 0, 14);
    ac.add(new Car(20000, cal, 25000));

    cal = Calendar.getInstance();
    cal.set(1997, 2, 22);
    ac.add(new Motorcycle(18000, cal, 28756));

    cal = Calendar.getInstance();
    cal.set(2005, 5, 18);
    ac.add(new Wine(20.00, cal));

    Purchasable p = (Purchasable) ArrayListHelper.min(ac, new PriceComparator());
    assertTrue(Math.abs(p.getPrice() - 20.0) < 1e-8);

    try {
      Car c = (Car) p;
      System.out.println("The Purchasable object is a Car: " + c);
    } catch (Exception e) {
      System.out.println("The Purchasable object is not a Car: " + p);
    }

    p = (Purchasable) ArrayListHelper.min(ac, new PurchaseDateComparator());
    assertTrue(p.getPurchaseDate().get(Calendar.YEAR) == 1985);

    try {
      Car c = (Car) p;
      System.out.println("The Purchasable object is a Car: " + c);
    } catch (Exception e) {
      System.out.println("The Purchasable object is not a Car: " + p);
    }
  }

  @Test
  public void ArrayListHelperLessThanTest() {
    ArrayList<Purchasable> ac = new ArrayList<Purchasable>();

    Calendar cal = Calendar.getInstance();
    cal.set(1985, 0, 14);
    ac.add(new Car(20000, cal, 25000));

    cal = Calendar.getInstance();
    cal.set(1997, 2, 22);
    ac.add(new Motorcycle(18000, cal, 28756));

    cal = Calendar.getInstance();
    cal.set(2005, 5, 18);
    ac.add(new Wine(20.00, cal));

    ArrayList<Object> ret = ArrayListHelper.lessThan(ac, new PriceComparator(), new Car(24000, cal,
        27000));

    assertTrue(ret.size() == 2);

    try {
      Car c = (Car) ret.get(1);
      System.out.println("The Purchasable object is a Car: " + c);
    } catch (Exception e) {
      System.out.println("The Purchasable object is not a Car: " + ret.get(1));
    }

    cal.set(Calendar.YEAR, 2004);
    ret = ArrayListHelper.lessThan(ac, new PurchaseDateComparator(), new Wine(22.0, cal));
    assertTrue(ret.size() == 2);

    try {
      Car c = (Car) ret.get(1);
      System.out.println("The Purchasable object is a Car: " + c);
    } catch (Exception e) {
      System.out.println("The Purchasable object is not a Car: " + ret.get(1));
    }
  }
}
