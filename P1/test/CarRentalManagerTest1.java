import junit.framework.TestCase;

public class CarRentalManagerTest1 extends TestCase {

  protected CarRentalManager carRentalManager;

  protected void setUp() throws Exception {
    super.setUp();
    carRentalManager = new CarRentalManager();
  }

  /**
   * Test the process to add a customer.
   */
  public void testAddCustomer() {
    Customer newCustomer = new Customer("Manuel", "Rodriguez", "787738312", 1);
    carRentalManager.addCustomer(newCustomer);
    assertTrue(carRentalManager.findCustomer(1) != null);
  }

  /**
   * Test the process to add the car.
   */
  public void testAddCar() {
    Car newCar = new Car("Ford", "F-150", "2005", "HZR-120", 15, 65.5);
    carRentalManager.addCar(newCar);
    assertTrue(carRentalManager.findCar("HZR-120") != null);
  }

  /**
   * Test the process to add the lease.
   */
  public void testAddLease() {
    Customer newCustomer = new Customer("Manuel", "Rodriguez", "787738312", 1);
    carRentalManager.addCustomer(newCustomer);

    Car newCar = new Car("Ford", "F-150", "2005", "HZR-120", 15, 65.5);
    carRentalManager.addCar(newCar);

    assertTrue(carRentalManager.addLease(1, "HZR-120", 10));
  }

  /**
   * Test the process to release the lease.
   */
  public void testReleaseLease() {

    Customer newCustomer = new Customer("Manuel", "Rodriguez", "787738312", 1);
    carRentalManager.addCustomer(newCustomer);

    Car newCar = new Car("Ford", "F-150", "2005", "HZR-120", 15, 65.5);
    carRentalManager.addCar(newCar);

    carRentalManager.addLease(1, "HZR-120", 10);

    assertTrue(carRentalManager.releaseLease(1, "HZR-120"));
  }

}
