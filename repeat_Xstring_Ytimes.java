import java.util.*;
    
public class repeat_Xstring_Ytimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to repeat the x string in y times :");
		System.out.println("-----------------------------------------------------\n");

        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println("Enter the x value : ");
        int x=sc.nextInt();
        System.out.println("Enter the y value : ");
        int y=sc.nextInt();

        String newStr=str.substring(0,x);

        System.out.println("The result of the program is = ");
        System.out.println(newStr.repeat(y));
    }
}
