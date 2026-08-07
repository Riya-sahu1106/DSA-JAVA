package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindRestaurant599 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        int minSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {

            for (int j = 0; j < list2.length; j++) {

                if (list1[i].equals(list2[j])) {

                    int sum = i + j;

                    if (sum < minSum) {
                        minSum = sum;
                        result.clear();
                        result.add(list1[i]);
                    }
                    else if (sum == minSum) {
                        result.add(list1[i]);
                    }
                }
            }
        }

        return result.toArray(new String[0]);


    }
    public static void main(String[] args) {
        String[] list1 = {"A", "B", "C"};
        String[] list2 = {"B", "A", "C"};

        String[] ans = findRestaurant(list1, list2);

        System.out.println(Arrays.toString(ans));
    }
}
