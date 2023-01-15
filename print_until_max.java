import java.util.*;
public class print_until_max {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Java program for print the element util the max element:");
		System.out.println("-------------------------------------------------------\n");

		System.out.println("Enter the size of array:");
		int k=sc.nextInt();
		int arr[]=new int[k];

		System.out.println("Enter the "+k+" elements in the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}

		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("The max element in the array is:");
		System.out.println(max);

		//boolean op=true;

		System.out.println("The resultant array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			if(arr[i]==max) {
				System.exit(0);
			}
		}
	}
}