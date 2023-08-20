import java.lang.*;
import java.util.*;

class Result {

    public String function(String str) {

        String newStr="";

        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
                newStr+="*";
            else 
                newStr+=ch;
        }
        return newStr;

    }
} 

public class mask_email {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the email as mask email");
        System.out.println("========================================\n");

        System.out.println("Enter the email");
        String email=sc.nextLine();

        Result rs=new Result();

        String result=rs.function(email);

        System.out.println("The resultant of the String is = "+result);
    }

}