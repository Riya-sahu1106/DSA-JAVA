package Stack;

import java.util.*;

public class BaseballGame {

    public static int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (String op : operations) {

            if (op.equals("+")) {

                int top = st.pop();
                int newScore = top + st.peek();

                st.push(top);
                st.push(newScore);

            }
            else if (op.equals("D")) {

                st.push(2 * st.peek());

            }
            else if (op.equals("C")) {

                st.pop();

            }
            else {

                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] operations = new String[n];

        System.out.println("Enter operations:");

        for (int i = 0; i < n; i++) {
            operations[i] = sc.nextLine();
        }

        int result = calPoints(operations);

        System.out.println("Final Score: " + result);

        sc.close();
    }
}