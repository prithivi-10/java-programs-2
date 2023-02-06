import java.util.*;
public class numberWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print thr number in words:");
        System.out.println("==========================================\n");

        System.out.println("Enter the number:");

        int num=sc.nextInt();

        String str=Integer.toString(num);

        char arr[]=str.toCharArray();

        System.out.println("The number in words is=");
        for(int i=0;i<arr.length;i++) {
            switch(arr[i]) {
                case '1': System.out.print("one "); break;
                case '2': System.out.print("two "); break;
                case '3': System.out.print("three "); break;
                case '4': System.out.print("four "); break;
                case '5': System.out.print("five "); break;
                case '6': System.out.print("six "); break;
                case '7': System.out.print("seven "); break;
                case '8': System.out.print("eight "); break;
                case '9': System.out.print("nine "); break;
                case '0': System.out.print("zero "); break;
                
            }
        }

    }
}