package Array;

import java.util.*;

class Sol {
    // Function to find maximum sum of subarrays
    public int maxSubArray(int[] nums) {

        long maxi = Long.MIN_VALUE;

        long sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return (int) maxi;
    }
}

// Separate Main class in same file
public class kadaneAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Sol so = new Sol();

        int maxSum = so.maxSubArray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}