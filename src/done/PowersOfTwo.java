package done;

import java.util.Arrays;

public class PowersOfTwo {

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
