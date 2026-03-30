package String;


import java.util.*;

public class PartitionLabels {

    public static List<Integer> partitionLabels(String s) {

        List<Integer> partitions = new ArrayList<>();

        for (int i = 0; i < s.length(); ) {

            int startIndex = i;
            int endIndex = s.lastIndexOf(s.charAt(startIndex));

            for (int j = startIndex + 1; j <= endIndex - 1; j++) {

                int lastIndexOfNextChar = s.lastIndexOf(s.charAt(j));

                if (lastIndexOfNextChar > endIndex) {
                    endIndex = lastIndexOfNextChar;
                }
            }

            partitions.add(endIndex - startIndex + 1);

            // important step
            i = endIndex + 1;
        }

        return partitions;
    }

    // 🔹 Main method for testing in IntelliJ
    public static void main(String[] args) {

        String s = "ababcbacadefegdehijhklij";

        List<Integer> result = partitionLabels(s);

        System.out.println("Partitions: " + result);
    }
}
