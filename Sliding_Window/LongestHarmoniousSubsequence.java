package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {

    public static int findLHS(int[] nums) {

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;

        for (int key : freq.keySet()) {

            if (freq.containsKey(key + 1)) {

                int len = freq.get(key) + freq.get(key + 1);

                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};

        int result = findLHS(nums);

        System.out.println("Longest Harmonious Subsequence Length = " + result);
    }
}