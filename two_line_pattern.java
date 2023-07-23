import java.util.*;
import java.lang.*;

public class two_line_pattern {
     public static void main(String args[]) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Java progrsm to print the two line pattern:");
          System.out.println("-----------------------------------------------\n");


          System.out.println("Enter the String:");
          String str=sc.nextLine();

          StringBuilder s1=new StringBuilder();
          StringBuilder s2=new StringBuilder();

          for(int i=0;i<str.length();i++) {
               if(i%2==0) {
                    s1=s1.append(str.charAt(i));
                    s1=s1.append("*");
               }
               else {
                    s2.append("*");
                    s2=s2.append(str.charAt(i));
               }

          }

          System.out.println("The two line pattern will be as::");
          System.out.println(s1);
          System.out.println(s2);

          


     }
}