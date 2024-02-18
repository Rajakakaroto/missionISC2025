package Shapes.Volume;

import java.util.Scanner;

class Cone {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of the cone:");
        double r = s.nextDouble();
        System.out.println("Enter the height of the cone:");
        double h = s.nextDouble();
        double volume = (22 * r * r * h) / (3 * 7);
        System.out.println("Volume of the cone is: " + volume);
    }
}

