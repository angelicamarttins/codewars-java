package done;

public class Century {
  public static void main(String[] args) {
    System.out.println(century(2000));
  }

  public static int century(int number) {
    if (number <= 100) return 1;

    String stringNumber = String.valueOf(number);
    int decimalPlace = stringNumber.length() == 3 ? 1 : 2;
    int centuryStart = Integer.valueOf(stringNumber.substring(0, decimalPlace));
    boolean centuryEnd = stringNumber.endsWith("00");

    if (centuryEnd) {
      return centuryStart;
    }

    return centuryStart + 1;
  }
}
