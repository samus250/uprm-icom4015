package edu.uprm.ece.icom4015.person;

public class PersonTest {
  public static void main(String[] args) {
    Person P = new NaturalPerson("Jose", "Diaz", 20);
    System.out.println("Person: " + P);
    P = new Employee("Amy", "Smith", 23, 50000.00);
    System.out.println("Employee: " + P);

  }

}
