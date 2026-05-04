package Stack;

import java.util.Stack;

public class EvaluateRPN {

    public static int evalRPN(String[] tokens) {
        String expreStr = "*/-+";

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (expreStr.contains(token)) {
                int op2 = stack.pop();
                int op1 = stack.pop();

                int val = 0;

                switch (token) {
                    case "+":
                        val = op1 + op2;
                        break;
                    case "-":
                        val = op1 - op2;
                        break;
                    case "*":
                        val = op1 * op2;
                        break;
                    case "/":
                        val = op1 / op2;
                        break;
                }

                stack.push(val);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};

        int result = evalRPN(tokens);

        System.out.println("Result: " + result);
    }
}
