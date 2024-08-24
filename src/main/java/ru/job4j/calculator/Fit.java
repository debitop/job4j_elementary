package ru.job4j.calculator;

public class Fit {

    private static final int MALE_BASE_HEIGHT = 100;
    private static final int FEMALE_BASE_HEIGHT = 110;
    private static final double COEFFICIENT = 1.15;

    public static double calculateIdealWeight(short height, int baseHeight) {
        return (height - baseHeight) * COEFFICIENT;
    }

    public static double manWeight(short heightMan) {
        return calculateIdealWeight(heightMan, MALE_BASE_HEIGHT);
    }

    public static double womanWeight(short heightWoman) {
        return calculateIdealWeight(heightWoman, FEMALE_BASE_HEIGHT);
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;

        if (heightMan <= 0 || heightWoman <= 0) {
            System.out.println("Height must be greater than 0.");
            return;
        }

        double man = manWeight(heightMan);
        System.out.println("Ideal weight for a man with height 187 cm is " + man + " kg.");

        double woman = womanWeight(heightWoman);
        System.out.println("Ideal weight for a woman with height 170 cm is " + woman + " kg.");
    }
}


