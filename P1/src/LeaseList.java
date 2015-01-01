import java.util.LinkedList;
import java.util.List;

/**
 * This class is used to represent a list of car leases.
 * 
 * @author manuel
 *
 */
public class LeaseList {
  private List<Lease> leases;

  /**
   * Creates an empty lease list.
   */
  public LeaseList() {
    leases = new LinkedList<Lease>();
  }

  /**
   * Adds a new lease to the list.
   * 
   * @param newLease
   *          the new lease.
   */
  public void addLease(Lease newLease) {
    leases.add(0, newLease);
  }

  /**
   * Returns the number of leases in the list.
   * 
   * @return the number of leases
   */
  public int leaseCount() {
    return leases.size();
  }

  /**
   * Returns the number of leases that are open in the list. An open lease
   * indicates a car that is currently rented to a customer.
   * 
   * @return the number of open leases.
   */
  public int openLeaseCount() {
    int result = 0;
    for (Lease L : leases) {
      if (L.getIsOpen()) {
        result++;
      }
    }
    return result;
  }

  /**
   * Returns the number of leases that are closed in the list. A close lease
   * indicates a car that has been returned by the customer.
   * 
   * @return the number of close leases.
   */
  public int closedLeaseCount() {
    return leaseCount() - openLeaseCount();
  }

  /**
   * Prints all leases in the list.
   */
  public void printAllLeases() {
    int count = 1;
    for (Lease L : leases) {
      System.out.printf("%d. ", count);
      L.print(System.out);
      System.out.println();
      count++;
    }
  }

  /**
   * Prints all leases for a given customer.
   * 
   * @param theCustomer
   */
  public void printAllLeases(int customerId) {
    int count = 1;
    for (Lease L : leases) {
      if (L.getCustomerId() == customerId) {
        System.out.printf("%d. ", count);
        L.print(System.out);
        System.out.println();
        count++;
      }
    }
  }

  /**
   * Finds a lease for a given customers and registration number.
   * 
   * @param customerId
   *          the customer id
   * @param registration
   *          the registration number
   * @return the lease for the combination of input parameters, or false
   *         otherwise.
   */
  public Lease findLease(int customerId, String registration) {
    for (Lease L : leases) {
      if ((L.getCustomerId() == customerId) && (L.getRegistration().equals(registration))) {
        return L;
      }
    }
    return null;
  }

  /**
   * Returns the number of leases for a given customer.
   * 
   * @param customerId
   *          the id of the customer.
   * @return the number of lease for the customer.
   */
  public int leaseCount(int customerId) {
    int result = 0;
    for (Lease L : leases) {
      if ((L.getCustomerId() == customerId)) {
        result++;
      }
    }
    return result;
  }
}
