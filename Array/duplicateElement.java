package Array;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Duplicate {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultSet = new ArrayList<>();

        for(int i =0; i<nums.length; i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] < 0){
                resultSet.add(index + 1);
            }

            nums[index] = nums[index] * -1;
        }
        return resultSet;
    }
}
public class duplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a number: ");
        int n=sc.nextInt();

        int [] nums=new int[n];
        System.out.print("Enter the number: ");
        for(int i=0 ;i<n; i++){
            nums[i] = sc.nextInt();
        }
        Duplicate ans = new Duplicate();
        List<Integer> result = ans.findDuplicates(nums);

        System.out.print("So the answer is: "+result);

    }
}
