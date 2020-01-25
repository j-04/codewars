package com.issquare;

import com.createphonenumber.Kata;
import com.findthestraynumber.Solution;
import com.jadencasingstrings.JadenCase;
import com.stringorder.Order;
import com.twotoone.TwoToOne;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class Tests {

    @org.junit.Test
    public void isSquare() {
        boolean res = false;
        res = Square.isSquare(-1);
        assertFalse(res);
        res = Square.isSquare(0);
        assertTrue(res);
        res = Square.isSquare(3);
        assertFalse(res);
        res = Square.isSquare(4);
        assertTrue(res);
        res = Square.isSquare(25);
        assertTrue(res);
        res = Square.isSquare(111480849);
        assertFalse(res);
    }

    @Test
    public void testOrder() {
        assertEquals("Thi1s is2 3a T4est", Order.order("is2 Thi1s T4est 3a" ));
    }

    @Test
    public void testTwoToOne() {
        var a = "xyaabbbccccdefww";
        var b = "xxxxyyyyabklmopq";
        assertEquals("abcdefklmopqwxy" ,TwoToOne.longest(a, b));
    }

    @Test
    public void testSolution() {
        int[] numbers = {17, 17, 6, 17, 17, 17, 17};
        assertEquals(6, Solution.stray(numbers));
    }

    @Test
    public void testCreatePhoneNumber() {
        assertEquals("(123) 456-7890", Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void testJadenCasingStrings() {
        String actual = JadenCase.toJadenCase("hi hello");
        assertEquals("Hi Hello", actual);
    }
}