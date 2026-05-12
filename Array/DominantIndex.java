package Array;

import java.util.Scanner;

public class DominantIndex {

    public static int dominantIndex(int[] nums) {

        int n = nums.length;
        int largest = -1, index = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i != index && largest < 2 * nums[i]) {
                return -1;
            }
        }

        return index;
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

        int result = dominantIndex(nums);

        System.out.println("Dominant Index = " + result);

        sc.close();
    }
}