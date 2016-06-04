public class OnBase{
  public static void main(String args[]) {
    ob();
  } // main

  public static void ob() {
    for (int i = 1; i <= 100; i++) {
      System.out.println(i);
      if (i % 3 == 0 && i % 7 == 0) {
        System.out.println("OnBase");
      } else if (i % 3 == 0) {
        System.out.println("On");
      } else if (i % 7 == 0) {
        System.out.println("Base");
      } // if-else if
    } // for
  } // ob()
} // OnBase
