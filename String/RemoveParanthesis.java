package String;

class RemoveParanth{
    // Function to remove outer parentheses
    public String removeOuterParentheses(String s) {
        // Initialize result string
        StringBuilder result = new StringBuilder();
        // Initialize nesting level counter
        int level = 0;

        // Traverse the string
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (level > 0) result.append(ch);
                level++;
            }

            else if (ch == ')') {

                level--;

                if (level > 0) result.append(ch);
            }
        }

        return result.toString();
    }
}
class RemoveParathesis {
    public static void main(String[] args) {
        String s = "(()())(())";  // Example input string
        RemoveParanth sol = new RemoveParanth();

        // Get result
        String ans = sol.removeOuterParentheses(s);

        // Print result
        System.out.println("The result is: " + ans);
    }
}