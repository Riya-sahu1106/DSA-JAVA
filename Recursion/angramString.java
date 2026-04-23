package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class angramString {
    public static List<Integer> findAnagrams(String s, String p){
        int[]pCount = new int[26];
        int[]sCount = new int[26];

        List<Integer> result = new ArrayList<>();

        for(char c : p.toCharArray()){
            pCount[c-'a']++;
        }

        for(int i =0; i< s.length(); i++){
            sCount[s.charAt(i)-'a']++;

            if(i >= p.length()){
                sCount[s.charAt(i-p.length()) - 'a']--;
            }

            if(Arrays.equals(pCount,sCount)){
                result.add(i-p.length() + 1);
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String1: ");
        String s = sc.nextLine();

        System.out.print("Enter the String2: ");
        String p = sc.nextLine();

       List<Integer> res = findAnagrams(s,p);
        System.out.println(res);

    }
}
