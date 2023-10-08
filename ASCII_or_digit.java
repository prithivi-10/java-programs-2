import java.util.*;

public class ASCII_or_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the ASCII value:");
        System.out.println("=================================================\n");

        System.out.println("Enter the String:");

        String str=sc.nextLine();


        System.out.println("The output will be ==");
        
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='1'||ch=='0'||ch=='2'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='3') {
                System.out.print(ch+" ");
            }
            else {
                System.out.print((int)(ch)+" ");
            }

        }


        
    }
}