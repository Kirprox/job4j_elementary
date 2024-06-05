package ru.job4j.condition;

public class RectangleArea {

    /**
     * Вычисляет площадь прямоугольника по заданному периметру и отношению сторон.
     * @param p периметр прямоугольника
     * @param k отношение длин сторон (длина к ширине)
     * @return площадь прямоугольника
     */
    public static double square(double p, double k) {
        if (p <= 0 || k <= 0) {
            throw new IllegalArgumentException("Perimeter and ratio must be positive");
        }
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double p1 = 4, k1 = 1;
        double p2 = 6, k2 = 2;

        double result1 = RectangleArea.square(p1, k1);
        double result2 = RectangleArea.square(p2, k2);

        System.out.printf("p = %.1f, k = %.1f, area = %.1f%n", p1, k1, result1);
        System.out.printf("p = %.1f, k = %.1f, area = %.1f%n", p2, k2, result2);
    }
}
