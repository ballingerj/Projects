import java.util.*;

public class anagram {
  public static void main(String args[]) {
    String a = "TEAM";
    String b = "MEAT";
    String c = "MEET";
    String d = " TEaM";
    System.out.println(isAnagram(a, b)); // true
    System.out.println(isAnagram(b, c)); // false
    System.out.println(isAnagram(a, c)); // false
    System.out.println(isAnagram(a, d)); // true
    System.out.println(isAnagram(b, d)); // true
  } // main

  // Write a method that determines if two strings are anagrams of each other. For example, “TEAM” and “MEAT” would return true.
  public static boolean isAnagram(String a, String b) {
    // Remove whitespace using a regular expression
    a = a.replaceAll("\\s+", "");
    b = b.replaceAll("\\s+", "");

    // Change to uppercase to reduce amount of possible characters
    a = a.toUpperCase();
    b = b.toUpperCase();

    // Turn the string into char arrays
    char i[] = a.toCharArray();
    char j[] = b.toCharArray();

    // Sort the arrays
    Arrays.sort(i);
    Arrays.sort(j);

    // Now check for equality
    for (int c = 0; c < i.length; c++) {
      // Since these are sorted, the indicies should match up.
      if (i[c] != j[c]) {
        return false;
      } // if
    } // for

    // Else, return true
    return true;
  } // isAnagram
} // anagram
