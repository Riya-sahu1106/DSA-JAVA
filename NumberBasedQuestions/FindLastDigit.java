package NumberBasedQuestions;

import java.util.Scanner;

public class FindLastDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int lastDigit = n % 10;

        System.out.println("Last digit: " + lastDigit);
    }
}