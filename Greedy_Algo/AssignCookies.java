package Greedy_Algo;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[]students,int[]cookies){
        Arrays.sort(students);
        Arrays.sort(cookies);

        int i=0;
        int j=0;

        while(i < students.length && j<cookies.length){
            if(cookies[j] >= students[i]){
                i++;
            }
            j++;
        }
        return i;
    }
    public static void main(String[] args) {
        int[] students = {1,2,3};
        int[] cookies = {1,1,2,3};

        int ans = findContentChildren(students,cookies);
        System.out.println("Maximum satisfied children = "+ans);
    }
}
