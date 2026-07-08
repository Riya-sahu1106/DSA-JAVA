package NumberBasedQuestions;

import java.util.Scanner;

public class CheckPerfectSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        boolean isPerfectSquare = false;

        for (int i = 0; i * i <= n; i++) {

            if (i * i == n) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(n + " is a Perfect Square");
        } else {
            System.out.println(n + " is not a Perfect Square");
        }
    }
}