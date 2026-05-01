package Stack;

import java.util.*;
class SumOfMinarr {

    private static int[] findNSE(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }

    private static int[] findPSEE(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return ans;
    }

    public static int sumSubarrayMins(int[] arr) {

        int n = arr.length;

        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);

        int mod = (int)1e9 + 7;
        long sum = 0;

        for(int i = 0; i < n; i++){
            long left = i - psee[i];
            long right = nse[i] - i;
            long freq = left * right;

            sum = (sum + (freq * arr[i]) % mod) % mod;
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = sumSubarrayMins(arr);
        System.out.println(result);
    }
}