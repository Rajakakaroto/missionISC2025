package Shapes.tsa;
class Cuboid {
    public static void main(String[] args) {
        double length = 20; // Replace with the actual length
        double width = 15; // Replace with the actual width
        double height = 10; // Replace with the actual height

        // Calculate the surface area
        double surfaceArea = 2 * (length * width + width * height + height * length);

        // Display the result
        System.out.println("The surface area of the cuboid is: " + surfaceArea);
    }
}

