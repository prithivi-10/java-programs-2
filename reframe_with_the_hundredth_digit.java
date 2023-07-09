import java.lang.*;
import java.util.*;

public class reframe_with_the_hundredth_digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Java program to reframe with the hundredth digit");
		System.out.println("=======================================================\n");

		System.out.println("Enter the number:");
		int number=sc.nextInt();

		System.out.println("Enter the sum of the unit+tenth+hudred digit of the resultant number:");
		int sum=sc.nextInt();

		int unit_tenth=number%10+number%100/10;
		int balance=sum-unit_tenth;

		String strnum=Integer.toString(number);
		StringBuilder sb=new StringBuilder(strnum);
		sb.insert(sb.length()-2,Integer.toString(balance));

		int result=Integer.parseInt(sb.toString());
		System.out.println("The resultant integer will be:::");
		System.out.println(result);
	}
}
