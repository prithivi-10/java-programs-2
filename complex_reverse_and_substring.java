import java.util.*;
public class complex_reverse_and_substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print print complex 'SUBSTRING AND REVERSE' in a single given string:");
        System.out.println("=====================================================================================\n");

        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the number:");
        int num=sc.nextInt();

       String op;
       int ads=num/2;

       int len = str.length()/2;


       System.out.println("The final string is looks like as:::");
       if(str.length()%2==1) {
            int left = len-ads;
            int right = len+(ads+1);
            op=str.substring(left,right);

            StringBuilder sb=new StringBuilder(op);

            System.out.print(str.substring(0,left)+" "+sb.reverse()+" "+str.substring(right));
       }
       else {
            int left = len-ads;
            int right = len+(ads);
            op=str.substring(left,right);

            StringBuilder sb=new StringBuilder(op);

            System.out.print(str.substring(0,left)+" "+sb.reverse()+" "+str.substring(right));

       }


       



       



    }
}