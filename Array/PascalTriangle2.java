package Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  PascalTriangle2 {

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        for (int idx = 1; idx <= rowIndex; idx++) {

            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for (int i = 1; i <= idx - 1; i++) {
                curr.add(prev.get(i) + prev.get(i - 1));
            }

            curr.add(1);

            prev = curr;
        }

        return prev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row index: ");
        int rowIndex = sc.nextInt();

        List<Integer> ans = getRow(rowIndex);

        System.out.println("Pascal Row is:");
        System.out.println(ans);

        sc.close();
    }
}