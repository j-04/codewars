package com.findthestraynumber;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public static int stray(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList())
                .stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        return list.get(0);
    }
}
