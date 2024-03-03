package Loop;

class Hcf {
    public static void main(String arg[]) {
        int n1 = Integer.parseInt(arg[0]);
        int n2 = Integer.parseInt(arg[1]);
        int temp;
        while (n2 > 0) {
            temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        System.out.println("HCF of two numbers is: " + n1);
    }
}

