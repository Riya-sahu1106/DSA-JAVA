package NumberBasedQuestions;

import java.util.Scanner;

public class SumOfFirstAndLastDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int lastDigit = n % 10;

        while (n >= 10) {
            n = n / 10;
        }

        int firstDigit = n;

        int sum = firstDigit + lastDigit;

        System.out.println("Sum of first and last digit: " + sum);
    }
}