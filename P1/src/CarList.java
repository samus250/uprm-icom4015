import java.util.LinkedList;
import java.util.List;

/**
 * This class implements a list of cars.
 *
 * @author manuel
 *
 */
public class CarList {
  List<Car> cars;

  /**
   * Default constructor. Creates a list with no cars.
   */
  public CarList() {
    super();
    cars = new LinkedList<Car>();
  }

  /**
   * Adds a new car to the list.
   *
   * @param theCar the new car to be added
   */
  public void addCar(Car theCar) {
    this.cars.add(0, theCar);
  }

  /**
   * Finds a car with a given registration.
   *
   * @param registration The registration (e.g., LER-212)
   * @return the car with the given registration, or null if no car has the registration.
   */
  public Car findCar(String registration) {
    for (Car car : cars) {
      if (car.getRegistration().equals(registration)) {
        return car;
      }
    }
    return null;
  }

  /**
   * Prints all the cars in the list.
   */
  public void printCarList() {
    int count = 1;
    for (Car car : cars) {
      System.out.printf("%d. ", count);
      car.print(System.out);
      System.out.println();
      count++;
    }
  }
}
