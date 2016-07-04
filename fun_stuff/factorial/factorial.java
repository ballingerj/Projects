public class factorial {
  public static void main(String args[]) {
    System.out.println(factorial(Integer.parseInt(args[0])));
  } // main

  public static int factorial(int a) {
    if (a == 1) {
      return a;
    }
    return a * factorial(a-1);
  }
} // main
