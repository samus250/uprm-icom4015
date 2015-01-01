import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class implements a car rental system.
 *
 * @author manuel
 *
 */

public class CarRental {

  private CarRentalManager carRentalManager;
  private BufferedReader reader;

  /**
   * Creates a new CarRental system.
   */
  public CarRental() {
    this.carRentalManager = new CarRentalManager();
    InputStreamReader converter = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(converter);

    this.reader = reader;
  }

  private void prompt(String prompt) {
    System.out.printf("%s>", prompt);
  }

  private String[] readCommand() throws IOException {
    String command = reader.readLine();
    String result[] = command.split("\\s");
    return result;
  }

  /**
   * Handles the interaction related with managing customers.
   *
   * @throws IOException
   */
  public void manageCustomers() throws IOException {
    boolean done = false;
    String[] tokens;
    String command;
    while (!done) {
      prompt("Customer");
      tokens = readCommand();
      if (tokens == null || tokens.length < 1) {
        System.out.println("Illegal format for command.");
      }
      // Process the command
      command = tokens[0];
      if (command.equals("exit")) {
        done = true;
      } else if (command.equals("add")) {
        if (tokens.length != 5) {
          System.out
              .println("Illegal command use. Should be: add <firstName> <lastName> <phone> <id>");
        } else {
          Customer newCustomer;
          newCustomer = new Customer(tokens[1], tokens[2], tokens[3], Integer.parseInt(tokens[4]));
          this.carRentalManager.addCustomer(newCustomer);
        }
      } else if (command.equals("find")) {
        if (tokens.length != 2) {
          System.out.println("Illegal command use. Should be: find <customer id>");
        } else {
          Customer customer;
          int id = Integer.parseInt(tokens[1]);
          customer = this.carRentalManager.findCustomer(id);
          if (customer == null) {
            System.out.printf("Customer with id %d was not found.\n", id);
          } else {
            System.out.printf("Customer> ");
            customer.print(System.out);
            System.out.println();
          }
        }
      } else if (command.equals("erase")) {
        if (tokens.length != 2) {
          System.out.println("Illegal command use. Should be: erase <customer id>");
        }
        int id = Integer.parseInt(tokens[1]);
        if (this.carRentalManager.eraseCustomer(id)) {
          System.out.printf("Customer with id %d was erased.\n", id);
        } else {
          System.out.printf("Customer with id %d was not found.\n", id);
        }
      } else if (command.equals("print")) {
        this.carRentalManager.printCustomerList();
      } else {
        System.out.println("Illegal command.");
      }
    }
  }

  /**
   * Handles the interaction related with managing cars.
   *
   * @throws IOException
   */
  public void manageCar() throws IOException {
    boolean done = false;
    String[] tokens;
    String command;
    while (!done) {
      prompt("Car");
      tokens = readCommand();
      if (tokens == null || tokens.length < 1) {
        System.out.println("Illegal format for command.");
      }
      // Process the command
      command = tokens[0];
      if (command.equals("exit")) {
        done = true;
      } else if (command.equals("add")) {
        if (tokens.length != 7) {
          System.out
              .println(
                  "Illegal command use. Should be: add <make> <model> <year> <registration> "
                      + "<mileage> <price>");
        } else {
          Car newCar;
          newCar = new Car(tokens[1], tokens[2], tokens[3], tokens[4], Integer.parseInt(tokens[5]),
              Double.parseDouble(tokens[6]));
          this.carRentalManager.addCar(newCar);
        }
      } else if (command.equals("find")) {
        if (tokens.length != 2) {
          System.out.println("Illegal command use. Should be: find <registration>");
        } else {
          Car theCar;
          theCar = this.carRentalManager.findCar(tokens[1]);
          if (theCar == null) {
            System.out.printf("Car with registration %s was not found.\n", tokens[1]);
          } else {
            System.out.printf("Car > ");
            theCar.print(System.out);
            System.out.println();
          }
        }
      } else if (command.equals("profit")) {
        if (tokens.length != 2) {
          System.out.println("Illegal command use. Should be: profit <registration>");
        } else {
          Car theCar;
          theCar = this.carRentalManager.findCar(tokens[1]);
          if (theCar == null) {
            System.out.printf("Car with registration %s was not found.\n", tokens[1]);
          } else {
            System.out.printf("Car with registration %s has been leased for a profit of %f.\n",
                theCar.getRegistration(), theCar.profit());
          }
        }
      } else if (command.equals("print")) {
        this.carRentalManager.printCarList();
      } else {
        System.out.println("Illegal command.");
      }
    }
  }

