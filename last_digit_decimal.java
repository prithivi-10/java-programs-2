import java.lang.*;
import java.util.*;

public class last_digit_decimal {

    public static int method(int num,int last) {

        String binary_num=Integer.toBinaryString(num);

        String last_binary_values=binary_num.substring(binary_num.length()-last,binary_num.length());

        int result=Integer.parseInt(last_binary_values,2);

        return result;

    }
    public static void main(String a[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print Last digit descimal value:");
        System.out.println("---------------------------------------------------\n");

        System.out.println("Enter the number:");
        int number=sc.nextInt();
        System.out.println("Enter the last digits number:");
        int last_num=sc.nextInt();

        int answer=method(number,last_num);

        System.out.println("The resulant will be:: "+answer);


    }
    
}
