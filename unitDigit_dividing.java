
import java.util.*;


public class unitDigit_dividing {

     public static ArrayList<Double> method(ArrayList<Integer> ll) {

          ArrayList<Double> ans=new ArrayList<>();

          for(int i=0;i<ll.size();i++) {
               if(ll.get(i)%10==0) {
                    ans.add((double)(ll.get(i)));
               }
               else {
                    double num=ll.get(i)%10;
                    ans.add(ll.get(i)/num);
               }
          }
          return ans;

     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Java program to print unitDigit divide in 2 decimals");
          System.out.println("------------------------------------------------------\n");

          System.out.println("Enter the number of integer:");
          int n=sc.nextInt();
          ArrayList <Integer> al=new ArrayList<>();

          System.out.println("Enter the "+n +" integers:");
          for(int i=0;i<n;i++) {
               int num=sc.nextInt();
               al.add(num);
          }

          System.out.println("The entered elemetns are:");
          System.out.println(al);

          System.out.println("The result is ::");

         
          ArrayList <Double> answer=method(al);

          System.out.println(answer);




     }
}