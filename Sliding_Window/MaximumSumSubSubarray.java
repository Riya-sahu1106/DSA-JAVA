package Sliding_Window;

import java.util.Scanner;

public class MaximumSumSubSubarray {

    public static int maxSumSubarray(int[]arr,int k){
       int start=0;
       int end=0;
       int sum=0;
       int maxSum=Integer.MIN_VALUE;

       while(end < arr.length){
           sum += arr[end];

           if(end - start + 1 == k){
               maxSum = Math.max(maxSum,sum);

               sum -= arr[start];
               start++;
           }
           end++;
       }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sze of array: ");
        int n = sc.nextInt();

        int[]arr=new int[n];

        System.out.println("Enter array elements:");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        int result = maxSumSubarray(arr,k);
        System.out.println("The answer is: "+result);
    }
}
