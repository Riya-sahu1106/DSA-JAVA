package Greedy_Algo;

import java.util.Scanner;

public class CheckValidString {
    public boolean checkValidString(String s) {
        int minOpen = 0;
        int maxOpen = 0;

        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);

            if (c == '(') {
                minOpen++;
                maxOpen++;
            }
            else if (c == ')') {
                minOpen--;
                maxOpen--;
            }
            else {
                minOpen--;
                maxOpen++;
            }
            if (maxOpen < 0) return false;
            if (minOpen < 0) minOpen = 0;
        }
        return minOpen == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        CheckValidString cv = new CheckValidString();
        if (cv.checkValidString(input)) {
            System.out.println("Valid parenthesis string");
        } else {
            System.out.println("Invalid parenthesis string");
        }
    }
}
