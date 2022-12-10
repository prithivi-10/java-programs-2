import java.util.*;

public class uniqueElementsArray {

    static int removeDuplicates(int array[]) {
        int len=array.length;

        int temp=1;

        for(int i=1;i<len;i++) {
            if(array[i-1]!=array[i]) {
                array[temp]=array[i];
                temp++;
            }
        }
        return temp;

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print only the unique elements in same array:");
        System.out.println("=============================================================\n");

        System.out.println("Enter the length of the array:");
        int length=sc.nextInt();
        int arr[]=new int[length];

        //elements:

        System.out.printf("Enter the %d elements in array:\n",length);
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }

        //for sorting the array:
        Arrays.sort(arr);

        //calling the methods:
        int index=removeDuplicates(arr);

        System.out.println("The unique elements in the array are=");
        for(int i=0;i<index;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}