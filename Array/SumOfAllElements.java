package Array;

import java.util.Scanner;

public class SumOfAllElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of elements:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        System.out.print("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        // System.out.print("Sum of array:");
        // for (int i = 0; i < arr.length; i++) {
        //     sum = sum + arr[i];
        // }
        System.out.print(sum);

    }
}
