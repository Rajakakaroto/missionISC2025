package TypesOfNumber;
//numbers square ends with the number eg 25-->625     625 has 25 in ends
class AutomorphicNumber {
    static boolean isAutomorphic(int num) {

        int square = num * num;

        while (num > 0) {

            if (num % 10 != square % 10)
                return false;
            num = num / 10;
            square = square / 10;
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println(isAutomorphic(76) ? "76 Automorphic" : "76 Not Automorphic");
        System.out.println(isAutomorphic(13) ? "13 Automorphic" : "13 Not Automorphic");
    }
}
