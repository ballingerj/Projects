import java.util.*;

public class common {
  public static void main(String args[]) {
    String hello = "HELLO";
    mostCommon(hello);
    String tests = "TEsTS";
    mostCommon(tests);
  } // main

  public static void mostCommon(String s) {
    s = s.toUpperCase();
    char[] c = s.toCharArray();
    Hashtable<Character, Integer> letters = new Hashtable<Character, Integer>();
    for (int i = 0; i < c.length; i++) {
      if (!letters.containsKey(c[i])) {
        letters.put(c[i], 1);
      } else {
        letters.put(c[i], letters.get(c[i]) + 1);
      } // if-else
    } // for

    // Find the max number of occurrences
    int max = 0;
    for (int v : letters.values()) {
      if (v > max) {
        max = v;
      } // if
    } // for

    // Now find the key(s) associated with that value
    Set<Character> keys = letters.keySet();
    for (Character k : keys) {
      if (letters.get(k) == max) {
        System.out.println(k);
      } // if
    } // for
    System.out.println();
  } // mostCommon
} // common
