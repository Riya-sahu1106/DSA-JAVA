package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("Merged Sorted Array:");
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }

        sc.close();
    }
}