import java.util.*;

public class charactersTillVowel {
	static String meth1(char ch) {

		String str="";
		while(ch<='z') {
			ch++;
			str=str+ch;	
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				break;
			}
			
		}
		return str;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Java program to print the letters till the next 'VOWELS' ");
		System.out.println("===========================================================\n");

		System.out.println("Enter the starting character:");
		char ch=sc.next().charAt(0);

		System.out.println("The result will be::");
		System.out.println(ch+meth1(ch));


	}
}
