import java.util.*;

public class reverse_Knumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to the Knumbers reverse order :");
		System.out.println("-------------------------------------------------\n");

		System.out.println("Enter the frist number : ");
		int n=sc.nextInt();
		System.out.println("Enter the second number : ");
		int k=sc.nextInt();
		int arr[]=new int[n];

		System.out.println("Enter the "+n+" numbers : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println("The result of the program is = ");
		for(int i=k+k-2;i>=k-1;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}