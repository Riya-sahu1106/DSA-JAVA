package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayByParity  {

    public static int[] sortArrayByParity(int[] nums) {

        Integer[] res = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }

        Arrays.sort(res, (val1, val2) ->
                Integer.compare(val1 % 2, val2 % 2));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }

        return nums;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = sortArrayByParity(nums);

        System.out.println("Array after sorting by parity:");

        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}