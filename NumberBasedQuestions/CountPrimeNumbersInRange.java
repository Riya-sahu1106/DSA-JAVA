package NumberBasedQuestions;

import java.util.Scanner;

public class CountPrimeNumbersInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int count = 0;

        for (int n = start; n <= end; n++) {

            boolean isPrime = true;

            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println("Total prime numbers: " + count);
    }
}