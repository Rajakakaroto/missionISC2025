package Shapes.Volume;

import java.util.Scanner;

class Cube {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of the cube:");
        double side = s.nextDouble();
        double volume = side * side * side;
        System.out.println("Volume of the cube is: " + volume);
    }
}
