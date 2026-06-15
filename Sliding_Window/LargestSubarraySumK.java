package Sliding_Window;

import java.util.Scanner;

public class LargestSubarraySumK {

    public static int largestSubarray(int[]arr,int k){

        int start=0;
        int sum = 0;
        int maxLength = 0;

        for(int end = 0; end<arr.length;end++ ){
            sum += arr[end];

            while(sum>k){
                sum -= arr[start];
                start++;
            }
            if(sum==k){
                maxLength=Math.max(maxLength,end-start+1);
            }
        }
        return maxLength;
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

        System.out.print("Enter the maximum sum: ");
        int k = sc.nextInt();

        System.out.println("Length = " + largestSubarray(arr, k));

    }
}
