import java.util.*;

public class add_and_sub_with_given_input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print sum based on the given input:");
		System.out.println("--------------------------------------------------\n");

		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		
		String arr[]=new String[size];

		System.out.println("Enter the "+size+" elements for the array:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next();
		}

		System.out.println("The entered elements in the array are:");
		System.out.println(Arrays.toString(arr));

		int sum=1000;

		int i=0;
		while(i<arr.length) {

			if(arr[i].charAt(0)=='+') {
				sum+=Integer.parseInt(arr[i].substring(1));
			}
			else {
				sum-=Integer.parseInt(arr[i].substring(1));
			}
			i++;
		}

		System.out.println("the final result 'sum' is:");
		System.out.println(sum);

	
		
	}
}