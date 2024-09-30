package done;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertCamelCase {

  /*
  Complete the method/function so that it converts dash/underscore delimited words into camel
  casing. The first word within the output should be capitalized only if the original word was
  capitalized (known as Upper Camel Case, also often referred to as Pascal case).
  The next words should be always capitalized.

  Examples
  "the-stealth-warrior" gets converted to "theStealthWarrior"

  "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

  "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
  */

  public static void main(String[] args) {
    System.out.println(toCamelCase("the_Stealth_Warrior"));
    System.out.println(toCamelCase("the-Stealth-Warrior"));
    System.out.println(toCamelCase("The_Stealth-Warrior"));
    System.out.println(toCamelCase("The_stealth-warrior"));
    System.out.println(toCamelCase("the_stealth-warrior"));
  }

  public static String toCamelCase(String string) {
    String[] splittedString = string.split("[_-]");

    if (string.isEmpty() || string.isBlank()) {
      return "";
    }

    return IntStream
        .range(0, splittedString.length)
        .mapToObj(index -> {
          String word = splittedString[index];
          char firstChar = word.charAt(0);
          String firstLetter = String.valueOf(firstChar);

          if (index == 0) {
            return word;
          }

          return Character.isUpperCase(firstChar)
              ? word
              : word.replaceFirst(firstLetter, firstLetter.toUpperCase());
        })
        .collect(Collectors.joining(""));
  }

}
