import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class getting_input_without_scannerClass {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Java program to learn 'GETTING INPUT WITHOUT SCANNER CLASS' :");
		System.out.println("===============================================================\n");


		//getting_input_without_scannerClass
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(isr);

		System.out.print("Enter the number :");
		int num=Integer.parseInt(bf.readLine()); System.out.println();

		System.out.print("Enter the String :");
		String str=bf.readLine(); System.out.println();

		System.out.print("Enter the float value :");
		float fnum=Float.parseFloat(bf.readLine()); System.out.println();

		System.out.println("The Outputs will be:");

		System.out.println("1) The entered number will be = "+num);
		System.out.println("2) The entered string will be = "+str);
		System.out.println("3) The entered float number will be = "+fnum);

		bf.close();



	}
}
