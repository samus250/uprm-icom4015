package edu.uprm.ece.icom4015.person;

public class Employee extends NaturalPerson {
  private double salary;

  public Employee(String firstName, String lastName, int age, double salary) {
    super(firstName, lastName, age);
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public String toString() {
    return super.toString() + ", Salary: " + salary;
  }
}
