package String;

import java.io.CharConversionException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Solution {
    public int firstUnique(String s) {
        int index = -1;
        Map<Character, Integer> charFreq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int freq = charFreq.getOrDefault(ch, 0);

            charFreq.put(ch, (freq + 1));
        }

        for (int i = 0; i < s.length(); i++) {
            if (charFreq.get(s.charAt(i)) == 1) {
                index = i;
                break;
            }
        }
        return index;
    }
}

public class FirstUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String s = sc.nextLine();

        Solution sol=new Solution();
        int ans= sol.firstUnique(s);

        System.out.println("So First Unique Character is at index:"+ans);

    }
}
