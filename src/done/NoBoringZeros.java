package done;

import java.util.*;
import java.util.stream.Collectors;

public class NoBoringZeros {

  public static void main(String[] args) {
    System.out.println(noBoringZeros(1450));
    System.out.println(noBoringZeros(1050));
    System.out.println(noBoringZeros(-1050));
    System.out.println(noBoringZeros(960000));
  }

  private static int noBoringZeros(int number) {
    List<String> list = Arrays.asList(String.valueOf(number).split(""));
    Collections.reverse(list);

    list.forEach(el -> {
      if (Objects.equals(el, "0")) {
        list.removeFirst();
      }
    });

    System.out.println(list);
    return Integer.parseInt(String.format("%.0f", number * 0.0001));
  }

}
