package Sliding_Window;

import java.util.Scanner;

public class PrintLargestSubarrayOfMaxSum {

    public static void largestSubarray(int[] arr, int k) {

        int start = 0;
        int sum = 0;

        int maxLength = 0;
        int ansStart = -1;
        int ansEnd = -1;

        for (int end = 0; end < arr.length; end++) {

            sum += arr[end];

            while (sum > k) {
                sum -= arr[start];
                start++;
            }

            if (sum == k) {

                int currentLength = end - start + 1;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    ansStart = start;
                    ansEnd = end;
                }
            }
        }

        System.out.println("Length = " + maxLength);

        System.out.print("Subarray = ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sze of array: ");
        int n = sc.nextInt();

        int[]arr=new int[n];

        System.out.println("Enter array elements:");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the sum: ");
        int k = sc.nextInt();

        largestSubarray(arr, k);
    }
}
