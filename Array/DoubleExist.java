package Array;
import java.util.HashSet;
import java.util.Scanner;

public class DoubleExist{

    public static boolean checkIfExist(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(2 * num)) {
                return true;
            }

            if (num % 2 == 0 && set.contains(num / 2)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = checkIfExist(arr);

        System.out.println("Result: " + result);

        sc.close();
    }
}