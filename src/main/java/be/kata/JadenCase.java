package be.kata;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()){
            return null;
        }
        return Stream.of(phrase.split(" "))
                .map(elem -> new String(elem))
                .map(elem -> elem.substring(0, 1).toUpperCase() + elem.substring(1))
                .collect(Collectors.joining(" "));
    }
}
