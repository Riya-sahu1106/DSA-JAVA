package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class WordPattern {
    static boolean wordPattern(String patten,String s){
        String [] words = s.split(" ");

        if(patten.length() != words.length){
            return false;
        }

        HashMap<Character,String> charToWord = new HashMap<>();
        HashMap<String,Character> wordToChar = new HashMap<>();

        for(int i =0; i< patten.length(); i++){
              char ch = patten.charAt(i);
              String word = words[i];

              if(charToWord.containsKey(ch)){
                  if(!charToWord.get(ch).equals(word)){
                      return false;
                  }
              }else{
                  if(wordToChar.containsKey(word))
                      return false;

                  charToWord.put(ch,word);
                  wordToChar.put(word,ch);
              }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pattern:");
        String pattern = sc.nextLine();

        System.out.print("Enter the string:");
        String s = sc.nextLine();

        if(wordPattern(pattern,s)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
