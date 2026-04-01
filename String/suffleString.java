package String;

import java.util.Scanner;

class restore {
    public String restoreString(String s, int[] indices) {
        char [] str = new char[s.length()];

        for(int i = 0; i< s.length(); i++){
            str[indices[i]] = s.charAt(i);
        }

        return String.valueOf(str);
    }
}
class suffleString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        System.out.print("Enter the indices: ");
        int [] indices = new int[s.length()];

        for(int i =0 ;i<s.length(); i++){
            indices[i] = sc.nextInt();
        }

        restore res = new restore();
        String ans = res.restoreString(s,indices);

        System.out.println(ans);


    }
}