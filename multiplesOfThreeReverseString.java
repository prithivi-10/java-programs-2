import java.lang.*;
import java.util.*;

public class multiplesOfThreeReverseString {
    public static void main(String ar[]) {
        Scanner sd=new Scanner(System.in);

        System.out.println("Java program to print 3 letter after reversing a string:");
        System.out.println("==================\n");

        System.out.println("Enter the String");
        String str=sd.nextLine();
        StringBuilder sb=new StringBuilder(str);

        System.out.print("The Entered String is = ");
        System.out.println(str);
        str=(sb.reverse()).toString();

        System.out.print("The Reverse of the entered String is = "+str);


        System.out.print("The result will be = ");
        for(int i=0;i<str.length();i++) {
            if((i+1)%3==0)
                System.out.print(str.charAt(i));
        }

    }
}