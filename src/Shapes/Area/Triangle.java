package Shapes.Area;

import java.util.Scanner;

class Triangle {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the width of the Triangle:");
        double base = s.nextDouble();
        System.out.println("Enter the height of the Triangle:");
        double height = s.nextDouble();

        // Area = (width * height) / 2
        double area = (base * height) / 2;
        System.out.println("Area of Triangle is: " + area);
    }
}
