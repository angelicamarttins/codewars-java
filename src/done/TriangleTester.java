package done;

public class TriangleTester {

  public static void main(String[] args) {
    System.out.println(isTriangle(1, 2, 2));
    System.out.println(isTriangle(7, 2, 2));
    System.out.println(isTriangle(2, 2, 2));
    System.out.println(isTriangle(0, 0, 0));
  }

  public static boolean isTriangle(int a, int b, int c) {
    if (a == 0 && b == 0 && c ==0) {
      throw new IllegalArgumentException("Surface is less than zero");
    }

    return a + b > c && a + c > b && b + c > a;
  }

}
