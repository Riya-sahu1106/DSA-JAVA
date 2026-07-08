package NumberBasedQuestions;

import java.util.Scanner;

public class CheckHarshadNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        if (original % sum == 0) {
            System.out.println(original + " is a Harshad Number");
        } else {
            System.out.println(original + " is not a Harshad Number");
        }
    }
}