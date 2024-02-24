package ifelse;

import java.util.Scanner;

/*Write a program to input 3 unique integers and print the smallest among
        them.

 */
public class SmallestInteger
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THREE INTEGERS");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a<b&&a<c)
            System.out.println("SMALLEST NUMBER AMONG THREE IS "+a);
        else if (b<a&&b<c)
            System.out.println("SMALLEST NUMBER AMONG THREE IS "+b);
            else
            System.out.println("SMALLEST NUMBER AMONG THREE IS "+c);
    }
}
