package Array;

import java.util.*;

public class DuplicateZeroes {

    public static void duplicateZeros(int[] arr) {
        int[] dest = new int[arr.length];

        int s = 0;
        int d = 0;

        while (s < arr.length) {
            if (arr[s] == 0) {
                if (d < arr.length) dest[d] = 0;
                d++;
                dest[d] = 0;
            } else {
                if (d < arr.length) dest[d] = arr[s];
            }
            d++;
            s++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = dest[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        duplicateZeros(arr);

        System.out.println("Array after duplicating zeros:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
