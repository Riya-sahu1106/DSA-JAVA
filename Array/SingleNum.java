package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNum {
    public static int singleNum(int []nums){
//        Map<Integer,Integer> map = new HashMap<>();
//
//        for(int num:nums){
//            if(!map.containsKey(num)){
//                map.put(num,0);
//            }
//            map.put(num,map.get(num)+1);
//        }
//        for(int num : nums){
//            if(map.get(num) == 1){
//                return num;
//            }
//        }
//        return -1;

        int res = 0;
        for(int num:nums){
            res = res^num;
        }
        return res;
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

        int res = singleNum(nums);
        System.out.print(res);

    }
}
