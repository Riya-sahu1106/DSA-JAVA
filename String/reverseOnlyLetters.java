package String;

import java.util.Scanner;


class ReverseOnlyLettersHelper {
    public String reverse(String str){
        char[] arr = str.toCharArray();
        int left = 0, right = str.length() - 1;

        while(left < right){
            if(!Character.isLetter(arr[left])) left++;
            else if(!Character.isLetter(arr[right])) right--;
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}

public class reverseOnlyLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        ReverseOnlyLettersHelper res = new ReverseOnlyLettersHelper();
        String result = res.reverse(str);

        System.out.println("The answer is: " + result);
    }
}