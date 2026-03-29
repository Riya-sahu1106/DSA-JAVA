package Array;

import java.util.Scanner;

public class sortArrayZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count0=0;
        int count1=0;
        int count2=0;
        for(int num:arr){
            if(num==0)count0++;
            else if(num==1)count1++;
            else count2++;
        }

        int index=0;
        while(count0-->0){
            arr[index++]=0;
        }
        while(count1-->0){
            arr[index++]=1;
        }
        while(count2-->0){
            arr[index++]=2;
        }

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
