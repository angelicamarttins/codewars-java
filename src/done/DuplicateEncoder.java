package done;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class DuplicateEncoder {
  private static String newString = "";

  public static void main(String[] args) {
    //System.out.println(encode("Prespecialized"));
    System.out.println(encode("   ()(   "));
  }

  public static String encode(String string) {
    Map<String, Integer> map = new HashMap<>();
    newString = string.toLowerCase();

    Arrays.asList(string.toLowerCase().split("")).forEach(letter -> {
      map.merge(letter, 1, Integer::sum);
    });

    map.forEach((key, value) -> {
      System.out.println(key + " " + value);
      if (value > 1) {
        System.out.println("mais um");
        newString = newString.replaceAll(Pattern.quote(key), ")");
        System.out.println(newString);
      } else {
        System.out.println("um");
        newString = newString.replaceAll(Pattern.quote(key), "(");
      }
    });
    System.out.println(map);

    return newString;
  }
}

/*
* Criar outro map, dentro do map, colocando a quantidade de aparições e as posições de cada aparição
* Daí, buscar pela chave do primeiro map e dentro do segundo map, buscar pela letra e alterar nas
* posições em que aparece a letra na string original adicionando ( ou )
*/
