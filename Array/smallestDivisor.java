package Array;

import java.util.Scanner;

class SmallestDivisorMain {

    public int divisor(int[] arr, int limit) {

        int max = Integer.MIN_VALUE;


        for (int num : arr) {
            max = Math.max(max, num);
        }


        for (int i = 1; i <= max; i++) {
            int sum = 0;

            for (int j = 0; j < arr.length; j++) {
                sum += (int) Math.ceil((double) arr[j] / i);
            }

            if (sum <= limit) {
                return i;
            }
        }

        return -1;
    }
}

public class smallestDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the threshold limit: ");
        int limit = sc.nextInt();

        SmallestDivisorMain sd = new SmallestDivisorMain();
        int ans = sd.divisor(arr, limit);

        System.out.println("So answer is: " + ans);

        sc.close();
    }
}