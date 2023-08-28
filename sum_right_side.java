import java.lang.*;
import java.util.*;

public class sum_right_side {

    public static ArrayList <Integer> function(ArrayList <Integer> al ) {

        int sum=0;
        int temp=0;
        ArrayList <Integer> funresult= new ArrayList<>();

        for(int i=0;i<al.size();i++) {
            temp=al.get(i);
            for(int j=i+1;j<al.size();j++) {
                if(temp>=al.get(j)) {
                    sum+=al.get(j);
                }

            }
            funresult.add(sum);
            sum=0;
            
        }
        return funresult;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the sum which is in the right sied");
        System.out.println("======================================================\n");

        System.out.println("Enter the number of elements in the array:");
        int num=sc.nextInt();
        ArrayList <Integer> al=new ArrayList<>();

        System.out.println("Enter the "+num+" elements:");
        for(int i=0;i<num;i++) {
            al.add(sc.nextInt());
        }

        System.out.print("The entered elements are =");
        System.out.println(al);

        ArrayList <Integer> result = function(al);

        System.out.println("The result will be = ");

        for(Integer x:result)
            System.out.print(x+" ");
    }
}