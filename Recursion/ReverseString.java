package Recursion;

import java.util.Scanner;

public class ReverseString {

    public static void reverseStringHelper(char[]arr,int start,int end){
        if(start>=end){
            return;
        }

        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseStringHelper(arr,start+1, end-1);
    }

    public static void reverseString(char[]arr){
        reverseStringHelper(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();

        reverseString(arr);
        System.out.println("Reversed string is: "+new String(arr));


    }
}
