package Array;

import java.util.*;

public class RotateLeftArray {

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;

        int[] temp = Arrays.copyOfRange(arr, n - k, n);

        for (int i = k ; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[n-k+i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k (rotation steps): ");
        int k = sc.nextInt();

        rotateLeft(arr, k);

        System.out.println("Array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}