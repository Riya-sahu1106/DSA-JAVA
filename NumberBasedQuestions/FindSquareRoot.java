package NumberBasedQuestions;

import java.util.Scanner;

public class FindSquareRoot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double n = sc.nextDouble();

        double squareRoot = Math.sqrt(n);

        System.out.println("Square root: " + squareRoot);
    }
}