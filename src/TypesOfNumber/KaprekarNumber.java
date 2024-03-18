package TypesOfNumber;

import java.util.Scanner;

public class KaprekarNumber {

    public boolean isKaprekar(int number) {

        // declare variables
        int square = 0;
        int temp = 0;
        int countDigits = 0;
        int firstPart = 0;
        int secondPart = 0;
        int sum = 0;
        int m =0, r = 0;

        // calculate square value of the number
        square = number * number;

        // count number of digits in the square
        temp =square;
        while(temp!=0) {
            countDigits++;
            temp /= 10;
        }
        int equalPart = 0;
        if(countDigits %2 == 0){
            equalPart = countDigits/2;
        }else{
            equalPart = countDigits/2 + 1;
        }

        // divide square into two parts and
        // check it's sum is equal to the number?
        for(int i=1; i<=countDigits; i++) {

            // find first part
            if (i<=equalPart) {
                firstPart = firstPart + ((square % 10) * (int) Math.pow(10, m));
                m++;
                square /=10;
            }else{
                secondPart = secondPart + ((square % 10) * (int) Math.pow(10, r));
                r++;
                square /=10;
            }
        }
        if(firstPart+secondPart == number)
            return true;
        return false;
    }

    public static void main(String[] args) {

        // declare variables
        int number = 0;

        // read the input
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter an integer number:: ");
        number = scan.nextInt();

        KaprekarNumber kn = new KaprekarNumber();

        // check the number is kaprekar number or not
        if(kn.isKaprekar(number))
            System.out.println(number+" is a"
                    + " kaprekar number");
        else
            System.out.println(number+" is not a"
                    + " kaprekar number");
    }
}