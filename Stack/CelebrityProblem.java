package Stack;

import java.util.*;

public class CelebrityProblem {

    static int celebrity(int[][] mat) {
        int n = mat.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            if (mat[a][b] == 1) {
                st.push(b);
            } else {
                st.push(a);
            }
        }
        int candidate = st.pop();
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (mat[i][candidate] == 0 || mat[candidate][i] == 1) {
                    return -1;
                }
            }
        }

        return candidate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int result = celebrity(mat);
        if (result == -1) {
            System.out.println("No Celebrity");
        } else {
            System.out.println("Celebrity is: " + result);
        }
        sc.close();
    }
}