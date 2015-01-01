package edu.uprm.ece.icom4015.person;

public class NaturalPerson implements Person {
  private String firstName;
  private String lastName;
  private int age;

  public NaturalPerson(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  @Override
  public String getFirstName() {
    return firstName;
  }

  @Override
  public String getLastName() {
    return lastName;
  }

  @Override
  public int getAge() {
    return age;
  }

  public String toString() {
    return "Full Name: " + firstName + " " + lastName + ", Age: " + age;
  }

}
