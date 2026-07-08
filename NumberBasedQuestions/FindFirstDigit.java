package NumberBasedQuestions;

import java.util.Scanner;

public class FindFirstDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        while (n >= 10) {
            n = n / 10;
        }

        System.out.println("First digit: " + n);
    }
}