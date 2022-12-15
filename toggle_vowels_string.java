import java.util.*;
public class toggle_vowels_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to TOGGLE ALL VOWELS in the String::");
        System.out.println("-------------------------------------------------\n");

        System.out.println("Enter the String:");
        String str=sc.nextLine();


        System.out.println("\nThe result String looks like as:");
        for(int i=0;i<str.length();i++) {

            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }

            else if (str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
                System.out.print(Character.toLowerCase(str.charAt(i)));
            }

            else {
                System.out.print(str.charAt(i));
            }
        }
    }
}