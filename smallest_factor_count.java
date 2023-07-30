import java.lang.*;
import java.util.*;

public class smallest_factor_count {

    public static int method(int arr[], ArrayList<Integer> al) {

        for(int i=0;i<arr.length;i++) {
            int count=0;
            for(int j=1;j<=arr[i];j++) {
                if(arr[i]%j==0) {
                    count++;
                }
            }
            al.add(count);
        }

        Collections.sort(al);
        int result=al.get(0);

        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Jav aprogram to print the smallest factor count:");   
        System.out.println("===================================================\n");


        System.out.println("Enter the number:");
        int num=sc.nextInt();

        int arr[]=new int[num];
        ArrayList <Integer> al=new ArrayList<>();

        System.out.println("Enter the "+num+" integers in the array:");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }

        int answer=method(arr, al);

        System.out.println("The resulant will be::");
        System.out.println(answer);
    }
}
