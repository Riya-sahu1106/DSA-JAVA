package Array;

import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of elements:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int max = 0;

        System.out.print("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }


        System.out.print(max + " is maximum");

    }
}
