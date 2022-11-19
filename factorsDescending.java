import java.util.*;

public class factorsDescending {
    public static void main(String args[]) {
        Scanner c=new Scanner(System.in);

        System.out.println("Java program to print the factors in descending order:");
        System.out.println("======================================================");

        System.out.println("\nEnter the Number:");
        int number =c.nextInt();

        System.out.println("the factors in the descending order is=");
        for(int i=number;i>=1;i--) {
            if(number%i==0) {
                System.out.print(i+" ");
            }
        }

    }

}