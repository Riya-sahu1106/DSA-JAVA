package String;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class jands {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();

        for(int i = 0;i<jewels.length(); i++){
            jewelSet.add(jewels.charAt(i));
        }
        int score = 0;
        for(int i = 0;i<stones.length(); i++){
            if(jewelSet.contains(stones.charAt(i)))
                score++;
        }
        return score;
    }
}
public class jewelAndStone {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the jewels: ");
        String jewels = sc.nextLine();

        System.out.print("Enter the stones: ");
        String stones = sc.nextLine();

        jands js = new jands();
        int result = js.numJewelsInStones(jewels,stones);

        System.out.print("The answer is: "+result);

    }
}
