package ru.job4j.condition;

public class TriangleArea {

    /**
     * Вычисляет площадь треугольника по формуле Герона.
     * @param a длина первой стороны
     * @param b длина второй стороны
     * @param c длина третьей стороны
     * @return площадь треугольника
     * @throws IllegalArgumentException если стороны не образуют треугольник или имеют некорректные значения
     */
    public static double area(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Sides do not form a triangle");
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double a = 2, b = 2, c = 2;
        double result = TriangleArea.area(a, b, c);
        System.out.printf("Area of triangle with sides %.1f, %.1f, %.1f = %.2f%n", a, b, c, result);
    }
}
