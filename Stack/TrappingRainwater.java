package Stack;

import java.util.Scanner;

public class TrappingRainwater {
    public static int trap(int[]height){
        int n = height.length;
        if(n==0) return 0;

        int[]leftMax = new int[n];
        int[]rightMax = new int[n];
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];

          for(int i=1; i<n; i++){
              leftMax[i] = Math.max(leftMax[i-1], height[i]);
          }
          for(int i=n-2; i>=0; i--){
              rightMax[i] = Math.max(rightMax[i+1], height[i]);
          }
          int totalWater = 0;
          for(int i=0; i<n; i++){
              totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
          }
          return  totalWater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();

        int[] height= new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i =0; i<n; i++){
            height[i] = sc.nextInt();
        }

        int result = trap(height);
        System.out.print("Answer is "+result);
    }
}
