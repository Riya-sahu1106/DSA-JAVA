package Stack;
import java.util.*;

public class FinalPrices {

    public static int[] finalPrices(int[] prices) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            while (!st.isEmpty() && prices[st.peek()] >= prices[i]) {

                int idx = st.pop();

                prices[idx] = prices[idx] - prices[i];
            }

            st.push(i);
        }

        return prices;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int[] result = finalPrices(prices);

        System.out.println("Final Prices:");

        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
