package Sliding_Window;

import java.util.*;

public class FirstNegativeInWindow {

    public static List<Integer> firstNegative(int[]arr,int k){
        int start=0;
        int end=0;

        List<Integer> result = new ArrayList<>();
        Queue<Integer> negatives = new LinkedList<>();

        while(end<arr.length){

            if(arr[end]<0){
                negatives.offer(arr[end]);
            }

            if(end-start+1 == k){
                if(negatives.isEmpty()){
                    result.add(0);
                }else{
                    result.add(negatives.peek());
                }
                if (!negatives.isEmpty() && arr[start] == negatives.peek()) {
                    negatives.poll();
                }

                start++;
            }
            end++;
        }
        return result;
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

        List<Integer> ans = firstNegative(arr, k);

        for (int num : ans) {
            System.out.print(num + " ");
        }

    }
}
