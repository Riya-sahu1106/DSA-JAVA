//Write a program to print all elements in an array.
// For example, if the array is {1, 2, 3}, the output should be 1 2 3


package Array;
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of elements:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
