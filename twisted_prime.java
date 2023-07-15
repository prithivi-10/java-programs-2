import java.lang.*;
import java.util.*;

public class twisted_prime {

	// method for checking prime or not::
	public static boolean prime(int num) {

		for(int i=2;i<=num/2;i++) {
			if(num%i==0) 
				return false;
		}
		return true;
	}

	// method for reversing the number and sending again to prime();
	public static boolean reverseNumber(int num) {
		
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}
		boolean temp=prime(rev);
		if(temp) 
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to check twisted prime number or not::");
		System.out.println("--------------------------------------------------\n");

		System.out.println("Enter the number:");
		int number=sc.nextInt();

		boolean temp1=prime(number);
		boolean temp2=reverseNumber(number);


		String str=temp1&&temp2?"YES" : "NO";

		System.out.println("The result will be ::\n"+str);

	

	}
}
