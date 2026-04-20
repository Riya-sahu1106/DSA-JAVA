package Recursion;

import java.util.Scanner;

public class GCD {
    public static int gcd(int a,int b){
         if(a==0)return b;
         return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1:");
        int a=sc.nextInt();
        System.out.print("Enter the number2:");
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
    }
}
