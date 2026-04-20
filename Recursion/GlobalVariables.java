package Recursion;

public class GlobalVariables {
    static int x =10;        //global variable declare & ini
    public static void main(String[] args) {
        int x=9;          //local variable declare & ini
        System.out.println(x);
        x = 2;             //initialize
        System.out.println(x);
        fun();
    }
    public static void fun(){
        System.out.println(x);
    }
}
