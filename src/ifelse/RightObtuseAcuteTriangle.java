package ifelse;

import java.util.Scanner;

/* Write a program to accept three sides of a triangle as parameter and check
         whether it can form a triangle or not. If it forms a triangle, check whether
         it is an acute angled, obtuse angled or right-angled triangle.
         (Hint: To form a triangle, each side should be less the sum of the other two
         sides..
         To form an acute angled triangle the square of every side should be less
         than the sum of the squares of the other two sides.
         To form an obtuse angled triangle the square of any side should be greater
         than the sum of the squares of the other two sides.
         To form an right angled triangle the square of any side should be equal to
         the sum of the squares of the other two sides.)*/
class RightObtuseAcuteTriangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three sides");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        if(a1<a2+a3 && a2<a1+a3 && a3<a1+a2) {
            int a1s=a1*a1;
            int a2s=a2*a2;
            int a3s=a3*a3;
            if (a1s<a2s+a3s && a2s<a3s+a1s && a3s<a1s+a2s)
                System.out.println("Acute triangle");
            else if (a1s>a2s+a3s || a2s>a3s+a1s || a3s>a1s+a2s)
                System.out.println("OBTUSE TRIANGLE");
            else if (a1s==a2s+a3s || a2s==a3s+a1s || a3s==a1s+a2s)
                System.out.println("RIGHT ANGLED TRIANGLE");

        }
    }
}
