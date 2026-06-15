package Sliding_Window;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithKUniqueCharacters {

    public static void longestSubstring(String str, int k) {

        int start = 0;
        int maxLength = 0;

        int ansStart = 0;
        int ansEnd = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < str.length(); end++) {

            char ch = str.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {

                char leftChar = str.charAt(start);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                start++;
            }

            if (map.size() == k) {

                int currentLength = end - start + 1;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    ansStart = start;
                    ansEnd = end;
                }
            }
        }

        System.out.println("Length = " + maxLength);
        System.out.println("Substring = " +
                str.substring(ansStart, ansEnd + 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        int k = 3;

        longestSubstring(str, k);
    }
}