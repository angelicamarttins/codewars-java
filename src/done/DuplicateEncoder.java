package done;

import java.util.*;
import java.util.stream.IntStream;

public class DuplicateEncoder {

  /*
    The goal of this exercise is to convert a string to a new string where each character in the new
    string is "(" if that character appears only once in the original string, or ")" if that character
    appears more than once in the original string. Ignore capitalization when determining if a character
    is a duplicate.

    Examples
    "din"      =>  "((("
    "recede"   =>  "()()()"
    "Success"  =>  ")())())"
    "(( @"     =>  "))(("
    Notes
    Assertion messages may be unclear about what they display in some languages.
    If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
 */


  public static void main(String[] args) {
    System.out.println(encode("Prespecialized"));
    System.out.println(encode("   ()(   "));
  }

  public static String encode(String word) {
    Map<String, List<Integer>> mappedString = new HashMap<>();
    List<String> listString = Arrays.asList(word.toLowerCase().split(""));

    IntStream.range(0, listString.size()).forEach(index -> mappedString.merge(
        listString.get(index),
        mappingFn(true, index, null),
        (existingList, newList) -> mappingFn(false, index, existingList)
    ));

    mappedString.forEach((key, value) -> IntStream.range(1, value.size()).forEach(value1 -> {
      if (value.get(0) > 1) {
        listString.set(value.get(value1), ")");
      } else {
        listString.set(value.get(value1), "(");
      }
    }));

    return String.join("", listString);
  }

  private static List<Integer> mappingFn(boolean first, int index, List<Integer> list) {
    if (first) {
      List<Integer> newList = new ArrayList<>();
      newList.add(1);
      newList.add(index);
      return newList;
    }

    Integer position = list.get(0);
    list.set(0, position + 1);
    list.add(index);
    return list;
  }
}
