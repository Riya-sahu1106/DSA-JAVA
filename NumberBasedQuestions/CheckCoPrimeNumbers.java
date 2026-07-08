package NumberBasedQuestions;

import java.util.Scanner;

public class CheckCoPrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int originalA = a;
        int originalB = b;

        while (b != 0) {

            int remainder = a % b;
            a = b;
            b = remainder;
        }

        int gcd = a;

        if (gcd == 1) {
            System.out.println(originalA + " and " + originalB
                    + " are Co-prime Numbers");
        } else {
            System.out.println(originalA + " and " + originalB
                    + " are not Co-prime Numbers");
        }
    }
}