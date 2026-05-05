package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums1){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int[]res = new int[nums1.length];
        int k = 0;

        for(int num : nums2){
            int count = map.getOrDefault(num,0);

            if(count == 0){
                continue;
            }else{
                res[k++] = num;
                map.put(num,count-1);
            }
        }
        return Arrays.copyOfRange(res,0,k);
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
