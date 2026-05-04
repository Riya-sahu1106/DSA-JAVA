package Stack;
import java.util.*;

public class MaximumTemp2 {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] days = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                days[prevIndex] = i - prevIndex;
            }
            stack.push(i);
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