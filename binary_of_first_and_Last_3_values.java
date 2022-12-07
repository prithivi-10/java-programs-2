import java.util.*;
public class binary_of_first_and_Last_3_values {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("\nJava program to print the binary representation of first and last 3 bits of a given number:");
        System.out.println("============================================================================================\n");

        System.out.println("Enter the number:");
        int num =sc.nextInt();

        //convert int to string:
        String str=Integer.toBinaryString(num);
        System.out.println("Binary value of the given number is = "+str+"\n");

        //substring of first 3 bits:
        String first=str.substring(0,3);
        System.out.println("Substring of first 3 bits of the given number is = "+first+"\n");

        //substring of last 3 bits:
        String last=str.substring(str.length()-3);
        System.out.println("Substring of last 3 bits of the given number is = "+last+"\n");



        //decimal value of first 3 bits:
        int binaryFirst=Integer.parseInt(first,2);
        System.out.println("The Decimal value of the first 3 bits of a given number is = "+binaryFirst+"\n");
        


        //decimal value of first 3 bits:
        int binaryLast=Integer.parseInt(last,2);
        System.out.println("The Decimal value of the last 3 bits of a given number is = "+binaryLast+"\n");



    }
}