package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to52then4point12() {
        double expected = 4.12;
        Point a = new Point(1, 1);
        Point b = new Point(5, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to34then2point82() {
        double expected = 2.82;
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to68then5point65() {
        double expected = 5.65;
        Point a = new Point(2, 4);
        Point b = new Point(6, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123to456then5point19() {
        double expected = 5.19;
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when246to642then5point65() {
        double expected = 5.65;
        Point a = new Point(2, 4, 6);
        Point b = new Point(6, 4, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}