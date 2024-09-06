package done;

import java.util.Arrays;

/*
 * Complete the square sum function so that it squares each number passed into it and then sums the results together.
 */

public class SquareSum {
  public static void main(String[] args) {
    int[] array = {4, -3, 5};
    System.out.println(squareSum(array));
  }

  public static int squareSum(int[] n) {
    return Arrays.stream(n).reduce(0, (acc, element) -> {
      double result = Math.pow(element, 2);
      return acc + (int) result;
    });
  }
}