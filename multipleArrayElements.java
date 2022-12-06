import java.util.*;
public class multipleArrayElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print sum of elements in the array:");
        System.out.println("---------------------------------------------------\n");

        System.out.println("Enter the size of the array:");;
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the "+size+" elements in arrays:");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("The elements present in the arrays is:");
        System.out.println(Arrays.toString(arr));

        //here comes the condition:

        System.out.println("The multiplication of elements are as::");
        for(int i=0;i<arr.length;i++) {
            int viper=arr[i];
            int multiple=1;

            while(viper!=0) {
                int reminder=viper%10;
                multiple*=reminder;
                viper/=10;
            }
            System.out.print(multiple+" ");
        }

        




    }
}