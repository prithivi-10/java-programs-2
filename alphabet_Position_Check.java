import java.util.*;

import javax.sound.midi.Synthesizer;
public class alphabet_Position_Check {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);

		System.out.println("\nJava program to print YES or NO based on presence of ALPHABETs::");
		System.out.println("================================================================\n");

		System.out.println("Enter the String:");
		String str=sc.nextLine();

		System.out.println("Enter the alphabet position to check:");
		int x=sc.nextInt();

		//converting thbe num to make 1 for letter 'a':
		int position=x+96;

		System.out.println("The entered alphabetic CHARACTER is:");
		System.out.println((char)position);


		System.out.println("\nTHE FINAL RRESULT IS");
		System.out.println("----------------------");
		for(int i=0;i<str.length();i++) {
			int strnum=str.charAt(i);
			if(strnum==position) {
				System.out.println("'YES' it is present in the given string");
				System.exit(0);
			}
		}

		System.out.println("'NO' it is not present in the given string");

	}
}