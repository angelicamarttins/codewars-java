import java.util.Arrays;

public class Maskify {
  public static void main(String[] args) {
    System.out.println(maskify("4556364607935616"));
    System.out.println(maskify("11111"));
    System.out.println(maskify("1"));
  }

  public static String maskify(String mask) {
    String[] stringifyMask = mask.split("");
    int stringifyMaskLength = stringifyMask.length;

    if (stringifyMaskLength > 4) {
      String[] newMask = Arrays
          .stream(stringifyMask, stringifyMaskLength - 4, stringifyMaskLength)
          .toArray(String[]::new);
      int difference = stringifyMaskLength - 4;

      return "#".repeat(difference).concat(String.join("", newMask));
    }

    return mask;
  }
}
