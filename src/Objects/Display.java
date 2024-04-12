package Objects;
import java.util.Scanner;
class Display {
    int a;
    int b;
    int c;

    void Accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = in.nextInt();
        System.out.print("Enter value of b: ");
        b = in.nextInt();
    }

    void Max() {
        c = a > b ? a : b;
        System.out.println("Greater Number = " + c);
    }

    void Min() {
        c = a < b ? a : b;
        System.out.println("Smaller Number = " + c);
    }

    void Diff() {
        c = a - b;
        System.out.println("Difference = " + c);
    }

    public static void main(String args[]) {
        Display obj = new Display();
        obj.Accept();
        obj.Max();
        obj.Min();
        obj.Diff();
    }
}