import java.lang.*;
import java.util.*;

public class perfectSquare {

	public static String methodChecking(String a,String b) {

		int num1=Integer.parseInt(a);
		int num2=Integer.parseInt(b);

		if(perfectSquare(num1) && perfectSquare(num2)) {
			return "Yes";
		}
		else {
			return "NO";
		}

	}

	public static boolean perfectSquare(int m) {

		if((int)Math.sqrt(m)*(int)Math.sqrt(m)==m) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to chack first and second half is perfect sqrt or not");
		System.out.println("==================================\n");

		System.out.println("Enter the number");
		int n=sc.nextInt();
		String str=Integer.toString(n);

		String firstHalf=str.substring(0,str.length()/2);
		String secondHalf=str.substring(str.length()/2, str.length());

		System.out.println("The result will be = "+methodChecking(firstHalf, secondHalf));

	}
}