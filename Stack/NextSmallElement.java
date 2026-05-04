package Stack;

import java.util.*;

public class NextSmallElement  {
    public static int[] nextSmallElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
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

        int[] result = nextSmallElement(arr);

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

