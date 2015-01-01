package edu.uprm.ece.icom4015.recursion.main;

import edu.uprm.ece.icom4015.recursion.RecursiveTools;

public class TestRecursion {
  public static void main(String[] args) {
    // Reverse.
    String reverse1 = RecursiveTools.reverseString("Manuel");
    String reverse2 = RecursiveTools.reverseString("Jos");
    System.out.println("Reverse of Manuel: " + reverse1);
    System.out.println("Reverse of Jos: " + reverse2);

    // Count occurences.
    System.out.println("Copies of i in Interdisciplinary: "
        + RecursiveTools.countCopies('i', "Interdisciplinary"));
    System.out.println("Copies of i in Manuel: " + RecursiveTools.countCopies('i', "Manuel"));

    // Replace.
    System.out.println("Replace of o in koko with a: "
        + RecursiveTools.replaceAll('o', 'a', "koko"));
    System.out.println("Replace of a in Living La Vida Loca with e: "
        + RecursiveTools.replaceAll('a', 'e', "Living La Vida Loca"));

    // Substring.

    // Test my methods.
    System.out.println("Erase 'a' from Living La Vida Loca: "
        + RecursiveTools.charCutter('a', "Living La Vida Loca"));

    System.out.println("Erase 'car' from The red car is a bad car for new car buyers: "
        + RecursiveTools.stringCutter("car", "The red car is a bad car for new car buyers"));

    System.out.println(
        "Erase 'car' from racecar: " + RecursiveTools.stringCutter("car", "racecar"));

    System.out.println("Erase 'car' from car: " + RecursiveTools.stringCutter("car", "car"));
  }
}
