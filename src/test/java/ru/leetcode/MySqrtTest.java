package ru.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MySqrtTest {
    @Test
    public void testOne() {
        MySqrt mySqrt = new MySqrt();
        int input = 4;
        Assert.assertEquals(2, mySqrt.mySqrt(input));
    }

    @Test
    public void testTwo() {
        MySqrt mySqrt = new MySqrt();
        int input = 8;
        Assert.assertEquals(2, mySqrt.mySqrt(input));

    }
}
