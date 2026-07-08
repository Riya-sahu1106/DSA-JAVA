package NumberBasedQuestions;

import java.util.Scanner;

public class FindAllFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("Factors are: ");

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}