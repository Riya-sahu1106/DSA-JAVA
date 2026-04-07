package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

class Package {
    int daysNeeded(int[] weights, int capacity) {
        int days = 1;

        int currentLoad = 0;
        for (int w : weights) {
            if (currentLoad + w > capacity) {
                days++;
                currentLoad = w;
            } else {
                // Otherwise, add weight to current load
                currentLoad += w;
            }
        }
        return days;
    }

    int shipWithinDays(int[] weights, int d) {

        int left = Arrays.stream(weights).max().getAsInt();

        int right = Arrays.stream(weights).sum();

        while (left < right) {

            int mid = left + (right - left) / 2;

            int needed = daysNeeded(weights, mid);
            if (needed <= d) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

public class capacityToShipPackage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] weights = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        System.out.print("Enter the minimum day to ship packages within: : ");
        int d = sc.nextInt();
        Package sol = new Package();
        System.out.println("To the capacity to ship all the packages: "+sol.shipWithinDays(weights, d));
    }
}
