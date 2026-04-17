package String;
import java.util.*;

public class AddParanthesis {

    public static void main(String[] args) {
        Add obj = new Add();

        String expression = "2*3-4*5";   // you can change input here
        List<Integer> result = obj.diffWaysToCompute(expression);

        System.out.println("Output: " + result);
    }
}

class Add {

    public List<Integer> diffWaysToCompute(String expression) {
        return solve(expression, new HashMap<>());
    }

    private List<Integer> solve(String exp, Map<String, List<Integer>> memo) {

        if (memo.containsKey(exp)) {
            return memo.get(exp);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*') {

                List<Integer> left = solve(exp.substring(0, i), memo);
                List<Integer> right = solve(exp.substring(i + 1), memo);

                for (int l : left) {
                    for (int r : right) {
                        if (ch == '+') result.add(l + r);
                        else if (ch == '-') result.add(l - r);
                        else result.add(l * r);
                    }
                }
            }
        }

        if (result.isEmpty()) {
            result.add(Integer.parseInt(exp));
        }

        memo.put(exp, result);
        return result;
    }
}