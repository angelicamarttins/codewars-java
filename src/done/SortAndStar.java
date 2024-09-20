package done;

import java.util.Arrays;

public class SortAndStar {

  public static void main(String[] args) {
    System.out.println(twoSort(new String[]{
        "turns",
        "out",
        "random",
        "test",
        "cases",
        "are",
        "easier",
        "than",
        "writing",
        "out",
        "basic",
        "ones"
    }));
  }

  public static String twoSort(String[] s) {
    return String.join(
        "***",
        Arrays.stream(s)
            .sorted()
            .toArray(String[]::new)[0]
            .split(""));
  }

}
