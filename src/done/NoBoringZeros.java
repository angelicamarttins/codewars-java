package done;

public class NoBoringZeros {

  public static void main(String[] args) {
    System.out.println(noBoringZeros(1450));
    System.out.println(noBoringZeros(1050));
    System.out.println(noBoringZeros(-1050));
    System.out.println(noBoringZeros(960000));
  }

  private static int noBoringZeros(int number) {
    while (number % 10 == 0) {
      number /= 10;
    }

    return number;
  }

}
