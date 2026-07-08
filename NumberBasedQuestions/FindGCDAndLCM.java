package NumberBasedQuestions;

import java.util.Scanner;

public class FindGCDAndLCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int originalA = a;
        int originalB = b;

        // Find GCD
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        int gcd = a;

        // Find LCM
        int lcm = (originalA * originalB) / gcd;

        System.out.println("GCD/HCF: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}