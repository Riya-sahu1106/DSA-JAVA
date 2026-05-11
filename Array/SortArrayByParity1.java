package Array;

import java.util.Scanner;

public class SortArrayByParity1  {

    public static int[] sortArrayByParity(int[] nums) {

        int[] res = new int[nums.length];

        int idx = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                res[idx] = nums[i];
                idx++;
            }
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 1) {
                res[idx] = nums[i];
                idx++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = sortArrayByParity(nums);

        System.out.println("Sorted Array by Parity:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}