import java.util.*;

public class palindrome_without_special_characters {

    public static boolean isPalindrome(String s) {
        int len=s.length();
        s=s.toLowerCase();

        String str="";
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)>='a' && s.charAt(i)<='z') {
                str=str+s.charAt(i);
            }
        }

        String revstr="";
        for(int i=str.length()-1;i>=0;i--) {
            revstr=revstr+str.charAt(i);
        }

        if(str.equals(revstr)) {
            return true;
        }
        else {
            return false;
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to return true or false based on palindrome without special characters:");
        System.out.println("-------------------------------------------------------------------------------------\n");
       
        String str1="A man, a plan, a canal: Panama";
        String str2="PRITHIVI@RAJ:";


        System.out.println("Result of fist input:");
        System.out.println(isPalindrome(str1));
        System.out.println("Result of second input:");
        System.out.println(isPalindrome(str2));

     


    }
}