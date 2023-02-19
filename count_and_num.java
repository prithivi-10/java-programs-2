import java.util.*;
public class count_and_num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print yes if the element occurence is equal to value of num");
		System.out.println("===========================================================================\n");

		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter the "+size+" elements in the array:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the value of num:");
		int num=sc.nextInt();
		int count=0;

		System.out.println("The entered elements in the array are:");
		System.out.println(Arrays.toString(arr));


		int i=0;
		while(i<arr.length) {
			if(arr[i]==num) {
				count++;
			}
			i++;
			
		}

		System.out.println("The final result will be:");
		if(num==count) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}



	}
}