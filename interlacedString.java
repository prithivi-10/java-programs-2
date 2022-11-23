import java.util.*;

public class interlacedString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("Java program to print the interlace of a ONE STRING:");
		System.out.println("-----------------------------------------------------\n");

		System.out.println("Enter the string to make INTERLACE of a string:");
		String str=sc.nextLine();

		int len=str.length();

		//first half of a string:
		String first=str.substring(0,len/2);
		//second half of a string:
		String second=str.substring(len/2);

		//char array creation for first,second,and the result::
		char firstarr[] = first.toCharArray();
		char secondarr[] = second.toCharArray();
		char result[] = new char[len];

		System.out.println("First half of a string="+Arrays.toString(firstarr));
		System.out.println("Second half of a string="+Arrays.toString(secondarr));

		//for loop for interlance::

		int k1=0;
		int k2=0;
		for(int i=0;i<result.length;i++) {
			if(i%2==0) {
				result[i]=secondarr[k1];
				k1++;
			}
			else {
				result[i]=firstarr[k2];
				k2++;
			}
		}

		System.out.println("\nThe string after the interlaced::::::::");

		System.out.println("In arrays= "+Arrays.toString(result));

		System.out.print("In full string= "); 
		for(char k:result) {
			System.out.print(k);
		}

		
		
		}
}