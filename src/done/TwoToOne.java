import java.util.Arrays;
import java.util.Collections;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {

    var splittedStrings = Arrays.asList(s1.concat(s2).split(""));
    Collections.sort(splittedStrings);
    return String.join("", Arrays.stream(splittedStrings.toArray()).distinct().toArray(String[]::new));

    }
}