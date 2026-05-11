package Array;

import java.util.Scanner;

public class ReplaceElement{

    public static int[] replaceElements(int[] arr) {

        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {

            int temp = arr[i];

            arr[i] = max;

            max = Math.max(max, temp);
        }

        return arr;
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

        int[] result = replaceElements(arr);

        System.out.println("Array after replacement:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
