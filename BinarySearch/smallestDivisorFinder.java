package BinarySearch;


import java.util.*;

class SmallestDivisorFinder {

    private int sumByD(int[] arr, int div) {
        int sum = 0;
        for (int num : arr) {
            sum += (int)Math.ceil((double) num / div);
        }
        return sum;
    }
    public int smallestDivisor(int[] arr, int limit) {
        if (arr.length > limit) return -1;

        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(arr, mid) <= limit) {
                high = mid - 1; // Try smaller divisor
            } else {
                low = mid + 1;  // Try larger divisor
            }
        }

        return low;
    }

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

        SmallestDivisorFinder solver = new SmallestDivisorFinder();
        int result = solver.smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + result);
    }
}