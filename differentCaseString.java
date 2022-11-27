import java.util.*;
public class differentCaseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the different case in UPPER and LOWER:");
        System.out.println("=============================================================\n");

        System.out.println("Enter the string to print in different:");
        String str=sc.nextLine();

        String arr[]=str.split(" ");

        for(int i=0;i<arr.length;i++) {
            if(arr[i].matches("[a-z]+")) {
                arr[i]=arr[i].toUpperCase();
            }
            else if(arr[i].matches("[A-Z]+")) {
                arr[i]=arr[i].toLowerCase();
            }
        }

        System.out.println("\nThe final resultant STRING is=");

       // System.out.println(Arrays.toString(arr));

       for(String viper:arr) {
        System.out.print(viper+" ");
       }


    }
        
    
        

    
}