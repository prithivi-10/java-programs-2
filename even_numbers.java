import java.util.*;

public class even_numbers {
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Java program to even integers from start to end with condition:");
		System.out.println("========================================================\n");

		System.out.println("Enter the first int:");
		int x=sc.nextInt();

		System.out.println("Enter the second int:");
		int y=sc.nextInt();

		System.out.println();
		if(x>y) {
			System.out.println("The first int is greater than second int"); 
			System.out.println("So, the even integers from second to first is:");

			for(int i=x;i>=y;i--) {
				if(i%2==0) {
					System.out.print(i+" ");
				}
			} 
		}
		else {
			System.out.println("The first int is smaller than second int"); 
			System.out.println("So, the even integers from first to second is:");

			for(int i=x;i<=y;i++) {
				if(i%2==0) {
					System.out.print(i+" ");
				}
			}
		}

		
		


	}
}
