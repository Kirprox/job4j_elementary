package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    // Конструктор для 2D точки
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    // Конструктор для 3D точки
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public void info() {
        if (this.z == 0) {
            System.out.println("Point[" + this.x + ", " + this.y + "]");
        } else {
            System.out.println("Point[" + this.x + ", " + this.y + ", " + this.z + "]");
        }
    }

    @Override
    public String toString() {
        return (this.z == 0) ? "Point[" + this.x + ", " + this.y + "]" : "Point[" + this.x + ", " + this.y + ", " + this.z + "]";
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        System.out.println(distance);
    }
}
