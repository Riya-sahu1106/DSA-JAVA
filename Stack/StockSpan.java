package Stack;
import java.util.*;

public class StockSpan {
    public static void main(String[] args) {

        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;

        int[] span = new int[n];
        int[] nextGreater = new int[n];

        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && price[i] >= price[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = st.peek();
            }

            st.push(i);
        }
        for (int i = 0; i < n; i++) {

            int j = i;
            int count = 1;
            while (j > 0 && price[j - 1] <= price[i]) {
                count++;
                j--;
            }
            span[i] = count;
        }
        System.out.println(Arrays.toString(span));
    }
}