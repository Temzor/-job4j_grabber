package ru.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MergeTest {
    @Test
    public void testOne() {
        Merge merge = new Merge();
        int[] fist = new int[] {1, 2, 3, 0, 0, 0};
        int[] second = new int[] {2, 5, 6};
        int m = 3;
        int n = 3;
        Assert.assertArrayEquals(new int[] {1, 2, 2, 3, 5, 6}, merge.merge(fist, m, second, n));
    }

    @Test
    public void testTwo() {
        Merge merge = new Merge();
        int[] fist = new int[] {1};
        int[] second = new int[] {};
        int m = 1;
        int n = 0;
        Assert.assertArrayEquals(new int[] {1}, merge.merge(fist, m, second, n));
    }

    @Test
    public void testThree() {
        Merge merge = new Merge();
        int[] fist = new int[] {0};
        int[] second = new int[] {1};
        int m = 0;
        int n = 1;
        Assert.assertArrayEquals(new int[] {1}, merge.merge(fist, m, second, n));
    }
}

