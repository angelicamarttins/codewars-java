package done;

import java.util.Arrays;

public class StrayNumber {

  public static void main(String[] args) {
    System.out.println(stray(new int[]{1, 1, 2}));
    System.out.println(stray(new int[]{1, 2, 2}));
  }

  public static int stray(int[] numbers) {
    Object[] set = Arrays.stream(numbers).boxed().distinct().toArray();

    int a = (int) Arrays.stream(numbers).filter(number -> number == (int) set[0]).count();
    int b = (int) Arrays.stream(numbers).filter(number -> number == (int) set[1]).count();

    return a < b ? (int) set[0] : (int) set[1];
  }

}
