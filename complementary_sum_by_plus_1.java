import java.util.*;

public class complementary_sum_by_plus_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print 'sum+1', if the element is greater than the given above value");
		System.out.println("------------------------------------------------------------------------------------");

		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		System.out.println("Enter the above value to get plus by 1:");
		int above=sc.nextInt();

		int sum=0;
		int arr[]=new int[n];

		System.out.println("Enter the "+n+" elements in the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println("The entered elements in the array are:");
		System.out.println(Arrays.toString(arr));

		for(int i=0;i<arr.length;i++) {
			if(arr[i]>above) {
				arr[i]++;
			}
			sum+=arr[i];
		}

		System.out.println("the resultant sum will be:");
		System.out.println(sum);
	}
}