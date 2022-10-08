import java.util.Scanner;
public class gmail_or_not{
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("This program is to check wheather the input is gmail or not:");
        System.out.println("-----------------------------------------------------------");

        System.out.println("Enter the String to check:");
        String str= sc.nextLine();

        if(str.matches(".+@gmail.+")) {
            System.out.println("Yes, it is a G-mail");
        }
        else {
            System.out.println("No, it is not a G-mail");
        }
    }


}