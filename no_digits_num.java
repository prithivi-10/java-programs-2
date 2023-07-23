import java.lang.*;
import java.util.*;

public class no_digits_num {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the number of digits in the number:");
        System.out.println("==========================================================/n");

        System.out.println("Enter the number:");
        int num=sc.nextInt();

        String str=Integer.toString(num);

        System.out.println("The number of digits in the num is ::\n"+str.length());
    }
}

