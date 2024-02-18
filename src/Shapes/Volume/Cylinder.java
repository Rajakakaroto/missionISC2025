package Shapes.Volume;

import java.util.Scanner;

class Cylinder {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r = s.nextDouble();

        System.out.println("Enter the height:");
        double h = s.nextDouble();

        double volume = (22 * r * r * h) / 7;
        System.out.println("Volume of the cylinder is: " + volume);
    }
}

