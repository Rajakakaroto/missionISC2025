package Shapes.Csa;

import java.util.Scanner;

class CurvedSurfaceAreaOfCylinder {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = s.nextDouble();
        System.out.println("Enter the height:");
        double h = s.nextDouble();
        double tsa = ((2 * 22 * r) / 7) * (r + h);
        System.out.println("Total Surface Area Of Cylinder is: " + tsa);
    }
}
