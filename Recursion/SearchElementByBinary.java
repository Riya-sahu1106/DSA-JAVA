package Recursion;

import java.util.Scanner;

public class SearchElementByBinary {
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
        System.out.println(target+ " Fount at index:"+search(arr,target));
    }
    public static int helper(int []arr,int target,int low,int high){
        if(low>high) return -1;
        int mid = low+(high-low)/2;
        if(arr[mid]==target)return mid;
        else if(arr[mid]>target) return helper(arr,target,0,mid-1);
        else return helper(arr,target,mid+1,high);
    }
    public static int search(int []arr,int target){
        int n = arr.length;
        return helper(arr,target,0,n-1);
    }
}
