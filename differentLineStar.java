import java.util.*;
public class differentLineStar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print Star in different pattern:");
		System.out.println("===============================================\n");

		System.out.println("Enter the Number:");
		int number=sc.nextInt();

		String str=Integer.toString(number);

		//decare the array:
		int arr[]=new int[str.length()];

		for(int i=arr.length-1;i>=0;i--) {
			while(number!=0) {
				int rem=number%10;
				arr[i]=rem;
				number/=10;
				break;
			}
		}

		System.out.print("\nDigits after inserting in the array=  ");
		System.out.print(Arrays.toString(arr)+"\n");

		//to print the different star pattern:

		System.out.println("\nThe differnet star looks likes as::::::\n");
		for(int i=0;i<arr.length;i++) {
			int viper=arr[i];
			System.out.print("|");
			for(int j=1;j<=viper;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}