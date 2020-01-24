package com.twotoone;

import java.util.*;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String one = s1 + s2;
        List<String> list = new ArrayList<>(new HashSet<>(Arrays.asList(one.split(""))));
        Collections.sort(list);
        return String.join("", list);
    }
}