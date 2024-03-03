
import java.util.Scanner;
class BmiCalculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter weight in kg");
        double weight= sc.nextDouble();
        System.out.println("ENTER HEIGHT IN METERS");
        double height= sc.nextDouble();
        double bmi=weight /(height*height);
        System.out.println("CALCULATED BMI :"+bmi);
    }
}
