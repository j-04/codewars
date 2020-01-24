package com.createphonenumber;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder("(");
        for (int i = 0; i < numbers.length; i++) {
            stringBuilder.append(numbers[i]);
            if (i == 2) {
                stringBuilder.append(")").append(" ");
            }
            if (i == 5)
                stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
