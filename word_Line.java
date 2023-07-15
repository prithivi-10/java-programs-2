import java.lang.*;
import java.util.*;

public class word_Line {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print line by line seperated by the space::");
        System.out.println("=============================================================\n");

        System.out.println("Enter the string:");
        String str=sc.nextLine();

        String strarr[]=str.split(" ");

       System.out.println("The result will be:::");
        for(String s:strarr) {
            System.out.println(s);
        }


    }
}