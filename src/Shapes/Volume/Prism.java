package Shapes.Volume;

import java.util.Scanner;

class Prism {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the area of the base:");
        double base = s.nextDouble();

        System.out.println("Enter the height:");
        double height = s.nextDouble();

        double volume = base * height;
        System.out.println("Volume of the prism is: " + volume);
    }
}

