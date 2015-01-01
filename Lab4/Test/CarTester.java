import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author juansuris
 *
 */
public class CarTester {

  /**
   * Test method for {@link Car#Car(double)}.
   */
  @Test
  public void testCarDouble() {
    Car car = new Car(30.0);
    assertTrue(car.getGasEfficiency() == 30.0 && car.getGas() == 0.0 && car.getOdometer() == 0.0);
  }

  /**
   * Test method for {@link Car#Car(double, double)}.
   */
  @Test
  public void testCarDoubleDouble() {
    Car car = new Car(30.0, 18.0);
    assertTrue(car.getGasEfficiency() == 30.0 && car.getGas() == 18.0 && car.getOdometer() == 0.0);
  }

  /**
   * Test method for {@link Car#getGas()}.
   */
  @Test
  public void testGetGas() {
    Car car = new Car(30.0, 18.0);
    assertTrue(car.getGas() == 18.0);
  }

  /**
   * Test method for {@link Car#getGasEfficiency()}.
   */
  @Test
  public void testGetGasEfficiency() {
    Car car = new Car(30.0, 18.0);
    assertTrue(car.getGasEfficiency() == 30.0);
  }

  /**
   * Test method for {@link Car#getOdometer()}.
   */
  @Test
  public void testGetOdometer() {
    Car car = new Car(30.0, 18.0);

    double odo1 = car.getOdometer();

    car.drive(30.0);

    double odo2 = car.getOdometer();

    assertTrue(odo1 == 0.0 && odo2 == 30.0);
  }

  /**
   * Test method for {@link Car#drive(double)}.
   */
  @Test
  public void testDrive() {
    Car car = new Car(30.0, 18.0);

    double drove = car.drive(30.0);

    assertTrue(drove == 30.0 && car.getOdometer() == 30.0 && car.getGas() == 17.0);
  }

  /**
   * Test method for {@link Car#addGas(double)}.
   */
  @Test
  public void testAddGas() {
    Car car = new Car(30.0, 18.0);

    double newGas = car.addGas(1.5);

    assertTrue(newGas == 19.5 && car.getGas() == 19.5);
  }

  /**
   * Test method for {@link Car#range()}.
   */
  @Test
  public void testRange() {
    Car car = new Car(30.0, 18.0);

    assertTrue(car.range() == 18.0 * 30.0);
  }

}
