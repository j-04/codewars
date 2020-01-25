package com.jadencasingstrings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JadenCase {
    public static String toJadenCase(String phrase) {
        return (phrase == null || phrase.isEmpty()) ? null : Stream.of(phrase.split(" "))
                .map(w -> w.replace(w.charAt(0), Character.toUpperCase(w.charAt(0))))
                .collect(Collectors.joining(" "));
    }
}
