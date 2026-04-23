package Recursion;
import java.util.Scanner;

//leetcode 383
public class RansomNote {
    public static boolean canConstruct(String ransomNote,String magazine){
        int[] charCount = new int[26];

        for(char c : magazine.toCharArray()){
            charCount[c-'a']++;
        }

        for(char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] == 0){
                return false;
           }
            charCount[c-'a']--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ransomNote: ");
        String ransomNote = sc.nextLine();

        System.out.print("Enter the magazine: ");
        String magazine = sc.nextLine();

        canConstruct(ransomNote,magazine);
        if(canConstruct(ransomNote,magazine)){
            System.out.println("Yes ransomNote i.e "+ransomNote+" can be constructed by magazine i.e "+magazine);
        }
        else{
            System.out.println("No ransomNote i.e "+ransomNote+" can't' be constructed by magazine i.e "+magazine);
        }

    }
}
