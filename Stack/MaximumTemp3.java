package Stack;
import java.util.Arrays;

public class MaximumTemp3 {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] days = new int[n];

        int warmest = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            int currTemp = temperatures[i];

            if (currTemp >= warmest) {
                warmest = currTemp;
                continue;
            }

            int count = 1;

            while (true) {
                if (temperatures[i + count] > currTemp) {
                    days[i] = count;
                    break;
                } else {
                    count = count + days[i + count];
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