import java.lang.*;
import java.util.Scanner;

public class abcd_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Java program to print the pattern");
        System.out.println("============================\n");

        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        ch=Character.toUpperCase(ch);

        char start='A';

        System.out.println("The resultant pattern wil be ::");
        while(start<=ch) {
            for(char i='A';i<=start;i++) {
                System.out.print(start+" ");
            }
            System.out.println();
            start++;
        }

    }
}