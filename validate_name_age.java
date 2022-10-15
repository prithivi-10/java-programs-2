import java.lang.*;
import java.util.*;

public class validate_name_age {

    static boolean Validate(String name) {
        if(name.matches("[a-zA-Z\\s]+"))
            return true;
        else 
            return false;
    }

    static boolean Validate(int age) {
        if(age>=3 && age <=17) 
            return true;
        else 
            return false;
    }
    public static void main(String ...args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Program to Validate the name and the age:");
        System.out.println("=========================================");
        System.out.println("");

        System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Enter the age:");
        int age=sc.nextInt();

        System.out.println(Validate(name));
        System.out.println(Validate(age));

    }
}