import java.io.PrintStream;

/**
 * This class represents a Lease.
 *
 * @author samus250
 *
 */
public class Lease {
  private int customerId;
  private String registration;
  private int daysLeased;
  private boolean isOpen;

  /**
   * Constructs a Lease object.
   *
   * @param customerId
   *          - The Id number of the customer that leased the car.
   * @param registration
   *          - The registration (license plate) of the car that has been
   *          leased.
   * @param daysLeased
   *          - The number of days the car has been leased for.
   */
  public Lease(int customerId, String registration, int daysLeased) {
    super();
    this.customerId = customerId;
    this.registration = registration;
    this.daysLeased = daysLeased;
    this.isOpen = true;
  }

  /**
   * Returns the customer's Id number of the lease.
   *
   * @return The customer's Id number of the lease.
   */
  public int getCustomerId() {
    return customerId;
  }

  /**
   * Sets the customer's Id number of the lease.
   *
   * @param customerId
   *          - The customer's Id number.
   */
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  /**
   * Returns the registration (license plate) of the car that has been leased.
   *
   * @return The registration (license plate) of the car that has been leased.
   */
  public String getRegistration() {
    return registration;
  }

  /**
   * Sets the registration (license plate) of the car that has been leased.
   *
   * @param registration
   *          - Registration of the car that has been leased.
   */
  public void setRegistration(String registration) {
    this.registration = registration;
  }

  /**
   * Returns the term of the lease.
   *
   * @return Term of the lease (in days).
   */
  public int getDaysLeased() {
    return daysLeased;
  }

  /**
   * Sets the term of the lease.
   *
   * @param daysLeased
   *          - Term of the lease (in days).
   */
  public void setDaysLeased(int daysLeased) {
    this.daysLeased = daysLeased;
  }

  /**
   * Returns a the status of the lease - True if the lease is open, false if the
   * lease is closed.
   *
   * @return Boolean - True if the lease is open, false if the lease is closed.
   */
  public boolean getIsOpen() {
    return isOpen;
  }

  /**
   * Sets the status of the lease.
   *
   * @param isOpen
   *          - Boolean: Should be true if the lease is open, false if the lease
   *          is closed.
   */
  public void setOpen(boolean isOpen) {
    this.isOpen = isOpen;
  }

  /**
   * Prints all the information of the lease to a given PrintStream object.
   *
   * @param out
   *          - The PrintStream object where the lease will be printed to.
   */
  public void print(PrintStream out) {
    out.print("Customer Id: " + this.customerId + ", Registration: " + this.registration
        + ", Days Leased: " + this.daysLeased + ", Still Open: " + Util.convertBool(this.isOpen));
  }
}
