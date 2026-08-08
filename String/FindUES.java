package String;
public class FindUES {

    public static int findLUSlength(String a, String b) {

        if (a.equals(b)) {
            return -1;
        }

        return Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {

        String a = "aba";
        String b = "cdc";

        int result = findLUSlength(a, b);

        System.out.println("Longest Uncommon Subsequence Length = " + result);
    }
}