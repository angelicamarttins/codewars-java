package done;

public class isEven {

  public static void main(String[] args) {
    System.out.println(isEven(0));
    System.out.println(isEven(0.5));
    System.out.println(isEven(2.8));
    System.out.println(isEven(1));
    System.out.println(isEven(2));
    System.out.println(isEven(-4));
  }

  public static boolean isEven(double number) {
    return number % 2 == 0;
  }

}
