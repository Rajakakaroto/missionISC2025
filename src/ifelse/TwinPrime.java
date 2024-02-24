package ifelse;

import java.util.Scanner;

public class TwinPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter range limit:");
        int range = scan.nextInt();

        TwinPrime tp = new TwinPrime();

        for (int i = 2; i <range-2 ; i++) {

            boolean prime = tp.isPrime(i) && tp.isPrime(i+2);
            if (prime == true)
                System.out.println("("+i+","+(i+2)+")");
        }
    }
    boolean isPrime(int n){
//        boolean prime = true;
        for (int i = 2; i*i <=n ; i++) {
            if (n%i ==0)
//                prime =  false;
                return false;
        }
        return true;
    }
}
