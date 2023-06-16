import java.util.*;

public class add_sub_basedOddEven {
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          
          System.out.println("Enter the number of integers :");
          int num=sc.nextInt();

          int arr[]=new int[num];

          System.out.println("Enter the "+num+" elements :");
          for(int i=0;i<arr.length;i++) {
               arr[i]=sc.nextInt();
          }

          System.out.println("The entered elements are = "+Arrays.toString(arr));

          System.out.println("Enter the number for 'add' and 'sub' ");
          int temp=sc.nextInt();

          System.out.print("The resultant elements are ");
          for(int i=0;i<arr.length;i++) {
               if(arr[i]%2==0) {
                    System.out.print(arr[i]+temp+" ");
               }
               else {
                    System.out.print(arr[i]-temp+" ");
               }
          }
     }
}