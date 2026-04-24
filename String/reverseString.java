package String;

import java.util.Scanner;

public class reverseString {

    public String reverseWords(String s){
        char[] arr = s.toCharArray();
        int left = 0, right = 0;

        while(right < arr.length){
            if(arr[right] == ' '){
                reverse(arr, left, right - 1); // FIXED
                left = right + 1;
            }
            right++;
        }

        reverse(arr, left, right - 1); // last word reverse
        return new String(arr);
    }

    private void reverse(char[] arr, int left, int right){
        while(left < right){
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        reverseString obj = new reverseString(); // object create
        String result = obj.reverseWords(s);     // method call

        System.out.println("Output: " + result);
    }
}