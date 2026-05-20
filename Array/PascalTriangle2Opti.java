package Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle2Opti {
    public static List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {

            int currEle = (int) (row.get(i - 1) * (long) (rowIndex - i + 1) / i);

            row.add(currEle);
        }
        return row;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row index: ");
        int rowIndex = sc.nextInt();

        List<Integer> ans = getRow(rowIndex);

        System.out.println("Pascal Triangle Row:");
        System.out.println(ans);

        sc.close();
    }
}