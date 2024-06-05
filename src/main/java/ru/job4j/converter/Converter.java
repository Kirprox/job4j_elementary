package ru.job4j.converter;

public class Converter {
    private static final float EURO_RATE = 70;
    private static final float DOLLAR_RATE = 60;

    /**
     * Converts rubles to euros.
     * @param value amount in rubles
     * @return equivalent amount in euros
     */
    public static float rubleToEuro(float value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        return value / EURO_RATE;
    }

    /**
     * Converts rubles to dollars.
     * @param value amount in rubles
     * @return equivalent amount in dollars
     */
    public static float rubleToDollar(float value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        return value / DOLLAR_RATE;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = Math.abs(expected - output) < 0.0001;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);

        input = 180;
        expected = 3;
        output = Converter.rubleToDollar(input);
        passed = Math.abs(expected - output) < 0.0001;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed);

        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euros.");
        System.out.println("180 rubles are " + dollar + " dollars.");
    }
}
