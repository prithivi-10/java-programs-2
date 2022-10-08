import java.util.*;

public class date_or_not {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Program to check whether it is date or not:");
        System.out.println("-----------------------------------------");

        System.out.println("Enter the date to check:");
        String date=sc.nextLine();

        if(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}")) {
            System.out.println("yes it is valid date");
        }
        else {
            System.out.println("no it is not a date");
        }
    }


}