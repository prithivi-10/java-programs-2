import java.lang.*;
import java.util.*;

public class largest_integer_removing_digits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print the largest number");
		System.out.println("===========================================\n");

		System.out.println("Enter the number:");
		StringBuilder sb=new StringBuilder(sc.nextLine());

		int arr[]=new int[3];
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			StringBuilder sbb=new StringBuilder(sb);
			sbb.deleteCharAt(sbb.length()-i-1);
			al.add(Integer.parseInt(sbb.toString()));
		}

		System.out.println("The Output ==");
		System.out.println(Collections.max(al));


	}
}