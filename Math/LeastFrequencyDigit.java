package Math;

import java.util.Scanner;

public class LeastFrequencyDigit {

    public static int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int ans = -1;
        int minFreq = Integer.MAX_VALUE;

        for (int digit = 0; digit <= 9; digit++) {
            if (freq[digit] > 0 && freq[digit] < minFreq) {
                minFreq = freq[digit];
                ans = digit;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = getLeastFrequentDigit(n);

        System.out.println("Least Frequent Digit: " + result);

        sc.close();
    }
}