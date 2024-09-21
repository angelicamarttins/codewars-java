package done;

import java.util.Arrays;
import java.util.List;

public class CamelCase {

  /*
    Complete the solution so that the function will break up camel casing,
    using a space between words.

    Example
    "camelCasing"  =>  "camel Casing"
    "identifier"   =>  "identifier"
    ""             =>  ""
  */

  public static void main(String[] args) {
    System.out.println(camelCase("camelCase"));
    System.out.println(camelCase("camelCaseTest"));
    System.out.println(camelCase("identifier"));
    System.out.println(camelCase("    "));
  }

  public static String camelCase(String string) {
    return String.join(" ", string.split("(?<=[a-z])(?=[A-Z])"));
  }

}
