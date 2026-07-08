package NumberBasedQuestions;

import java.util.Scanner;

public class CheckPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        if(n>0){
            System.out.println("Given number " +n+ " is positive.");
        }else if(n<0){
            System.out.println("Given number is negative.");
        }else{
            System.out.println("Given number is zero.");
        }
    }
}
