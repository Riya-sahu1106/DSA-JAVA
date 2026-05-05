package Array;
import java.util.*;

public class FindMaxConsecutuveOnes {

        public static int findMaxConsecutiveOnes(int[] nums) {
            int maxCount = 0;
            int count = 0;

            for (int num : nums) {
                if (num == 1) {
                    count++;
                    maxCount = Math.max(maxCount, count);
                } else {
                    count = 0;
                }
            }

            return maxCount;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] nums = new int[n];

            System.out.println("Enter elements (0 or 1):");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int result = findMaxConsecutiveOnes(nums);
            System.out.println("Max consecutive ones: " + result);

            sc.close();
        }
    }

