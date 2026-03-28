package Array;

import java.util.Scanner;

class Solution {

    public String twoSumExists(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == target) {
                    return "YES";
                }
            }
        }

        return "NO";
    }

public int[] twoSumIndices(int[] arr, int target) {
    int n = arr.length;
    // Outer loop picks one element at a time
    for (int i = 0; i < n; i++) {
        // Inner loop searches for another element that complements arr[i]
        for (int j = i + 1; j < n; j++) {
             if (arr[i] + arr[j] == target) {
                return new int[]{i, j};
            }
        }
    }

    return new int[]{-1, -1};
 }
}

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target:");
        int k = sc.nextInt();

        Solution sol = new Solution();
        String ans = sol.twoSumExists(arr, k);
        System.out.println(ans);

        int[] res=sol.twoSumIndices(arr,k);
        System.out.println("[" + res[0] + ", " + res[1] + "]");

    }
}
