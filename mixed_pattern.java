import java.util.*;
public class mixed_pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program for the mixed pattern:");
		System.out.println("--------------------------------------\n");

		System.out.println("Enter the number:");
		int number=sc.nextInt();
		int kk=number-1;

		for(int i=1;i<=kk;i++) {
			for(int j=kk;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("(");

			}
			for(int k=1;k<=i;k++) {
				System.out.print(")");
			}
			for(int k=kk;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}


		for(int i=1;i<=number;i++) {
			System.out.print("(");
		}
		for(int i=1;i<=number;i++) {
			System.out.print(")");
		}

		System.out.println();


		for(int i=1;i<=kk;i++) {
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int j=kk;j>=i;j--) {
				System.out.print("(");
			}
			for(int j=kk;j>=i;j--) {
				System.out.print(")");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		

	}
}