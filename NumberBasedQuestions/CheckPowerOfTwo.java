package NumberBasedQuestions;

import java.util.Scanner;

public class CheckPowerOfTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int temp = n;

        if (n <= 0) {
            System.out.println(n + " is not a Power of 2");
        } else {

            while (temp % 2 == 0) {
                temp = temp / 2;
            }

            if (temp == 1) {
                System.out.println(n + " is a Power of 2");
            } else {
                System.out.println(n + " is not a Power of 2");
            }
        }
    }
}