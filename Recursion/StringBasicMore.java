package Recursion;

import java.util.ArrayList;

public class StringBasicMore {
    public static void main(String[] args) {
        String s = "Kartik";
        change(s);
        System.out.println(s);

        String[] arr= {"santosh","riya","siya","kiya"};

        ArrayList<String> al = new ArrayList<>();
        al.add("shravan");
        al.add("priya");
        al.add("ayan");
        al.add("krish");
        System.out.print(al);
        change2(al);
        System.out.println();
        System.out.print(al);
    }

    private static void change2(ArrayList<String> al) {
         al.add("vipul");
    }

    //string pass by reference ni hoti arraylist of string hoti h
    private static void change(String s) {
       s = "lavish";
    }
}
