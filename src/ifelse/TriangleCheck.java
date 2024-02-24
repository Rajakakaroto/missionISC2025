package ifelse;

import java.util.Scanner;

/*Write a program to input the three angles of a triangle and check whether it
        forms a triangle or not, if it forms a triangle, check whether it is an
        equilateral, isosceles or a scalene triangle.
        (Hint: To form a triangle, the sum of the angles should be 180 degrees.
        To form an equilateral triangle every angle should be equal.
        To form an isosceles triangle any two angles should be equal.
        To form a scalene triangle all three angles should be different from each
        other.)*/
public class TriangleCheck
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three angles");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        if(a1+a2+a3==180) {
            if (a1 == a2 && a1 == a3)
                System.out.println("EQUILATERAL TRIANGLE");
            else if ((a1==a2&&a1!=a3)||(a1==a3&&a1!=a2) ||(a2==a1&&a2!=a3)
                    ||(a2==a3&&a2!=a1) ||(a3==a2&&a3!=a1)||(a3==a1&&a3!=a2))
            System.out.println("isoceles triangle");
            else if(a1!=a2&&a1!=a3)
                System.out.println("SCALENE TRIANGLE");
        }
    }
}
