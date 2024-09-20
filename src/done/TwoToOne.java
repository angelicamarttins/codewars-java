package done;

import java.util.*;

public class TwoToOne {

  /*
    Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string (alphabetical ascending), the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

    Examples:
    a = "xyaabbbccccdefww"
    b = "xxxxyyyyabklmopq"
    longest(a, b) -> "abcdefklmopqwxy"

    a = "abcdefghijklmnopqrstuvwxyz"
    longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
  */

  public static void main(String[] args) {
    System.out.println(longest("aretheyhere", "yestheyarehere"));
  }

  public static String longest (String s1, String s2) {
    char[] charArray = s1.concat(s2).toCharArray();

    Arrays.sort(charArray);

    HashSet<char[]> set = new HashSet<>(List.of(charArray));

    for (char[] array : set) {
      System.out.println(Arrays.toString(array));
    }

    return "";
  }

}
