import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class CarRentalManagerTest3 extends TestCase {

  private CarRentalManager carRentalManager;

  protected void setUp() throws Exception {
    super.setUp();
    carRentalManager = new CarRentalManager();
  }

  /**
   * Test customer print.
   */
  public void testCustomerPrint() {
    // create memory array to store string to be printed
    ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
    // make memory array a PrintStream just like System.out
    PrintStream out = new PrintStream(byteOut);
    // Create the customer
    Customer newCustomer = new Customer("Manuel", "Rodriguez", "787738312", 1);
    // Print it to memory
    newCustomer.print(out);
    String info = byteOut.toString();
    // see if we got what we expected
    assertTrue(info.equals("Id: 1, First Name: Manuel, Last Name: Rodriguez, Phone: 787738312"));
  }

  /**
   * Test car print.
   */
  public void testCarPrint() {
    // create memory array to store string to be printed
    ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
    // make memory array a PrintStream just like System.out
    PrintStream out = new PrintStream(byteOut);
    // Create the car
    Car newCar = new Car("Ford", "F-150", "2005", "HZR-120", 15, 65.5);
    // Print it to memory
    newCar.print(out);
    String info = byteOut.toString();
    // see if we got what we expected
    assertTrue(info
        .equals("Make: Ford, Model: F-150, Year: 2005, Mileage: 15, Price: 65.500000, Registration: HZR-120, Leased: N"));
  }

  /**
   * Test Lease print.
   */
  public void testLeasePrint() {
    // create memory array to store string to be printed
    ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
    // make memory array a PrintStream just like System.out
    PrintStream out = new PrintStream(byteOut);
    // Create the car
    Lease newLease = new Lease(1, "HZR-120", 10);
    // Print it to memory
    newLease.print(out);
    String info = byteOut.toString();
    // see if we got what we expected
    System.out.println(info);
    assertTrue(info.equals("Customer Id: 1, Registration: HZR-120, Days Leased: 10, Still Open: Y"));
  }

  /**
   * Test erasing a customer with no leases.
   */

  public void testEraseCustomerNoLease() {
    Customer newCustomer = new Customer("Manuel", "Rodriguez", "787738312", 1);
    carRentalManager.addCustomer(newCustomer);

    newCustomer = new Customer("Tito", "Kayak", "7878393821", 3);
    carRentalManager.addCustomer(newCustomer);

    Car newCar = new Car("Ford", "F-150", "2005", "HZR-120", 15, 65.5);
    carRentalManager.addCar(newCar);

    newCar = new Car("Totoya", "Yaris", "2010", "ILA-111", 2, 30.0);
    carRentalManager.addCar(newCar);

    carRentalManager.addLease(1, "HZR-120", 10);

    assertTrue(carRentalManager.eraseCustomer(3));
  }

  /**
   * Test erasing a customer with leases.
   */

  public void testEraseCustomerWithLease() {
    Customer newCustomer = new Customer("Manuel", "Rodriguez", "787738312", 1);
    carRentalManager.addCustomer(newCustomer);

    newCustomer = new Customer("Tito", "Kayak", "7878393821", 3);
    carRentalManager.addCustomer(newCustomer);

    Car newCar = new Car("Ford", "F-150", "2005", "HZR-120", 15, 65.5);
    carRentalManager.addCar(newCar);

    newCar = new Car("Totoya", "Yaris", "2010", "ILA-111", 2, 30.0);
    carRentalManager.addCar(newCar);

    carRentalManager.addLease(1, "HZR-120", 10);

    assertFalse(carRentalManager.eraseCustomer(1));
  }

  /**
   * Test leasing, returning, and leasing a car.
   */
  public void testLeaseReturnLease() {
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

    carRentalManager.releaseLease(1, "HZR-120");
    carRentalManager.releaseLease(3, "ILA-111");

    assertTrue(carRentalManager.addLease(3, "HZR-120", 3));

  }
}
