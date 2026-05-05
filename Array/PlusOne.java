package Array;

import java.util.Scanner;

public class PlusOne {
    public int[] plusOne(int[]digits){
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i] = digits[i]+1;
                return digits;
            }
        }
        int[]res = new int [digits.length+1];
        res[0]=1;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] digits = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
    }
}
