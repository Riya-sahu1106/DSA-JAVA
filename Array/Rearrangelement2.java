package Array;

import java.util.Arrays;

public class Rearrangelement2 {

    static void rearrange(int[] arr) {

        int n = arr.length;

        int maxIdx = n - 1;
        int minIdx = 0;

        int maxElem = arr[n - 1] + 1;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {

                arr[i] = arr[i]
                        + (arr[maxIdx] % maxElem) * maxElem;

                maxIdx--;
            }

            // odd index -> minimum element
            else {

                arr[i] = arr[i]
                        + (arr[minIdx] % maxElem) * maxElem;

                minIdx++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElem;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        rearrange(arr);

        System.out.println("Optimal Output:");
        System.out.println(Arrays.toString(arr));
    }
}