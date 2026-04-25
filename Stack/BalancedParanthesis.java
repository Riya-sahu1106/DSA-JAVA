package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else {
                if (st.isEmpty()) return false;
                char top = st.pop();

                if ((ch == ')' && top == '(') ||
                        (ch == ']' && top == '[') ||
                        (ch == '}' && top == '{'))
                    continue;
                else
                    return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BalancedParanthesis bp = new BalancedParanthesis();
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        if (bp.isValid(str))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
