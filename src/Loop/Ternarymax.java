package Loop;

public class Ternarymax {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        int c=3;
        int d=4;
        int max=(a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d)));
        System.out.println("largest Number="+max);
    }
}
