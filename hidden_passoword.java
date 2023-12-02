import java.lang.*;
import java.util.*;

public class hidden_passoword {

    public static String function(String str) {

        int a_count=0;
        int n_count=0;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                n_count++;
            else 
                a_count++;
        }

        if(n_count>a_count) {

            for(int i=0;i<str.length();i++) {
                if(str.charAt(i)>='0' && str.charAt(i)<='9')
                    sb.append("*");
                else
                    sb.append(str.charAt(i));
            }

        } else {

            for(int i=0;i<str.length();i++) {
                if(str.charAt(i)>='0' && str.charAt(i)<='9')
                    sb.append(str.charAt(i));
                else
                    sb.append("*");
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the hidden password");
        System.out.println("++++++++++++++++++++++++++++++++++\n");

        System.out.println("Enter the String");
        String str=sc.nextLine();
        sc.close();

        String result=function(str);

        System.out.println("The final result eill be ====");
        System.out.println(result);
    }
}