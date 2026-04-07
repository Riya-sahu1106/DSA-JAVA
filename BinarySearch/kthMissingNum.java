package BinarySearch;

import java.util.*;

class kthMissingNum {

    public int missingK(int[] vec, int k) {
        int low = 0, high = vec.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = vec[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] vec = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            vec[i] = sc.nextInt();
        }

        System.out.print("Enter the kth missing number: ");
        int k = sc.nextInt();

        kthMissingNum finder = new kthMissingNum();
        int ans = finder.missingK(vec, k);

        System.out.println("The missing number is: " + ans);
    }
}