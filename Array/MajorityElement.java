package Array;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int el=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                el=arr[i];
            }else if(el==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int cnt=0;
        for(int num:arr){
            if(num==el){
                cnt++;
            }
        }
        System.out.println(el+" "+"occurs"+" " +cnt+" "+"times");
    }
}
