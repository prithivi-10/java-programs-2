import java.util.*;
public class complexPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("java program to print complex alphabet and star pattern:");
		System.err.println("========================================================\n");

		System.out.println("Enter the number:");
		int num=sc.nextInt();

		char ch=65;
		ch=(char)(65+num-1);
		int viper=num*2-1;


		System.out.println("The complex pattern can be look like as:\n");
		for(int i=0;i<num;i++) {

			for(int j=0;j<i;j++) {
				System.out.print("*"+" ");
			}

			for(int k=viper;k>i;k--) {
				System.out.print(ch+" ");
			}

			System.out.println();
			ch--;
			viper--;

		}

	}
	
}