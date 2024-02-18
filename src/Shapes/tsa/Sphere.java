package Shapes.tsa;
import java.util.*;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();

        // Calculate surface area
        double surfaceArea = 4 * Math.PI * (radius * radius);

        System.out.println("The surface area of the sphere = " + surfaceArea);
    }
}

