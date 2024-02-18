package Shapes.Volume;

import java.util.Scanner;

class Sphere {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere:");
        double r = s.nextDouble();
        double volume = (4 * 22 * r * r * r) / (3 * 7);
        System.out.println("Volume is: " + volume);
    }
}
