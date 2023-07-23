import java.lang.*;
import java.util.*;

import javax.swing.text.Style;

public class multiples_number {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Java program to print the multiples of the given number::");
		System.out.println("---------------------------------------------------/n");

		System.out.println("Enter the number of multiples");
		int num=sc.nextInt();
		System.out.println("Enter the number of times to print:");
		int end=sc.nextInt();

		System.out.println("The resulant will be as::");
		for(int i=end;i>=1;i--) {
			System.out.println(end+" * "+num+" = "+end*num);
			end--;
		}
	}
}