  /**
   * Handles the interaction related with managing leases.
   *
   * @throws IOException
   */
  public void manageLease() throws IOException {
    boolean done = false;
    String[] tokens;
    String command;
    while (!done) {
      prompt("Lease");
      tokens = readCommand();
      if (tokens == null || tokens.length < 1) {
        System.out.println("Illegal format for command");
      }
      // Process the command
      command = tokens[0];
      if (command.equals("exit")) {
        done = true;
      } else if (command.equals("add")) {
        if (tokens.length != 4) {
          System.out
              .println("Illegal command use. Should be: add  <registration> <customer Id> <days> ");
        } else {
          int daysLeased = Integer.parseInt(tokens[3]);
          if (!this.carRentalManager.addLease(Integer.parseInt(tokens[2]), tokens[1], daysLeased)) {
            System.out
                .printf("Lease was not added because car with registrarion %s was not found or is"
                    + "unavailable.", tokens[1]);
          } else {
            System.out.printf(
                "Car with registration %s has been leased to customer %d for up to %d days.\n",
                tokens[1], Integer.parseInt(tokens[2]), daysLeased);
          }
        }
      } else if (command.equals("find")) {
        if (tokens.length != 3) {
          System.out.println("Illegal command use. Should be: find <registration> <customer id>");
        } else {
          String registration = tokens[1];
          int customerId = Integer.parseInt(tokens[2]);
          Lease theLease = this.carRentalManager.findLease(registration, customerId);
          if (theLease == null) {
            System.out.printf(
                "Lease for car with registration %s and customer with id %d was not found.\n",
                registration, customerId);
          } else {
            System.out.printf("Lease > ");
            theLease.print(System.out);
            System.out.println();
          }
        }
      } else if (command.equals("return")) {
        if (tokens.length != 3) {
          System.out.println("Illegal command use. Should be: return <registration> <customer id>");
        } else {
          String registration = tokens[1];
          int customerId = Integer.parseInt(tokens[2]);
          if (this.carRentalManager.releaseLease(customerId, registration)) {
            System.out.printf(
                "Lease for car with registration %s and customer with id %d was closed.\n",
                registration, customerId);
          } else {
            System.out.printf(
                "Lease for car with registration %s and customer with id %d was not found.\n",
                registration, customerId);
          }
        }
      } else if (command.equals("view")) {
        if (tokens.length != 2) {
          System.out.println("Illegal command use. Should be: view  <customer id>");
        } else {
          this.carRentalManager.printLeaseList(Integer.parseInt(tokens[1]));
        }
      } else if (command.equals("print")) {
        this.carRentalManager.printLeaseList();
      } else {
        System.out.println("Illegal command.");
      }
    }
  }

  /**
   * Main program of the application.
   *
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {
    CarRental carRental = new CarRental();
    boolean inUse = true;
    String input = "";
    InputStreamReader converter = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(converter);
    while (inUse) {
      System.out.println("1. Manage Customers");
      System.out.println("2. Manage Cars");
      System.out.println("3. Manage Leases");
      System.out.println("4. Exit");
      System.out.print("Option: > ");
      input = reader.readLine();
      if (input.equals("1")) {
        carRental.manageCustomers();
      } else if (input.equals("2")) {
        carRental.manageCar();
      } else if (input.equals("3")) {
        carRental.manageLease();
      } else if (input.equals("4")) {
        inUse = false;
      } else {
        System.out.printf("Unexpected option: %s\n", input);
      }
      System.out.print("\n");
    }
    System.out.println("Good Bye!");
  }

}
