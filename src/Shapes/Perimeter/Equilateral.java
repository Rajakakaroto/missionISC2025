package Shapes.Perimeter;

import java.util.Scanner;

class PerimeterOfEquilateralTriangle {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of the Triangle:");
        double a = s.nextDouble();
        double perimeter = 3 * a;
        System.out.println("Perimeter of the Triangle is: " + perimeter);
    }
}

