package TypesOfNumber;
//string mein num+num*2+num*3 mein 1 se 9 tk sb digit ek baar aaye

import java.util.Scanner;

class FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        if (num < 100) {
            System.out.println(num + " is not a fascinating number.");
            return;
        }

        int num2 = num * 2;
        int num3 = num * 3;
        String concatenatedStr = num + "" + num2 + num3;

        boolean isFascinating = true;
        for (char digit = '1'; digit <= '9'; digit++) {
            int count = 0;
            for (int i = 0; i < concatenatedStr.length(); i++) {
                char ch = concatenatedStr.charAt(i);
                if (ch == digit) {
                    count++;
                }
            }
            if (count != 1) {
                isFascinating = false;
                break;
            }
        }

        if (isFascinating) {
            System.out.println(num + " is a fascinating number.");
        } else {
            System.out.println(num + " is not a fascinating number.");
        }
    }
}
