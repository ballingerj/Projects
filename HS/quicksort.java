import java.util.*;

public class quicksort {
  public static void main(String args[]) {
    int myArray[] = new int[] {8, 6, 1, 2, 5, 7, 6, 6, 9, 10, 1, 2, 2, 5, 4, 4, 3, 7};
    sort(myArray);
  } // main

  // Write an algorithm that manually sorts an array called myArray that contains integers. Do not use any built-in sort methods.
  public static void sort(int[] myArray) {
    // Make the array into a vector
    Vector<Integer> v = new Vector<Integer>();
    for (int i = 0; i < myArray.length; i++) {
      v.add(myArray[i]);
    } // for

    // Shuffle v to make the order random
    Collections.shuffle(v);
    quick(v, 0, v.size() - 1);
    System.out.println(v.toString());
  } // sort

  public static void quick(Vector<Integer> v, int lo, int hi) {
    if (hi <= lo) {
      return;
    } // if

    // Create the partitions
    int p = partition(v, lo, hi);

    // Recursive calls to sort on the partitions
    quick(v, lo, p - 1);
    quick(v, p + 1, hi);
  } // quicksort

  public static int partition(Vector<Integer> v, int lo, int hi) {
    int pivot = v.get(lo);
    int i = lo;
    int j = hi + 1;
    int temp;
    while(true) {

      // Find the element to swap
      while (v.get(++i) < pivot) {
        if (i == hi) {
          break;
        } // if
      } // while

      // Continue looking
      while (v.get(--j) > pivot) {
        if (j == lo) {
          break;
        } // if
      } // while

      // Break condition
      if (i >= j) {
        break;
      } // if

      // Swap
      temp = v.get(i);
      v.set(i, v.get(j));
      v.set(j, temp);
    } // while(true)

    // Now swap
    temp = v.get(lo);
    v.set(lo, v.get(j));
    v.set(j, temp);

    return j;
  } // partition
} // quicksort
