package NumberBasedQuestions;

import java.util.Scanner;

public class NthFibonacciNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        if (n == 0) {
            System.out.println("Fibonacci number: " + first);
        } else if (n == 1) {
            System.out.println("Fibonacci number: " + second);
        } else {

            int next = 0;

            for (int i = 2; i <= n; i++) {
                next = first + second;
                first = second;
                second = next;
            }

            System.out.println("Fibonacci number: " + second);
        }
    }
}