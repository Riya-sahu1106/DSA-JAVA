package Sliding_Window;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithUniqueCharacters {

    public static int longestSubstring(String str,int k){
        int start=0;
        int maxLength=0;

        Map<Character, Integer> map = new HashMap<>();

        for(int end=0; end<str.length(); end++){
            char ch = str.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()>k){
                char leftChar = str.charAt(start);
                map.put(leftChar,map.get(leftChar)-1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                start++;
            }
            if (map.size() == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.next();
        int k = 3;

        System.out.println("So the answer is: " +longestSubstring(str, k));
    }
}
