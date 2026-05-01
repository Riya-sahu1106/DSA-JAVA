package Stack;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {

        List<Integer> st = new ArrayList<>();

        for (int i = 0; i < asteroids.length; i++) {

            if (asteroids[i] > 0) {
                st.add(asteroids[i]);
            } else {

                while (!st.isEmpty() && st.get(st.size() - 1) > 0 &&
                        st.get(st.size() - 1) < Math.abs(asteroids[i])) {
                    st.remove(st.size() - 1);
                }

                if (!st.isEmpty() && st.get(st.size() - 1) == Math.abs(asteroids[i])) {
                    st.remove(st.size() - 1);
                } else if (st.isEmpty() || st.get(st.size() - 1) < 0) {
                    st.add(asteroids[i]);
                }
            }
        }

        int[] result = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AsteroidCollision ac = new AsteroidCollision();

        int n = sc.nextInt();
        int[] asteroids = new int[n];

        for (int i = 0; i < n; i++) {
            asteroids[i] = sc.nextInt();
        }

        int[] res = ac.asteroidCollision(asteroids);
        System.out.print("Answer is "+ Arrays.toString(res));
    }
}

