import java.lang.*;
import java.util.*;

public class minimumAndMaximumPossibleSumNumbers {

	public static int minimumPossibleSum(int x,int y) {
		String str1=Integer.toString(x);
		String str2=Integer.toString(y);

		str1=str1.replace("6","5");
		str2=str2.replace("6","5");


		return Integer.parseInt(str1)+Integer.parseInt(str2);
		
	}

	public static int maximumPossibleSum(int x,int y) {
		String str1=Integer.toString(x);
		String str2=Integer.toString(y);

		str1=str1.replace("5","6");
		str2=str2.replace("5","6");


		return Integer.parseInt(str1)+Integer.parseInt(str2);
		
	}

	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Java program to print the minimum and maximum possible sum numbers for the given number:");
		System.out.println("===================================\n");

		System.out.println("Enter the first number:");
		int x=sc.nextInt();
		System.out.println("Enter the second number:");
		int y=sc.nextInt();

		int minimumPossibleSum=minimumPossibleSum(x, y);
		int maximumPossibleSum=maximumPossibleSum(x, y);

		System.out.println("The minimum possible sum is =="+ minimumPossibleSum);
		System.out.println("The maximum possible sum is == "+maximumPossibleSum);

	}
}