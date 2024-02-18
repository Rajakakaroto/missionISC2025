package Shapes.Volume;

import java.util.Scanner;

class Cuboid {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the cuboid:");
        double length = s.nextDouble();
        System.out.println("Enter the breadth of the cuboid:");
        double breadth = s.nextDouble();
        System.out.println("Enter the height of the cuboid:");
        double height = s.nextDouble();

        double volume = length * breadth * height;
        System.out.println("Volume of the cuboid is: " + volume);
    }
}
