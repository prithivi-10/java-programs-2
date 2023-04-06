import java.util.*;

public class reverse_given_num_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int num=sc.nextInt();
		sc.nextLine();
		String op=sc.nextLine();
		String arr[]=op.split(" ");

		ArrayList <String> al=new ArrayList<>();

		for(int i=0;i<num;i++) {
			al.add(arr[i]);
		}

		System.out.println("After reversing the given num of string and printing the balance is ");

		for(int i=num-1;i>=0;i--) {
			System.out.print(al.get(i)+" ");
		}

		for(int i=num;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		
	}
}