package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
//        while(n!0){
//            r *=0;
//            r +=n%10;
//            n =n/10;
//        }
        reverse(n,0);
    }
    public static void reverse(int n , int r){
        if(n ==0){
            System.out.println(r);
            return;
        }
        reverse(n/10, r*10 + n%10);
    }
}
