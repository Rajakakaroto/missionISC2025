package TypesOfNumber;
//if the sum of factorial of digits is equal to the number itself
public class PetersonNumber
{
    public static void main(String[] args) {
        int check=145;
        int n=check;
        int pet=0;
        while (n>0)
        {
            int rem=n%10;
            int fact=1;
            for (int i = 1; i <= rem; i++) {
                fact*=i;
            }
            pet+=fact;
            n/=10;
        }
        if (pet==check)
        System.out.println("Peterson");
        else
            System.out.println("not Peterson");
    }
}
