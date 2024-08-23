package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float inputEuro = 140;
        float inputDollar = 540;
        float expectedEuro = 2;
        float expectedDollar = 9;
        float outputEuro = Converter.rubleToEuro(inputEuro);
        float outputDollar = Converter.rubleToDollar(inputDollar);
        boolean passedEuro = expectedEuro == outputEuro;
        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("540 rubles are 9. Test result : " + passedDollar);
    }
}
