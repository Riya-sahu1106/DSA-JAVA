package String;

import java.util.Scanner;

public class ThirdMax {
    public static int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int num : nums) {
            long n = (long) num;

            if ((first != null && n == first) ||
                    (second != null && n == second) ||
                    (third != null && n == third)) {
                continue;
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            }
            else if (second == null || n > second) {
                third = second;
                second = n;
            }
            else if (third == null || n > third) {
                third = n;
            }
        }
        return third == null ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements of array: ");
        int[]nums = new int[n];
        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int result = thirdMax(nums);

        System.out.println("Answer: " + result);
    }
}
