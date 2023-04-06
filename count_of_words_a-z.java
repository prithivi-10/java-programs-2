import java.util.*;

public class count_of_words_a-z {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java proogram to print the count of words contains only 'a-z' :");
		System.out.println("-------------------------------------------------------------------");

		System.out.println("Enter the String :");
		String str=sc.nextLine();
		boolean flag=true;
		int count=0;

		System.out.println("\n"+"The entered String is = "+str+"\n");

		StringTokenizer st=new StringTokenizer(str);

		while(st.hasMoreTokens()) {
			String op=st.nextToken();
			for(int j=0;j<op.length();j++) {
				char ch=op.charAt(j);
				if(ch>='a' && ch<='z')
					flag=true;
				else
					flag=false;
					break;
			}

			if(flag) 
				count++;
			
		}

		System.out.println("the count of words contains only a-z are = "+count);
		

	}
}