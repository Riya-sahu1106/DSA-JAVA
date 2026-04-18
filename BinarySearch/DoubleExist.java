package BinarySearch;

import java.util.HashSet;
import java.util.Scanner;

public class DoubleExist {
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(2 * num)) {
                return true;
            }
            if (num % 2 == 0 && set.contains(num / 2)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[]arr=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        boolean result = checkIfExist(arr);

        if (result) {
            System.out.println("True: Pair exists");
        } else {
            System.out.println("False: No valid pair");
        }
    }
}