package Recursion;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of elements:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target:");
        int target = sc.nextInt();

        System.out.println(exists(arr,target,0));
    }
    public static boolean exists(int[]arr,int target , int idx ){
        if(idx==arr.length) return false;
        if(arr[idx]==target)return true;
           return exists(arr,target,idx+1);

    }
}
