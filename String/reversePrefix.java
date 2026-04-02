package String;

import java.util.Scanner;
import java.util.Stack;

class reversepre{
     public String reversePrefix(String str, String ch){
         Stack<Character> st = new Stack<>();

         int firstOccurrence = str.indexOf(ch);
         if(firstOccurrence == -1 ){
             return str;
         }

         for(int i=0; i<= firstOccurrence; i++){
             st.push(str.charAt(i));
         }

         StringBuilder result = new StringBuilder();

         while(!st.isEmpty()){
             result.append(st.pop());
         }

         for(int i = (firstOccurrence + 1); i< str.length(); i++){
             result.append(str.charAt(i));
         }

         return result.toString();




     }
}
public class reversePrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        System.out.print("Enter the char: ");
        String ch = sc.nextLine();

        reversepre res = new reversepre();
        String result = res.reversePrefix(str, ch);
        System.out.print("The answer is: "+result);

    }
}
