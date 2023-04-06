import java.util.*;

public class main_diagonal_elements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print the only the main diagonals elements in the 2d array :");
		System.out.println("================================================================================\n");
		System.out.println("Enter the size of 2d array");
		int num=sc.nextInt();

		int arr[][]=new int[num][num];

		System.out.println("Enter the "+num+" x "+num+"elements");

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("The entered elements are = ");
		for(int kk[]:arr) {
			for(int k:kk) {
				System.out.print(k+" ");
			}
			System.out.println();
		}

		System.out.println("The main diagonals elements are = ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					System.out.println(arr[i][j]+" ");
				}
			}
		}
	}
}