package com.stringorder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    public static String order(String words) {
        if (words == null || words.isEmpty())
            return "";
        var wordsList = new ArrayList<>(Arrays.asList(words.split(" ")));
        List<String> result = new ArrayList<>();
        for (int index = 0, number = 1; wordsList.size() != 0;) {
            var word = wordsList.get(index);
            if (word.contains(number + "")) {
                result.add(word);
                wordsList.remove(word);
                index = 0;
                number++;
                continue;
            }
            index++;
        }
        return String.join(" ", result);
    }
}
