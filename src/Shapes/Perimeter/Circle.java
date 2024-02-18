package Shapes.Perimeter;

import java.io.*;

class CirclePerimeter {
    static final double PI = Math.PI;

    static double calculatePerimeter(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        double radius = 5; // Replace with your desired radius
        System.out.println("Perimeter of the circle is: " + calculatePerimeter(radius));
    }
}
