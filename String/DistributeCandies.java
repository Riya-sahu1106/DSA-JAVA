package String;

import java.util.HashSet;

public class DistributeCandies {
    static int distri(int[]candyType){
        HashSet<Integer>set=new HashSet<>();

        for(int candy: candyType){
            set.add(candy);
        }
        return Math.min(set.size(),candyType.length/2);
    }
    public static void main(String[] args) {
        int[]candyType = {1,2,3,1,22,1};

        int result = distri(candyType);
        System.out.print("So she eats "+result+" candies");
    }
}
