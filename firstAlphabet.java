import java.util.*;
public class firstAlphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the first alphabet letter in string:");
        System.out.println("----------------------------------------------------------\n");

        System.out.println("Enter the String:");
        String str=sc.nextLine();
        int len=str.length();
        
        char ac[] = new char[len];
  
        for(int i=0;i<len;i++) {
            ac[i]=str.charAt(i);
        }
        Arrays.sort(ac);
        
        System.out.println("The first alphabet letter in String:");
        System.out.println(ac[0]);

    }
}