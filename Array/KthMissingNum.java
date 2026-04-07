package Array;

import java.util.*;

class kthMissingNum {

    public int missingK(int[] vec, int k) {
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;
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