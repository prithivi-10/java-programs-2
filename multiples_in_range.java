import java.lang.*;
import java.util.*;

public class multiples_in_range {
    public static void main(String args[] ) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the multiples of the three given number in the given ranges");
        System.out.println("=====================================================");

        System.out.println("Enter the starting range:");
        int start_range=sc.nextInt();
        System.out.println("Enter the ending range:");
        int end_range=sc.nextInt();

        System.out.println("Enter the first number:");
        int first=sc.nextInt();
        System.out.println("Enter the second number:");
        int second=sc.nextInt();
        System.out.println("Enter the third number:");
        int third=sc.nextInt();

        System.out.print("The resultant will be == ");
        for(int i=start_range;i<=end_range;i++) {
            if(i%first==0 || i%second==0 || i%third==0) {
                System.out.print(i+" ");
            }
        }
    }
}