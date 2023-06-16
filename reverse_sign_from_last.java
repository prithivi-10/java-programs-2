import java.util.*;

public class reverse_sign_from_last {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Java program to reverse sign from last:");
		System.out.println("--------------------------------------------\n");


		System.out.println("Enter the number:");
		int num=sc.nextInt();

		System.out.println("Enter the end from last number:");
		int k=sc.nextInt();
		int temp=0;

		//ArrayList <Integer> ar=new ArrayList<>();
		int arr[]=new int[num];

		System.out.println("Enter the "+num+" numbers:");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println("Entered numbers are:");
		System.out.println(Arrays.toString(arr));

		int s=num-1;
		while(temp!=k) {
			if(arr[s]>=0) {
				arr[s]=arr[s]-(2*arr[s]);
			}
			else {
				arr[s]=arr[s]+(2*(-arr[s]));
			}
			s--;
			temp++;
		}

		System.out.println("The resultant arrays is:");
		System.out.println(Arrays.toString(arr));

	}
}