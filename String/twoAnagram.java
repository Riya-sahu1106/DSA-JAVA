package String;

import java.util.Scanner;

class Anagram {
    public static boolean twoStringsAnagram(String str1, String str2) {
        int s1 = str1.length();
        int s2 = str2.length();
        if (s1 != s2) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        int[] count = new int[26];
        for (int i = 0; i < s1; i++) {
            count[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2; i++) {
            count[str2.charAt(i) - 'a']--;
        }

        for (int counts : count) {
            if (counts != 0) {
                return false;
            }
        }
        return true;
    }
}
public class twoAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the String1:");
        String str1=sc.nextLine();

        System.out.print("Enter the String1:");
        String str2=sc.nextLine();

        Anagram a=new Anagram();
        boolean ans=a.twoStringsAnagram(str1,str2);

        if(ans){
            System.out.print("Two strings are anagram:"+str1+" "+str2);
        }
        else{
            System.out.print("Two strings are not anagram:"+str1+" "+str2);
        }
    }
}
