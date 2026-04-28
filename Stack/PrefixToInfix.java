package Stack;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        Stack<String> val = new Stack<>();

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                val.push(ch+"");
            }else{
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;
                String t = "("+v1+op+v2+")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
