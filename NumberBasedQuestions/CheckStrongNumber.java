package NumberBasedQuestions;

import java.util.Scanner;

public class CheckStrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }

            sum = sum + factorial;

            n = n / 10;
        }

        if (original == sum) {
            System.out.println(original + " is a Strong Number");
        } else {
            System.out.println(original + " is not a Strong Number");
        }
    }
}