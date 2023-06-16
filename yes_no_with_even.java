import java.util.*;

public class yes_no_with_even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Java program to print Yes if all the numbers are even");
		System.out.println("-------------------------------------------------------\n");

		System.out.println("Enter the number:");
		int num=sc.nextInt();

		boolean temp=true;

		while(num!=0) {
			int newnum=num%10;
			if(newnum%2!=0) {
				temp=false;
				break; 
			}
			num/=10;
		}

		System.out.println("The result will be:");
		if(temp) 
			System.out.println("S");
		else 
			System.out.println("NO");
	}
}