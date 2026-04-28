package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
    }
}
