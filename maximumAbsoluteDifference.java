import java.lang.*;
import java.util.*;

public class maximumAbsoluteDifference {

    public static int method(ArrayList<Integer> al,int n) {

        ArrayList<Integer> max=new ArrayList<>();

        for(int i=0;i<n-1;i++) {
            max.add(Math.abs(al.get(i)-al.get(i+1)));
            
        }

        Collections.sort(max);

        return max.get(max.size()-1);

    }
    public static void main(String a[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Java program to print the maximum absolute difference");
        System.out.println("======================================\n");

        System.out.println("Enter the number:");
        int n=sc.nextInt();
        ArrayList <Integer> al=new ArrayList<>();

        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) {
            al.add(sc.nextInt());
        }

        System.out.println("The Entered elements are = "+al);
        int result=method(al,n);

        System.out.println("The maximum absolute difference wil be = "+result);
    }

}