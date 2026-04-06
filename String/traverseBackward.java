package String;


import java.util.Scanner;

class Traversal {
    public boolean backspaceCompare(String s, String t) {
        return getActual(s).equals(getActual(t));
    }

    private String getActual(String input){
        StringBuilder actualString = new StringBuilder();
        int hashCount = 0;

        for(int i = input.length()-1; i>=0; i--){
            if(input.charAt(i) == '#'){
                hashCount++;
                continue;
            }
            if(hashCount > 0){
                hashCount--;
            }else{
                actualString.insert(0, input.charAt(i));
            }
        }
        return actualString.toString();
    }
}
public class traverseBackward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string s:");
        String s = sc.nextLine();

        System.out.print("Enter the string s:");
        String t = sc.nextLine();

        Traversal tr =new Traversal();
        boolean ans = tr.backspaceCompare(s,t);

        if(ans){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}