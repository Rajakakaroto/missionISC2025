package Objects;

import java.util.Scanner;

public class Add_Dist
{
    int km,mts,cm;
    void get_dist()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER KM ,METER AND CM");
     km=sc.nextInt();
     mts=sc.nextInt();
     cm=sc.nextInt();
    }
    void show_dist(){
        km=km*100000;
        mts*=100;
        int dist=km+mts+cm;
        System.out.println("TOTAL DISTANCE TRAVELLED IN CENTIMETER IS : "+dist);

    }
    public static void main(String[] args)
    {
      Add_Dist obj=new Add_Dist();
      obj.get_dist();
      obj.show_dist();
    }
}
