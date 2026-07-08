package NumberBasedQuestions;

import java.util.Scanner;

public class ArmstrongNumbersInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {

            int original = n;
            int temp = n;
            int sum = 0;

            while (temp > 0) {

                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (original == sum) {
                System.out.print(original + " ");
            }
        }
    }
}