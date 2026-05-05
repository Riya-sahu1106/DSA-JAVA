package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = intersection(nums1, nums2);

        System.out.println("Intersection of arrays:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
