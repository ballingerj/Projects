import java.util.*;

public class primes {
  public static void main(String args[]) {
    printPrimes();
  } // main

  /*
  Write a function to print all of the prime numbers less than 100.
  To print a number use a print(int) function that already exists. Ex. print(1), print(99), print(x).
  */
  public static void printPrimes() {
    // Build the search space. Remember 1 is not a prime number.
    Vector<Integer> numbers = new Vector<Integer>(100);
    for (int i = 2; i < 101; i++) {
      numbers.add(i);
    } // for

    // Sieve of Eratosthenes method
    for (int i = 2; i < numbers.size(); i++) {
      for (int j = i + i; j < 101; j = j + i) {
        if (numbers.contains(j)) {
          numbers.removeElement(j);
        } // if
      } // for
    } // for
    System.out.println(numbers.toString());
  } // printPrimes()
} // primes
