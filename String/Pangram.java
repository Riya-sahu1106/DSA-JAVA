package String;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {

    public static boolean checkIfPangram(String sentence) {

        HashSet<Character> set=new HashSet<>();

        for(char ch : sentence.toCharArray()){
            if(ch>='a' && ch<='z'){
                set.add(ch);
            }
        }
        return set.size()==26;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        if (checkIfPangram(input)) {
            System.out.println("It is a Pangram ✅");
        } else {
            System.out.println("Not a Pangram ❌");
        }

        sc.close();
    }
}