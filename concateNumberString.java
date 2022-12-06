import java.util.*;
public class concateNumberString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Java program to print the concate of string in given number:");
        System.out.println("=============================================================\n");

        System.out.println("Enter the string:");
        String str=sc.nextLine();

        System.out.println("Enter the number:");
        int k=sc.nextInt();

        System.out.println("Output can be as:");
        System.out.println(str.substring(0,k)+str.substring(str.length()-k));
    }
}