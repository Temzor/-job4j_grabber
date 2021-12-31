package ru.leetcode;


import org.junit.Assert;
import org.junit.Test;

public class ClimbStairsTest {
    @Test
    public void testOne() {
        ClimbStairs climbStairs = new ClimbStairs();
        int step = 3;
        Assert.assertEquals(3, climbStairs.climbStairs(step));
    }

    @Test
    public void testTwo() {
        ClimbStairs climbStairs = new ClimbStairs();
        int step = 4;
        Assert.assertEquals(5, climbStairs.climbStairs(step));
    }
}