import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class swap_multiples_of_x_and_y {

	public static int[] function(int arr[],int f,int l) {
		int temp=0;

		outer:
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%f==0) {
				temp=arr[i];
				inner:
				for(int j=arr.length-1;j>=0;j--) {
					if(arr[j]%l==0) {
						arr[i]=arr[j];
						arr[j]=temp;
						break outer;
					}
				}
			}
		}



		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print swap the first and last multiples in the given array");
		System.out.println("---------------------------------------------------------------/n");
		
		System.out.println("Enter the number of elements in the array:");
		int num=sc.nextInt();
		int arr[]=new int[num];

		System.out.println("Enter the "+num+" elements for the array:");
		outer:
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the first mutiple number:");
		int first=sc.nextInt();
		System.out.println("Enter the second multiple number:");
		int second=sc.nextInt();

		int result[]=function(arr,first,second);

		System.out.print("The resultant array will be:: = ");
		//System.out.println(Arrays.toString(result));
		for(int c:result) {
			System.out.print(c+" ");
		}
	}
}

