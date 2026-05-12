package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        result.add(new ArrayList<Integer>());
        result.get(0).add(1);

        for (int row = 1; row < numRows; row++) {

            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);

            List<Integer> prevRow = result.get(row - 1);

            for (int i = 1; i < row; i++) {
                newRow.add(prevRow.get(i) + prevRow.get(i - 1));
            }

            newRow.add(1);

            result.add(newRow);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        List<List<Integer>> result = generate(numRows);

        System.out.println("Pascal Triangle:");

        for (List<Integer> row : result) {

            for (Integer num : row) {
                System.out.print(num + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
