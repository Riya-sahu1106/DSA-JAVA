package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n ==1){
            return 1;
        }

        int left = fib(n - 1);
        int right = fib(n - 2);

        return left + right;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = fib(n);
        System.out.println("Fibonacci value: " + result);
    }
}
