import java.util.Scanner;

class NaturalNumber {
    public static void main(String[] args) {
        int i, n, res = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nth number : ");
        n = sc.nextInt();

        System.out.println("First n natural numbers: ");

        for (i = 1; i <= n; i++) {
            System.out.println(i);

            res = res + i; // LHS = RHS

        }

        System.out.println("Result : " + res);
    }

}