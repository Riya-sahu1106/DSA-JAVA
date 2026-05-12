package Array;

import java.util.Scanner;

public class PivotIndex {

    public static int pivotIndex(int[] nums) {

        int rightSum = 0;

        for(int i = 0; i < nums.length; i++){
            rightSum += nums[i];
        }

        int leftSum = 0;

        for(int i = 0; i < nums.length; i++){

            if(leftSum == rightSum - nums[i]){
                return i;
            }

            leftSum += nums[i];
            rightSum -= nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int result = pivotIndex(nums);

        System.out.println("Pivot Index = " + result);

        sc.close();
    }
}