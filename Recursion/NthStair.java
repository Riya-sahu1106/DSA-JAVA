package Recursion;

import java.util.Scanner;

public class NthStair {
    static int countWays(int n) {
        if(n==1)return 1;
        if(n==2)return 2;
        return countWays(n-1) + countWays(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(countWays(n));
    }
}
