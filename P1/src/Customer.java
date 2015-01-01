import java.io.PrintStream;

/**
 * This class represents a Customer.
 *
 * @author samus250
 *
 */
public class Customer {
  private String firstName;
  private String lastName;
  private String phoneNumber;
  int userId;

  /**
   * Constructs a Customer object.
   *
   * @param firstName
   *          - The customer's first name.
   * @param lastName
   *          - The customer's last name.
   * @param phoneNumber
   *          - The customer's phone number.
   * @param userId
   *          - The customer's ID number.
   */
  public Customer(String firstName, String lastName, String phoneNumber, int userId) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.userId = userId;
  }

  /**
   * Returns the customer's first name.
   *
   * @return The customer's first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the customer's first name.
   *
   * @param firstName
   *          - The customer's first name.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Returns the customer's last name.
   *
   * @return The customer's last name.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets the customer's last name.
   *
   * @param lastName
   *          - The customer's last name.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Returns the customer's phone number.
   *
   * @return The customer's phone number.
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Sets the customer's phone number.
   *
   * @param phoneNumber
   *          - The customer's phone number.
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * Returns the customer's ID number.
   *
   * @return The customer's ID number.
   */
  public int getCustomerId() {
    return userId;
  }

  /**
   * Sets the customer's ID number.
   *
   * @param userId
   *          - The customer's ID number.
   */
  public void setCustomerId(int userId) {
    this.userId = userId;
  }

  /**
   * Prints the customer's information to a given PrintStream object.
   *
   * @param out
   *          - The PrintStream object to where the information is going to be
   *          printed.
   */
  public void print(PrintStream out) {
    out.print("Id: " + this.userId + ", First Name: " + this.firstName + ", Last Name: "
        + this.lastName + ", Phone: " + this.phoneNumber);
  }
}
