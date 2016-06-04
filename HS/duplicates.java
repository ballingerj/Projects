import java.util.*;

public class duplicates {
  public static void main(String args[]) {

    // Initialize our test array
    int[] a = new int[] {1, 1, 2, 3, 4, 7, 7, 9, 2};

    System.out.println(findDuplicates(a).toString()); // 7, 2, 1
  } // main

  public static Vector<Integer> findDuplicates(int[] a) {

    // Use a hashtable to count the number of occurrences
    Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();

    // Create a vector to hold the duplicate values
    Vector<Integer> dupe = new Vector<Integer>();

    // Count the number of occurances of each integer
    for (int i = 0; i < a.length; i++) {
      if (!h.containsKey(a[i])) {
        h.put(a[i], 1);
      } else {
        h.put(a[i], h.get(a[i]) + 1);
      } // if-else
    } // for

    // Add keys where the value is 1 to the vector dupe
    Set<Integer> keys = h.keySet();
    for (Integer k : keys) {
      if (h.get(k) > 1) {
        dupe.add(k);
      } // if
    } // for

    // Return the vector consisting of the duplicate values
    return dupe;
  } // findDuplicates
} // duplicates
