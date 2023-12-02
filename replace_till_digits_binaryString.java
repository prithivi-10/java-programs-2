import java.lang.*;
import java.util.*;

public class replace_till_digits_binaryString {
    public static int function(int N , int K) {
        int count=0;
        int i=0;
        int numberOfZeros=0;

        String str=Integer.toBinaryString(N);

        char ch[]=str.toCharArray();
        for(int ii:ch) {
            if(ii=='0')
                numberOfZeros++;
        }

        if(numberOfZeros < K ) {
            str=str.replace("0", "");
        }
        else {
            while(count!=K) {
                if(str.charAt(i)=='0') {
                    str=str.replaceAll("0", "");
                    count++;
                }
        
                i++;
            }
        }

        return Integer.parseInt(str,2);
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to replace the zeros of binary strig of main and print it");
        System.out.println("---------------------------------------\n");

        System.out.println("Enter the main number");
        int main=sc.nextInt();
        System.out.println("Enter the number of digits");
        int num=sc.nextInt();

        int result=function(main,num);

        System.out.println("The final result will be ::::");
        System.out.println(result);
    }
}