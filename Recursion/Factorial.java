package Recursion;

import java.util.Scanner;

public class Factorial {

    static int factorial(int n){
        System.out.println("Calling factorial(" + n + ")");

        // Base case
        if(n == 0 || n == 1){
            System.out.println("Returning 1 from factorial(" + n + ")");
            return 1;
        }

        int result = n * factorial(n - 1);

        System.out.println("Returning " + result + " from factorial(" + n + ")");
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int result = factorial(n);
        System.out.println("Final Answer: " + result);
    }
}