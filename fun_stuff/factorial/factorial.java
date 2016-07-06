public class factorial {
  public static void main(String args[]) {
    try {
        double d = Double.parseDouble(args[0]);
        if (d % 1.0 != 0) {
          System.out.println("You must input an integer!");
          System.exit(0);
        } // if
        d = factorial(d);
        int i = (int) d;
        System.out.println(i);
    } catch (Exception e) {
      System.out.println("You must input as an interger!");
      e.printStackTrace();
    } // try-catch
  } // main

  public static double factorial(double a) {
    if (a == 1.0) {
      return a;
    }
    return a * factorial(a-1.0);
  } // factorial
} // main
