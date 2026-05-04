package Stack;

import java.util.Arrays;

public class MaximumTempBrute {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] days = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > temperatures[i]) {
                    days[i] = j - i;
                    break;
                }
            }
        }
        return days;
    }

    public static void main(String[] args) {
        int[] temperatures = {75, 71, 69, 72};

        int[] result = dailyTemperatures(temperatures);

        System.out.println("Input: " + Arrays.toString(temperatures));
        System.out.println("Output: " + Arrays.toString(result));
    }
}