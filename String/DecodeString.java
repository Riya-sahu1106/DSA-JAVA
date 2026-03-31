package String;

import java.util.*;

class DecodeString {

    public String decodeString(String s) {

        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentString = "";
        int currentNumber = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }
            else if (ch == '[') {
                numberStack.push(currentNumber);
                stringStack.push(currentString);

                currentNumber = 0;
                currentString = "";
            }

            // If ']' → decode
            else if (ch == ']') {
                int repeat = numberStack.pop();
                String prevString = stringStack.pop();

                StringBuilder temp = new StringBuilder(prevString);

                for (int i = 0; i < repeat; i++) {
                    temp.append(currentString);
                }

                currentString = temp.toString();
            }

            else {
                currentString += ch;
            }
        }
        return currentString;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecodeString obj = new DecodeString();

        System.out.print("Enter the String:");
        String input = sc.nextLine();

        System.out.println(obj.decodeString(input));
    }
}