import java.util.*;

public class valid_or_invalid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to valid or invalid based on  number present :");
		System.out.println("------------------------------------------------------------\n");

		System.out.println("Enter the first number :");
		int n1=sc.nextInt();

		System.out.println("Enter the second number :");
		int n2=sc.nextInt();

		String s1=Integer.toString(n2/10);
		String s2=Integer.toString(n2%10);

		String str=Integer.toString(n1);


		System.out.println("The result of the program is = ");
		if(str.contains(s1)||str.contains(s2)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}

		

	}
}