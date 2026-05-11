package Array;

import java.util.Scanner;

public class MergeSortedArray1 {

        public static void merge(int[] nums1, int m, int[] nums2, int n) {

            int[] nums1Copy = new int[m];

            for (int i = 0; i < m; i++) {
                nums1Copy[i] = nums1[i];
            }

            int p1 = 0;
            int p2 = 0;

            // Merge arrays
            for (int p = 0; p < m + n; p++) {

                if (p2 >= n || (p1 < m && nums1Copy[p1] < nums2[p2])) {
                    nums1[p] = nums1Copy[p1];
                    p1++;
                } else {
                    nums1[p] = nums2[p2];
                    p2++;
                }
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of first array: ");
            int m = sc.nextInt();

            System.out.print("Enter size of second array: ");
            int n = sc.nextInt();

            int[] nums1 = new int[m + n];
            int[] nums2 = new int[n];

            System.out.println("Enter elements of first sorted array:");
            for (int i = 0; i < m; i++) {
                nums1[i] = sc.nextInt();
            }

            System.out.println("Enter elements of second sorted array:");
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
