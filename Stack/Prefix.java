package Stack;


import java.util.Scanner;
import java.util.Stack;

//*+23-45
public class Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        Stack<Integer> val = new Stack<>();
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            }else{
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch =='+') val.push(v1+v2);
                if(ch =='-') val.push(v1-v2);
                if(ch =='*') val.push(v1*v2);
                if(ch =='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}

