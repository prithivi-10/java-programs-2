import java.util.*;
public class differnetNumberSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java progrsm to print the different series of numbers:");
        System.out.println("------------------------------------------------------\n");

        System.out.println("Enter the number of terms:");
        int term=sc.nextInt();


        System.out.println("The different series pattern looks like as:");
        int professional=0;
        for(int i=1;i<=term;i++) {
            int sum=0;
            for(int viper=1;viper<=i;viper++) {
                sum+=++professional;
            }
            System.out.print(sum+" ");
        }


    }
    
}