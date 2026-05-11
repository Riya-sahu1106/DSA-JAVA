package Array;

import java.util.Arrays;
import java.util.Scanner;

public class HeightChecker{

    public static int heightChecker(int[] heights) {

        int[] res = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            res[i] = heights[i];
        }

        Arrays.sort(res);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {

            if (heights[i] != res[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] heights = new int[n];

        System.out.println("Enter heights:");

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int result = heightChecker(heights);
        System.out.println("Number of mismatched positions: " + result);

        sc.close();
    }
}
