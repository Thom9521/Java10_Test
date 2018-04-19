public class Fakultet {
    public static void main(String[] args) {

        System.out.println("Resultatet er " + factorial2(5));
    }

    public static int factorial(int n) {

        if (n > 0) {
            if (n == 1) {
                return 1;
            } else {
                return n + factorial(n - 1);
            }

        } else return (0);
    }

    public static int factorial2(int n) {

        int resultat = n;
        for (int i = n-1; i >= 1; i--) {
            resultat = resultat * i;

        }return  resultat;
    }
}
