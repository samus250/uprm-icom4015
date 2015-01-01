import java.util.LinkedList;
import java.util.List;

/**
 * This class implements a customer list.
 * 
 * @author manuel
 *
 */
public class CustomerList {
  private List<Customer> customers;

  /**
   * Default constructor. Creates a list with zero customers.
   */
  public CustomerList() {
    customers = new LinkedList<Customer>();
  }

  /**
   * Adds a new customer to the list.
   * 
   * @param newCustomer
   *          the new customer.
   */
  public void addCustomer(Customer newCustomer) {
    this.customers.add(0, newCustomer);
  }

  /**
   * Finds a customer with a given customer id.
   * 
   * @param customerId
   *          the customer id
   * @return the customer with for parameter id, or null is no such customer
   *         exists.
   */
  public Customer getCustomer(int customerId) {
    for (Customer C : customers) {
      if (C.getCustomerId() == customerId) {
        return C;
      }
    }
    return null;
  }

  /**
   * Returns the number of customers in the list.
   * 
   * @return number of the customers in the list.
   */
  public int customerCount() {
    return customers.size();
  }

  /**
   * Prints all the customers in the list.
   */
  public void printCustomerList() {
    int count = 1;
    for (Customer C : customers) {
      System.out.printf("%d. ", count);
      C.print(System.out);
      System.out.println();
      count++;
    }
  }

  /**
   * Removes a customer with a given customer id.
   * 
   * @param customerId
   *          the id of the customer to be removed.
   */
  public void erase(int customerId) {
    int pos = 0;

    for (Customer C : customers) {
      if (C.getCustomerId() == customerId) {
        this.customers.remove(pos);
        return;
      } else {
        ++pos;
      }
    }
    return;
  }
}
