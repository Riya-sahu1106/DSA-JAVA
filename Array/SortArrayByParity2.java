package Array;

import java.util.Scanner;

public class SortArrayByParity2 {

    public static int[] sortArrayByParity(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            int mod1 = nums[i] % 2;
            int mod2 = nums[j] % 2;

            if (mod1 == 1 && mod2 == 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if (mod1 == 0) {
                i++;
            }

            if (mod2 == 1) {
                j--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int k = 0; k < n; k++) {
            nums[k] = sc.nextInt();
        }

        int[] result = sortArrayByParity(nums);

        System.out.println("Sorted Array by Parity:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}