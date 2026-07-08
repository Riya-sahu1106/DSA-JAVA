package NumberBasedQuestions;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        if(n>=0 && n%2 ==0){
            System.out.println("Given number is even.");
        }else{
            System.out.println("Given number is odd.");
        }
    }
}
