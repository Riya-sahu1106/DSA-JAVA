package String;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SortTheSentence {
    public String sortSentence(String s) {

        Map<Integer , String> indexWordMap = new HashMap<>();

        for(String word : s.split(" ")){
            int lastIndex = word.length() - 1;

            int index = word.charAt(lastIndex) - '0';
            String actualWord = word.substring(0, lastIndex);

            indexWordMap.put(index, actualWord);
        }

        StringBuilder actualString = new StringBuilder();
        for(Map.Entry<Integer, String> indexWord : indexWordMap.entrySet()){
            actualString.append(indexWord.getValue());
            actualString.append(" ");
        }
        return actualString.toString().trim();
    }
}
public class sortingSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String s = sc.nextLine();

        SortTheSentence sort = new SortTheSentence();
        String result = sort.sortSentence(s);

        System.out.print("So the sorting string is: "+result);

    }
}
