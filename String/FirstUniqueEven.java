package String;
import java.util.HashMap;

public class FirstUniqueEven {

    public static int firstUniqueEven(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (num % 2 == 0 && map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {8, 4, 8, 2, 6, 4};

        int result = firstUniqueEven(nums);

        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println("First Unique Even Number: " + result);
    }
}