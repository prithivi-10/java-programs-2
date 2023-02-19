import java.util.*;

interface prithivi {
	int add(int m,int n);
}

interface viper {
	String name(String name);
}
public class lambda_expressions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to learn about the LAMBDA EXPRESSIONS ");
		System.out.println("------------------------------------------------------\n");

		System.out.print("Enter the first number:");
		int num1=sc.nextInt();

		System.out.print("Enter the second number:");
		int num2=sc.nextInt();
		System.out.println();

		System.out.print("Enter the name to get printed:");
		String str=sc.next();

		System.out.println();

		//lambda expression for addition::
		prithivi op=(i,j)->i+j;

		//lambda expression for display the String::
		viper raj=(name)-> "The entered String is "+str;


		System.out.println("The  Addition Output will be:");
		System.out.println(op.add(num1,num2)+"\n");

		

		System.out.println("the String Output will be:");
		System.out.println(raj.name(str)+"\n");
	}
}