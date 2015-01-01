package edu.uprm.ece.icom4015.recursion;

public class RecursiveTools {

  public static String reverseString(String arg) {
    if (arg.length() == 0 || arg.length() == 1) {
      return arg;
    } else {
      return reverseString(arg.substring(1)) + arg.charAt(0);
    }
  }

  public static int countCopies(char c, String arg) {
    if (arg.length() == 0) {
      return 0;
    } else {
      int count = 0;
      if (arg.charAt(0) == c) {
        count++;
      }
      return count + countCopies(c, arg.substring(1));
    }
  }

  public static String replaceAll(char c1, char c2, String arg) {
    if (arg.length() == 0) {
      return "";
    } else {
      String temp = "";
      if (c1 == arg.charAt(0)) {
        temp = temp + c2;
      } else {
        temp = "" + arg.charAt(0);
      }
      return temp + replaceAll(c1, c2, arg.substring(1));
    }
  }

  public static boolean substring(String s1, String s2) {
    if (s1.length() > s2.length()) {
      return false;
    } else {
      boolean isSubstring = true;
      for (int i = 0; i < s1.length(); ++i) {
        if (s1.charAt(i) != s2.charAt(i)) {
          isSubstring = false;
        }
      }
      if (isSubstring) {
        return true;
      } else {
        return substring(s1, s2.substring(1));
      }
    }
  }

  // exercises
  public static String charCutter(char c, String s) {
    if (s.length() == 0) {
      return "";
    } else if (s.charAt(0) == c) {
      return charCutter(c, s.substring(1));
    } else {
      return s.charAt(0) + charCutter(c, s.substring(1));
    }
  }

  public static String stringCutter(String s1, String s2) {
    if (s2.length() < s1.length()) {
      return s2;
    } else if (substring(s1, s2.substring(0, s1.length()))) {
      return stringCutter(s1, s2.substring(s1.length())); // To remove space, add + 1.
    } else {
      return s2.charAt(0) + stringCutter(s1, s2.substring(1));
    }

  }
}
