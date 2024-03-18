package TypesOfNumber;
//number  given, the number+1 =prfct sq

import java.util.Scanner;

class SunnyNumber{
    static boolean findPerfectSquare(double num) {
        double squareRoot = Math.sqrt(num);
        return (squareRoot - Math.floor(squareRoot)) == 0;
    }
    static void isSunnyNumber(int N) {
        if (findPerfectSquare(N + 1)) {
            System.out.println("The given number is a sunny number.");
        } else {
            System.out.println("The given number is not a sunny number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        isSunnyNumber(num);
    }
}
