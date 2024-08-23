package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double minusAndDivide(double first, double second) {
        return minus(first, second) + divide(first, second);
    }

    public static double sumAndMultiplyAndMinusAndDivide(double first, double second) {
        return sum(first, second) + multiply(first, second) + minus(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат minusAndDivide равен: " + minusAndDivide(10, 20));
        System.out.println("Результат sumAndMultiplyAndMinusAndDivide равен: "
                + sumAndMultiplyAndMinusAndDivide(10, 20));
    }
}
