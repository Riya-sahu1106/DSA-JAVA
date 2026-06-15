package Sliding_Window;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaximumOfSubArrays {

    public static void maxOfSubArrays(int[]arr,int k){
        Deque<Integer> dq = new LinkedList<>();

        int start=0;

        for(int end = 0; end<arr.length; end++){
            while (!dq.isEmpty() && dq.peekLast()<arr[end]){
                dq.pollLast();
            }

            dq.offerLast(arr[end]);

            if(end-start+1==k){
                System.out.print(dq.peekFirst()+" ");

                if(arr[start]==dq.peekFirst()){
                    dq.pollFirst();
                }
                start++;
            }
        }
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

        maxOfSubArrays(arr,k);
    }
}
