package String;
import java.util.*;

public class groupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        GroupAnagrams obj = new GroupAnagrams();
        List<List<String>> result = obj.groupAnagrams(strs);

        System.out.println(result);
    }
}
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String key = getFrequencyString(str);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private String getFrequencyString(String str) {

        int[] freq = new int[26];

        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        char c = 'a';
        for (int i : freq) {
            sb.append(c).append(i);
            c++;
        }
        return sb.toString();
    }
}