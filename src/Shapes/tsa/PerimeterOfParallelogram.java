package Shapes.tsa;

import java.util.Scanner;
class Parallelogram {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the height of the Parallelogram:");
        double h = s.nextDouble();
        System.out.println("Enter the breadth of the Parallelogram:");
        double b = s.nextDouble();
        double perimeter = 2 * (h + b);
        System.out.println("Perimeter of Parallelogram is: " + perimeter);
    }
}
