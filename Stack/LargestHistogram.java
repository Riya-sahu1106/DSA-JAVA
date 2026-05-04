package Stack;
import java.util.*;

public class LargestHistogram {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Solution sol = new Solution();
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[]heights=new int[n];
        System.out.print("Enter the elements of array:");
        for(int i =0;i<n;i++){
            heights[i]=sc.nextInt();
        }
        int result = sol.largestRectangleArea(heights);
        System.out.println("Maximum Area: " + result);
    }
}
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];

        st.push(n - 1);
        nse[n - 1] = n;

        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        st.clear();
        st.push(0);
        pse[0] = -1;

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            max = Math.max(max, area);
        }

        return max;
    }
}