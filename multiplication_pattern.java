import java.util.*;

public class multiplication_pattern {
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Java program to print multiplication pattern:");
          System.out.println("-----------------------------------------------\n");

          System.out.println("Enter the number of lines in the pattern:");
          int k=sc.nextInt();
          int temp=1;
          int i=1;
          
          System.out.println("The resultant pattern will be:");
          while(i<=k) {
               int j=1;
               while(j<=i) {    
                    System.out.print(i*j+" ");
                    j++;   
               }
               System.out.println();
               i++;
          }
     }
}