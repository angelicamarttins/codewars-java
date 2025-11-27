package done;

public class NarcissisticNumbers {
  public static void main(String[] args) {
    System.out.println(isNarcissistic(153));
    System.out.println(isNarcissistic(1652));
  }

  public static boolean isNarcissistic(int number) {
    String[] numbers = String.valueOf(number).split("");
    int numbersLength = numbers.length;
    double sum = 0;

    for (String num : numbers) {
      double n = Double.parseDouble(num);

      sum += Math.pow(n, numbersLength);
    }

    return Integer.valueOf((int) sum).equals(number);
  }
}
