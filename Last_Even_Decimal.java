import java.util.*;
public class Last_Even_Decimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print Long to Double in demical values from last first occuring even number:");
		System.out.println("-----------------------------------------------------------------------------------------------\n");

		
		System.out.println("Enter the Long number");
		long k=sc.nextLong();

		String str=Long.toString(k);   //converting long to String
		boolean t=true;

		String news="";

		//condition to put "." for last occuring even number:
		for(int i=str.length()-1;i>=0;i--) {
			if(t) {
				if(str.charAt(i)=='2'||str.charAt(i)=='0'||str.charAt(i)=='4'||str.charAt(i)=='6'||str.charAt(i)=='8') {
					news+='.';
					t=false;
				} 
				else {
					news+=str.charAt(i);
				}
			}
			else {
				news+=str.charAt(i);
			}
		}

		String updated="";

		//condition to make reverse ( back to normal ):
		for(int i=news.length()-1;i>=0;i--) {
			updated+=news.charAt(i);
		}

		System.out.println("\nAfter the dot in the long number be like:");
		System.out.println(updated+"\n");

		System.out.println("The final output will be:");
		 double number=Double.parseDouble(updated);
		 System.out.printf("%.2f",number);
	}
}