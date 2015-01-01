import junit.framework.TestCase;

public class CarRentalManagerTest2 extends TestCase {

  private CarRentalManager carRentalManager;

  protected void setUp() throws Exception {
    super.setUp();
    carRentalManager = new CarRentalManager();
  }

  /**
   * Test adding multiple customers.
   */
  public void testAddMultipleCustomers() {
    Customer newCustomer = new Customer("Manuel", "Rodriguez", "787738312", 1);
    carRentalManager.addCustomer(newCustomer);
    assert (carRentalManager.findCustomer(1) != null);

    newCustomer = new Customer("Tito", "Kayak", "7878393821", 3);
    carRentalManager.addCustomer(newCustomer);
    assert (carRentalManager.findCustomer(3) != null);

    newCustomer = new Customer("Josy", "Linda", "78793093821", 10);
    carRentalManager.addCustomer(newCustomer);
    assert (carRentalManager.findCustomer(10) != null);
  }

  /**
   * Test looking for a customer not in the system.
   */
  public void testCustomerNotInSystem() {

    Customer newCustomer = new Customer("Manuel", "Rodriguez", "787738312", 1);
    carRentalManager.addCustomer(newCustomer);

    newCustomer = new Customer("Tito", "Kayak", "7878393821", 3);
    carRentalManager.addCustomer(newCustomer);

    newCustomer = new Customer("Josy", "Linda", "78793093821", 10);
    carRentalManager.addCustomer(newCustomer);

    assert (carRentalManager.findCustomer(2) == null);
    assert (carRentalManager.findCustomer(43) == null);

  }

  /**
   * Test adding multiple cars.
   */
  public void testAddMultipleCars() {
    Car newCar = new Car("Ford", "F-150", "2005", "HZR-120", 15, 65.5);
    carRentalManager.addCar(newCar);
    assertTrue(carRentalManager.findCar("HZR-120") != null);

    newCar = new Car("BMW", "M3", "2010", "FRR-220", 11, 140.0);
    carRentalManager.addCar(newCar);
    assertTrue(carRentalManager.findCar("FRR-220") != null);

    newCar = new Car("Totoya", "Yaris", "2010", "ILA-111", 2, 30.0);
    carRentalManager.addCar(newCar);
    assertTrue(carRentalManager.findCar("ILA-111") != null);

  }

  /**
   * Test looking for a car not in the system.
   */
  public void testCarNotInSystem() {

    Car newCar = new Car("Ford", "F-150", "2005", "HZR-120", 15, 65.5);
    carRentalManager.addCar(newCar);

    newCar = new Car("BMW", "M3", "2010", "FRR-220", 11, 140.0);
    carRentalManager.addCar(newCar);

    assertTrue(carRentalManager.findCar("ELR-912") == null);
    assertTrue(carRentalManager.findCar("TIM-920") == null);
  }

  /**
   * Test adding multiple leases
   */
  public void testAddMultipleLeases() {
    Customer newCustomer = new Customer("Manuel", "Rodriguez", "787738312", 1);
    carRentalManager.addCustomer(newCustomer);

    newCustomer = new Customer("Tito", "Kayak", "7878393821", 3);
    carRentalManager.addCustomer(newCustomer);

    newCustomer = new Customer("Josy", "Linda", "78793093821", 10);
    carRentalManager.addCustomer(newCustomer);

    Car newCar = new Car("Ford", "F-150", "2005", "HZR-120", 15, 65.5);
    carRentalManager.addCar(newCar);

    newCar = new Car("BMW", "M3", "2010", "FRR-220", 11, 140.0);
    carRentalManager.addCar(newCar);

    newCar = new Car("Totoya", "Yaris", "2010", "ILA-111", 2, 30.0);
    carRentalManager.addCar(newCar);

    assertTrue(carRentalManager.addLease(1, "HZR-120", 10));
    assertTrue(carRentalManager.addLease(1, "FRR-220", 2));
    assertTrue(carRentalManager.addLease(3, "ILA-111", 2));
  }

  /**
   * Test leasing a leased car.
   */

  public void testLeaseingALeasedCar() {
    Customer newCustomer = new Customer("Manuel", "Rodriguez", "787738312", 1);
    carRentalManager.addCustomer(newCustomer);

    newCustomer = new Customer("Tito", "Kayak", "7878393821", 3);
    carRentalManager.addCustomer(newCustomer);

    newCustomer = new Customer("Josy", "Linda", "78793093821", 10);
    carRentalManager.addCustomer(newCustomer);

    Car newCar = new Car("Ford", "F-150", "2005", "HZR-120", 15, 65.5);
    carRentalManager.addCar(newCar);

    newCar = new Car("BMW", "M3", "2010", "FRR-220", 11, 140.0);
    carRentalManager.addCar(newCar);

    newCar = new Car("Totoya", "Yaris", "2010", "ILA-111", 2, 30.0);
    carRentalManager.addCar(newCar);

    carRentalManager.addLease(1, "HZR-120", 10);
    assertFalse(carRentalManager.addLease(3, "HZR-120", 2));
  }

  /**
   * Test returning a leased car.
   */

  public void testReturningALeasedCar() {
    Customer newCustomer = new Customer("Manuel", "Rodriguez", "787738312", 1);
    carRentalManager.addCustomer(newCustomer);

    newCustomer = new Customer("Tito", "Kayak", "7878393821", 3);
    carRentalManager.addCustomer(newCustomer);

    Car newCar = new Car("Ford", "F-150", "2005", "HZR-120", 15, 65.5);
    carRentalManager.addCar(newCar);

    newCar = new Car("Totoya", "Yaris", "2010", "ILA-111", 2, 30.0);
    carRentalManager.addCar(newCar);

    carRentalManager.addLease(1, "HZR-120", 10);
    carRentalManager.addLease(3, "ILA-111", 2);

    assertTrue(carRentalManager.releaseLease(1, "HZR-120"));
    assertTrue(carRentalManager.releaseLease(3, "ILA-111"));

  }
}
