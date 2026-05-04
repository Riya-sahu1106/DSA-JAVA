package Stack;

import java.util.*;

public class PrevGreaterElement {
    public static int[] prevGreaterElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
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
        int[] arr = {100, 80, 60, 70, 60, 75, 85};

        int[] result = prevGreaterElement(arr);

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
