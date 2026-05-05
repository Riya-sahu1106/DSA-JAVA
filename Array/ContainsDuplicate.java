package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicate {
     public static boolean containDuplicate(int[]nums){
         Arrays.sort(nums);
         int n=nums.length;
         for(int i =0; i<n-1; i++){
            if( nums[i] == nums[i+1])
             return true;
         }
         return false;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a number: ");
        int n=sc.nextInt();

        int [] nums=new int[n];
        System.out.print("Enter the number: ");
        for(int i=0 ;i<n; i++){
            nums[i] = sc.nextInt();
        }
      boolean res = containDuplicate(nums);
        if(res){
            System.out.println("Yes , It Contains Duplicate");
        }else{
            System.out.println("Not contains Duplicate");
        }
    }
}
