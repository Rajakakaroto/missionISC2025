package Objects;

import java.util.Scanner;

public class CUboid
{
    int len,br,ht,vol;
void input(){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER LENGTH ,BREADTH, HEIGHT");
    len= sc.nextInt();
    br= sc.nextInt();
    ht= sc.nextInt();
}
void calculate(){
    vol=len*br*ht;
}
void display(){
    System.out.println("VOLUME OF CUBOID IS : "+vol);
}
public static void main(String[] args) {
CUboid cbd=new CUboid();
cbd.input();
cbd.calculate();
cbd.display();
    }
}
