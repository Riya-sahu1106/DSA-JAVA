package Stack;

import java.util.*;

public class NextGreaterElementByStack {

    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 1, 6, 3, 4};

        int[] result = nextGreaterElement(arr);

        for(int ar : arr){
            System.out.print(ar+" ");
        }
        System.out.println();
        System.out.println("Next Greater Elements:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
