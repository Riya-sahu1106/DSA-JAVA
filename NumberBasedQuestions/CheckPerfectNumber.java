package NumberBasedQuestions;

import java.util.Scanner;

public class CheckPerfectNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n) {
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is not a Perfect Number");
        }
    }
}