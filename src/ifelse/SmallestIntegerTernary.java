package ifelse;

import java.util.Scanner;

/*Write a program to input 3 unique integers and print the smallest among them
        using Ternary Operator*/
public class SmallestIntegerTernary
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THREE INTEGERS");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //comparing a and b and storing the smallest number in a temp variable
        int temp=a<b?a:b;
//comparing the temp variable with c and storing the result in the variable names smallest
        int smallest=c<temp?c:temp;
        System.out.println("SMALLETS NUMBER ="+smallest);
    }
}
