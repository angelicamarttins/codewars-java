package done;

public class NoBoringZeros {

  /*
    Numbers ending with zeros are boring.

    They might be fun in your world, but not here.

    Get rid of them. Only the ending ones.

    1450 -> 145
    960000 -> 96
    1050 -> 105
    -1050 -> -105
    Zero alone is fine, don't worry about it. Poor guy anyway
  */

  public static void main(String[] args) {
    System.out.println(noBoringZeros(1450));
    System.out.println(noBoringZeros(1050));
    System.out.println(noBoringZeros(-1050));
    System.out.println(noBoringZeros(960000));
  }

  private static int noBoringZeros(int number) {
    if (number == 0) {
      return 0;
    }

    String numberStr = Integer.toString(number);

    int endIndex = numberStr.length();
    while (endIndex > 0 && numberStr.charAt(endIndex - 1) == '0') {
      endIndex--;
    }

    return Integer.parseInt(numberStr.substring(0, endIndex));
  }

}
