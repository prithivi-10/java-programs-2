import java.util.*;
public class different_alpha_star_pattern {
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Java program to print a different ALPHA_STAR pattern");
          System.out.println("---------------------------------------------------\n");

          System.out.println("Enter the number of lines in the pattern:");
          int k=sc.nextInt();
        
         System.out.println("The pattern looks like as:");
          for(int i=1;i<=k;i++) {
               int s=65;
               int ss=64;
               ss=ss+i-1;
               for(int j=k-1;j>=i;j--) {
                    System.out.print("*");
               }
               for(int j=1;j<=i;j++) {
                    System.out.print((char)(s++)); 
               }
               for(int j=1;j<=i;j++) {
                    if(ss>=65)
                         System.out.print((char)(ss--));
               }
               
               System.out.println();
          }
     }
}