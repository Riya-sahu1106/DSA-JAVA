package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[]arr= {5,3,7,12,23,4,56,7};
       recPrint(arr,0);
    }
    public static void recPrint(int[]arr,int idx)
    {
        if(idx==arr.length)return;
        System.out.println(arr[idx]);
        recPrint(arr,idx+1);
        
    }
}
