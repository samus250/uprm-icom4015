/**
 * Manages the Car Rental system.
 *
 * @author samus250
 *
 */
public class CarRentalManager {
  private CarList carList;
  private CustomerList customerList;
  private LeaseList leaseList;

  /**
   * Constructs a CarRentalManager object. It also initializes the carList,
   * customerList and leaseList lists.
   */
  public CarRentalManager() {
    carList = new CarList();
    customerList = new CustomerList();
    leaseList = new LeaseList();
  }

  /**
   * Adds a new car to the carList.
   *
   * @param newCar  The Car object to be added.
   */
  public void addCar(Car newCar) {
    carList.addCar(newCar);
  }

  /**
   * Finds a Car object on the list by calling CarList.findCar()
   *
   * @param registration The registration (license plate) of the car to be searched for.
   * @return The Car object that has been found.
   */
  public Car findCar(String registration) {
    return carList.findCar(registration);
  }

  /**
   * Prints the whole car list.
   */
  public void printCarList() {
    carList.printCarList();
  }

  /**
   * Returns the profit generated by the car.
   *
   * @param registration The registration of the car.
   * @return The profit generated by the car.
   */
  public double profit(String registration) {
    return carList.findCar(registration).profit();
  }

  /**
   * Adds a new customer to customerList.
   *
   * @param newCustomer The new customer to be added.
   */
  public void addCustomer(Customer newCustomer) {
    customerList.addCustomer(newCustomer);
  }

  /**
   * Finds a customer from the customerList.
   *
   * @param customerId The customer's ID number to be searched for.
   * @return The Customer object found.
   */
  public Customer findCustomer(int customerId) {
    return customerList.getCustomer(customerId);
  }

  /**
   * Prints the whole customerList.
   */
  public void printCustomerList() {
    customerList.printCustomerList();
  }

  /**
   * Adds a new lease to leaseList only if the car is available.
   *
   * @param customerId The ID number of the customer that is purchasing the lease.
   * @param registration The registration number of the car that is being leased.
   * @param daysLeased The term (in days) of the lease.
   * @return True if successful (lease was added), false if unsuccessful (and lease couldn't be
   *   added).
   */
  public boolean addLease(int customerId, String registration, int daysLeased) {
    // check if the car is available
    if (carList.findCar(registration).isLeased()) {
      return false;
    } else {

      // create the lease
      Lease l = new Lease(customerId, registration, daysLeased);

      // add it
      this.leaseList.addLease(l);

      // add lease to car
      this.carList.findCar(registration).leaseCar(daysLeased);

      return true;
    }
  }

  /**
   * Releases a currently opened lease, only if the lease exists.
   *
   * @param customerId The customer ID number of the lease that is going to be released.
   * @param registration The registration number of the car that is going to be returned.
   * @return true if successful (and lease was released) false if unsuccessful (and lease couldn't
   *   be released).
   */
  public boolean releaseLease(int customerId, String registration) {
    if (this.leaseList.findLease(customerId, registration) == null) {
      return false; // if the lease doesn't exist
    } else {
      // find the lease and close it
      this.leaseList.findLease(customerId, registration).setOpen(false);

      // return the car
      this.carList.findCar(registration).returnCar();
      return true;
    }
  }

  /**
   * Erases a customer from the customerList, only if the customer has no opened
   * leases.
   *
   * @param customerId The ID number of the customer who is going to be erased.
   * @return Boolean: true if successful (and customer was erased), false if unsuccessful (and
   *   customer couldn't be erased).
   */
  public boolean eraseCustomer(int customerId) {
    if (leaseList.leaseCount(customerId) == 0) {
      this.customerList.erase(customerId);
      return true;
    } else {
      return false;
    }
  }

  /**
   * Prints the whole list of leases.
   */
  public void printLeaseList() {
    this.leaseList.printAllLeases();
  }

  /**
   * Prints the whole list of leases for a given customer.
   *
   * @param customerId The ID number of the customer who's leases are wished to be known.
   */
  public void printLeaseList(int customerId) {
    this.leaseList.printAllLeases(customerId);
  }

  /**
   * Finds a specific lease from the leaseList
   *
   * @param registration The registration number of the car that is leased.
   * @param customerId The ID number of the customer who purchased the lease.
   * @return The Lease that was found.
   */
  public Lease findLease(String registration, int customerId) {
    return this.leaseList.findLease(customerId, registration);
  }
}
