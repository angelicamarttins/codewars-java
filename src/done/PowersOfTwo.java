package done;

import java.util.Arrays;

public class PowersOfTwo {

  /*
    Complete the function that takes a non-negative integer n as input, and returns a list of all
    the powers of 2 with the exponent ranging from 0 to n ( inclusive ).
  */

  public static void main(String[] args) {
    System.out.println(Arrays.toString(powersOfTwo(0)));
    System.out.println(Arrays.toString(powersOfTwo(1)));
    System.out.println(Arrays.toString(powersOfTwo(2)));
  }

  public static long[] powersOfTwo(int n) {
    long[] result = new long[n + 1];

    for (int i = 0; i <= n; i++) {
      result[i] = (long) Math.pow(2, i);
    }

    return result;
  }

}
