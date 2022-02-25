package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To2Then4() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2To2Then2() {
        int first = 2;
        int second = 2;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To2Then2() {
        int first = 1;
        int second = 2;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To5Then5() {
        int first = 1;
        int second = 2;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2To2To2Then2() {
        int first = 2;
        int second = 2;
        int third = 2;
        int fourth = 2;
        int result = Max.max(first, second, third, fourth);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To2To1Then2() {
        int first = 1;
        int second = 2;
        int third = 2;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To5To4Then5() {
        int first = 1;
        int second = 2;
        int third = 5;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}