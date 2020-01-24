package com.issquare;

public class Square {
    public static boolean isSquare(int n) {
        double res = Math.sqrt(n);
        return (res - (int) res) == 0;
    }
}
