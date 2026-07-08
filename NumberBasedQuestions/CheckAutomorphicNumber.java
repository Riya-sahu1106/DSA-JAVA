package NumberBasedQuestions;

import java.util.Scanner;

public class CheckAutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int square = n * n;
        int temp = n;

        boolean isAutomorphic = true;

        while (temp > 0) {

            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }

            temp = temp / 10;
            square = square / 10;
        }

        if (isAutomorphic) {
            System.out.println(n + " is an Automorphic Number");
        } else {
            System.out.println(n + " is not an Automorphic Number");
        }
    }
}