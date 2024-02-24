package ifelse;
 // Write a program to pass 2 integer numbers as parameters. If either of the
    //    two numbers is 0, display invalid entry and the program should end, if it is
      //  valid entry, divide the larger number with the smaller number and display the
        //result.

import java.util.Scanner;

public class DivisionNonZero
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TWO INTEGER NUMBER");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int div;
        if(n1==0||n2==0)
            System.out.println("INVALID ENTRY");
        else
        {
            if (n1>n2)
                div=n1/n2;
            else
                div=n2/n1;
            System.out.println("DIVISON OF GRATER AND SMALLER NUMBER = "+div);
        }
    }
}
