package Array;

import java.util.Arrays;

public class RearrangeElement {

    static void rearrange(int[] arr) {

        int n = arr.length;

        int[] temp = new int[n];

        int left = 0;
        int right = n - 1;

        int k = 0;

        while (left <= right) {

            // place maximum element
            if (k < n) {
                temp[k++] = arr[right--];
            }

            if (k < n) {
                temp[k++] = arr[left++];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        rearrange(arr);

        System.out.println("Brute Force Output:");
        System.out.println(Arrays.toString(arr));
    }
}