import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class print_reverse_alphabet_position {

	public static ArrayList<Integer> method(ArrayList<Character> ll) {

		ArrayList<Integer> ans=new ArrayList<>();

		for(int i=0;i<ll.size();i++) {
			int number=(int)(ll.get(i));
			ans.add(number-96);
		}

		return ans;
	}



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Java program to print the alphabets positions in revese order");
		System.out.println("=================================================================\n");

		System.out.println("Enter the number of integers:");
		int num=sc.nextInt();

		ArrayList<Character> al=new ArrayList<>();


		System.out.println("Enter the "+num+" integers:");
		for(int i=0;i<num;i++) {
			char ch=sc.next().charAt(0);
			al.add(Character.toLowerCase(ch));
		}

		System.out.println("The entered elements are:");
		System.out.println(al);

		ArrayList <Integer> answer = method(al);

		System.out.println("The result is ::");
		Collections.reverse(answer);
		System.out.println(answer);


	}
}