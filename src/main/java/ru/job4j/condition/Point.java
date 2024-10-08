package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(1, 2, 3, 4);
        double result2 = Point.distance(2, 4, 6, 8);
        double result3 = Point.distance(3, 6, 9, 12);
        double result4 = Point.distance(5, 0, 0, 5);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 2) to (3, 4) " + result1);
        System.out.println("result (2, 4) to (6, 8) " + result2);
        System.out.println("result (3, 6) to (9, 12) " + result3);
        System.out.println("result (5, 0) to (0, 5) " + result4);
    }
}
