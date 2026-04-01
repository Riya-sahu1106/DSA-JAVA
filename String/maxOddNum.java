package String;

import java.util.Scanner;

class maxOddNum {
    public String maximumOddBinaryNumber(String s) {

        int countZero = 0;
        int countOne = 0;
        for(char c : s.toCharArray()){
            if(c == '0'){
                countZero++;
            }
            else{
                countOne++;
            }
        }
        StringBuilder ans = new StringBuilder();

        ans.append("1");
        countOne--;

        ans.append("0".repeat(countZero));

        ans.append("1".repeat(countOne));

        return ans.reverse().toString();

    }
}

class maxOddNumber {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.nextLine();

        maxOddNum max=new maxOddNum();
        String result=max.maximumOddBinaryNumber(s);

        System.out.print("Maximum odd binary number is: "+result);
    }
}