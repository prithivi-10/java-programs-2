import java.lang.*;
import java.util.Scanner;

public class num_pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print the pattern");
		System.out.println("---------------------\n");

		System.out.println("Enter the number:");
		int num=sc.nextInt();

		System.out.println("The resultant pattern will be");

		for(int i=1;i<=num/2;i++) {
			for(int j=1;j<=num+1;j++) {
				if(j<=i)
					System.out.print(i);
				else
					System.out.print(num-i+1);
			}
			System.out.println();
		}
	}
}