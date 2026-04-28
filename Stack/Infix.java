package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            }

            else if (ch == '(') {
                op.push(ch);
            }
            else if (ch == ')') {
                while (op.peek() != '(') {
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if (op.peek() == '-') val.push(v1 - v2);
                    if (op.peek() == '+') val.push(v1 + v2);
                    if (op.peek() == '*') val.push(v1 * v2);
                    if (op.peek() == '/') val.push(v1 / v2);
                    op.pop();
                }
                op.pop();
            }

            else if (op.size() == 0) {
                op.push(ch);
            }

            else {
                if (ch == '+' || ch == '-') {

                    while (op.size() > 0 && op.peek() != '(') {
                        int v2 = val.pop();
                        int v1 = val.pop();

                        if (op.peek() == '-') val.push(v1 - v2);
                        if (op.peek() == '+') val.push(v1 + v2);
                        if (op.peek() == '*') val.push(v1 * v2);
                        if (op.peek() == '/') val.push(v1 / v2);
                        op.pop();
                    }
                    op.push(ch);
                }

                if (ch == '*' || ch == '/') {
                    while (op.size() > 0 && (op.peek() == '*' || op.peek() == '/')) {
                        int v2 = val.pop();
                        int v1 = val.pop();

                        if (op.peek() == '*') val.push(v1 * v2);
                        if (op.peek() == '/') val.push(v1 / v2);

                        op.pop();
                    }
                    op.push(ch);
                }
            }
        }

        while (val.size() > 1) {
            int v2 = val.pop();
            int v1 = val.pop();

            if (op.peek() == '-') val.push(v1 - v2);
            if (op.peek() == '+') val.push(v1 + v2);
            if (op.peek() == '*') val.push(v1 * v2);
            if (op.peek() == '/') val.push(v1 / v2);

            op.pop();
        }

        System.out.println(val.peek());
    }
}