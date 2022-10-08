import java.util.*;

public class username_and_domain {
    public static void main(String args[]) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Program to find the username and domain in gmail :");
        System.out.println("---------------------------------------------------");

        System.out.println("Enter the string:");
        String str=sc.nextLine();

        int username_index=str.indexOf("@");

        String Username=str.substring(0,username_index);

        System.out.println("The USERNAME of gmail is "+Username);

        int domain_index=str.lastIndexOf(".");
        String domain=str.substring(domain_index+1,str.length());

        switch(domain) {
            case "com":  System.out.println("The DOMAIN of gmail is COMMERCIAL");
            break;

            case "net":  System.out.println("The DOMAIN of gmail is NETWORK");
            break;

            case "gov":  System.out.println("The DOMAIN of gmail is GOVERNMENT");
            break;

            case "in":  System.out.println("The DOMAIN of gmail is INDIA");
            break;

            default:
            System.out.println("INVALID DOMAIN");
        }
  
    }

}