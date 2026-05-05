package Array;
import java.util.*;
public class NumberHasEvenDigits {

    public static boolean numberHasEvenDigits(int num) {
            int digitCount = 0;

            if (num == 0) return false;

            while (num != 0) {
                num = num / 10;
                digitCount++;
            }

            return digitCount % 2 == 0;
        }

        public static int findNumbers(int[] nums) {
            int evenCount = 0;

            for (int i = 0; i < nums.length; i++) {
                if (numberHasEvenDigits(nums[i])) {
                    evenCount++;
                }
            }

            return evenCount;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] nums = new int[n];

            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int result = findNumbers(nums);

            System.out.println("Count of numbers with even digits: " + result);

            sc.close();
        }
    }

//public int findNumbers(int[] nums) {
//    int evenCount = 0;
//
//    for(int num : nums){
//        int len = StringValueOf(num).length();
//
//        if(len% 2==0){
//            evenCount++;
//        }
//    }
//    return evenCount;
//}

