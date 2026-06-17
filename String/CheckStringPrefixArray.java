package String;

public class CheckStringPrefixArray {

    public static boolean isPrefixString(String s, String[] words) {

        StringBuilder sb = new StringBuilder();

        for (String word : words) {

            sb.append(word);

            if (sb.toString().equals(s)) {
                return true;
            }

            if (sb.length() > s.length()) {
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s = "iloveleetcode";
        String[] words = {"i", "love", "leetcode", "apples"};

        System.out.println(isPrefixString(s, words));
    }
}