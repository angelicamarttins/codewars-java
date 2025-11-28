package done;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeCounter {

  public static void main(String[] args) {
    System.out.println(countChange(4,  new int[] {1,2}));
    System.out.println(countChange(10, new int[] {5,2,3}));
    System.out.println(countChange(11, new int[] {5,7}));
    System.out.println(countChange(0,  new int[] {1,2}));

  }

  public static int countChange(final int money, final int[] coins) {
    if (money == 0) return 1;

    List<Integer> coinsList = Arrays.stream(coins).boxed().toList();
    int sumOfAllCombinations = 0;
    int sumOfAllCoins = Arrays.stream(coins).sum();

    if (sumOfAllCoins == money) sumOfAllCombinations++;

    for (Integer coin : coinsList) {
      int sum = 0;

      while (sum < money) {
        sum += coin;

        if (sum == money) sumOfAllCombinations++;
      }

      int a = money - coin;

      if (coinsList.contains(a)) {
        int summ = 0;


      }

    }

    return sumOfAllCombinations;
  }
}