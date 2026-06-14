package Sliding_Window;

import java.util.HashMap;
import java.util.Scanner;

public class CountAnagrams {
    public static int countAnagrams(String txt,String pat){

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : pat.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = map.size();
        int start=0;
        int end=0;
        int k = pat.length();

        int ans=0;

        while(end<txt.length()){
            char ch = txt.charAt(end);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);

                if(map.get(ch)==0){
                    count--;
                }
            }
            if(end-start+1 == k){
                if(count==0){
                    ans++;
                }
                char leftChar = txt.charAt(start);

                if (map.containsKey(leftChar)) {

                    if (map.get(leftChar) == 0) {
                        count++;
                    }

                    map.put(leftChar, map.get(leftChar) + 1);
                }
                start++;
            }
            end++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String txt = sc.next();
        String pat = sc.next();

        System.out.println("So the count of anagrams occurrences is:" +countAnagrams(txt, pat));
    }
}
