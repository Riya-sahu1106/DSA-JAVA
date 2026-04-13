package Array;

import java.util.Arrays;
import java.util.Scanner;

class Sorted{
    int[] sortedSquares(int[]nums){

        int[] result = new int [nums.length];

        for(int i =0; i < nums.length; i++){
              nums[i] = nums[i] * nums[i];
        }

        int head = 0;
        int tail = nums.length-1;

        for(int pos = nums.length-1; pos>=0; pos--){
            if(nums[head]>nums[tail]){
                result[pos] = nums[head];
                head++;
            }
            else{
                result[pos] = nums[tail];
                tail--;
            }
        }
        return result;
    }
}

public class SortedSquare {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        System.out.print("Elements of array: ");
        int []nums= new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        Sorted so = new Sorted();
        int []ans = so.sortedSquares(nums);

        System.out.print("Answer of this array is: "+ Arrays.toString(ans));
    }
}
