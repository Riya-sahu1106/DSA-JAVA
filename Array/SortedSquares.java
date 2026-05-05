package Array;
import java.util.*;

public class SortedSquares {

        public static int[] sortedSquares(int[] nums) {
            int[] result = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }

            int head = 0;
            int tail = nums.length - 1;

            for (int pos = nums.length - 1; pos >= 0; pos--) {
                if (nums[head] > nums[tail]) {
                    result[pos] = nums[head];
                    head++;
                } else {
                    result[pos] = nums[tail];
                    tail--;
                }
            }

            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] nums = new int[n];

            System.out.println("Enter sorted array elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int[] result = sortedSquares(nums);

            System.out.println("Sorted squares array:");
            for (int num : result) {
                System.out.print(num + " ");
            }

            sc.close();
        }
    }

