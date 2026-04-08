package BinarySearch;

import java.util.*;

class Cows {
    public boolean canPlace(int[] stalls, int cows, int d) {

        int count = 1;
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= d) {
                count++;
                lastPos = stalls[i];
            }
            if (count >= cows) return true;
        }
        return false;
    }

    public int aggressiveCows(int[] stalls, int cows) {

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];

        int ans = 0;

        while (low <= high) {
            // Find mid distance
            int mid = low + (high - low) / 2;

            // If placement possible
            if (canPlace(stalls, cows, mid)) {
                // Store answer
                ans = mid;
                // Try bigger distance
                low = mid + 1;
            }
            else {
                // Try smaller distance
                high = mid - 1;
            }
        }

        return ans;
    }
}

public class aggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] stalls = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            stalls[i] = sc.nextInt();
        }
        System.out.print("Enter the number of cows:");
        int cows = sc.nextInt();

        Cows obj = new Cows();
        System.out.println(obj.aggressiveCows(stalls, cows));
    }
}
