import java.util.Scanner;

class NaturalNumber {
    public static void main(String[] args) {
        int i, n=20, res = 0;

        
        System.out.println("First n natural numbers: ");

        for (i = 1; i <= n; i++) {
            System.out.println(i);

            res = res + i; // LHS = RHS

        }

        System.out.println("Result : " + res);
    }

}
