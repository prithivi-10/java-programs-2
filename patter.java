import java.lang.*;
import java.util.*;

public class patter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print the pattern:");
		System.out.println("=====================================\n");

		System.out.println("Enter the number:");
		int number=sc.nextInt();


		System.out.println("The resultant pattern will be::");
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=number;j++) {
				System.out.print(i*j+" ");


			}
			System.out.println();

		}
	}
}