package Array;

import java.util.Scanner;

public class ValidMountain {
    public static boolean validMountainArray(int[] arr) {

        int i = 0;
        int n = arr.length;

        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            return false;
        }

        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean ans = validMountainArray(nums);

        System.out.println(ans);
    }
}

