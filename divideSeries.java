import java.util.*;
public class divideSeries {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("Java program to print the different series:");
		System.out.println("===========================================\n");

		System.out.println("Enter the number of terms in series:");
		int num=sc.nextInt();

		int k=4;

		System.out.println("The series looks likes as=");

		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				if(i%4==0) {
					System.out.print(i/k+" ");
				}
				else {
					System.out.print(i/2+"/"+k/2+" ");
				}
			}
			else {
				System.out.print(i+"/"+k+" ");
			}
		}
	}
}