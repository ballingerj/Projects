import java.util.*;

public class duplicates {
  public static void main(String args[]) {
    Integer[] a = new Integer[] {1, 1, 2, 3, 4, 7, 7, 9, 2};
    System.out.println(removeDuplicates(a));
  } //

  /* Write a function that accepts an array and returns all the duplicate items in the array.
  The return array should contain distinct values. */
  public static Set removeDuplicates(Integer[] a) {
    // There are no duplicates in a set, so we use that
    return new HashSet<Integer>(Arrays.asList(a));
  } // removeDuplicates
} // duplicates
