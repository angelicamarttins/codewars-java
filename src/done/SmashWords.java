package done;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SmashWords {

  /*
  Write a function that takes an array of words and smashes them together into a sentence and
  returns the sentence. You can ignore any need to sanitize words or add punctuation, but you
  should add spaces between each word. Be careful, there shouldn't be a space at the beginning or
  the end of the sentence!

  Example
  ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
  */

  public static void main(String[] args) {
    String [] sentence1 = {"hello"};
    System.out.println(smash(sentence1));

    String [] sentence2 = {"hello", "world"};
    System.out.println(smash(sentence2));

    String [] sentence3 = {"hello", "world", "this", "is", "great"};
    System.out.println(smash(sentence3));
  }

  public static String smash(String... words) {
    return String.join(" ", words);
  }

}
