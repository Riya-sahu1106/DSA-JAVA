package String;


import java.util.Scanner;

class IsPalindromeType2 {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return isPalindrome(s, left+1, right) || isPalindrome(s, left, right-1);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
class isPalindrome{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.nextLine();

        IsPalindromeType2 pal = new IsPalindromeType2();
        boolean result = pal.validPalindrome(s);
        if(result) {
            System.out.print("So the given String "+s+ " is Palindrome");
        }
        else{
            System.out.print("So the given String "+s+ " is not Palindrome");
        }
    }
}