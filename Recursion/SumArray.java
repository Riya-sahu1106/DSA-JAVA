package Recursion;

import java.util.Scanner;

public class SumArray {
    public static int sum(int[]arr,int n){
        if(n == 0){
            return 0;
        }
        int result = sum(arr, n-1);
        return arr[n-1] + result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = sum(arr, n);
        System.out.println("Sum = " + answer);
    }
}
