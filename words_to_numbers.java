import java.lang.*;
import java.util.*;


public class words_to_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print words to the numbers:");
        System.out.println("=====================================================\n");

        System.out.println("Enter the words:");
        String str=sc.nextLine();

        String strarr[]=str.split(" ");

        System.out.println("The output will be==");
        for(int i=0;i<strarr.length;i++) {
            switch(strarr[i]) {
                case "one": System.out.print("1 ");
                break;
                case "zero": System.out.print("0 ");
                break;
                case "two": System.out.print("2 ");
                break;
                case "three": System.out.print("3 ");
                break;
                case "four": System.out.print("4 ");
                break;
                case "five": System.out.print("5 "); 
                break;
                case "six": System.out.print("6 "); 
                break;
                case "seven": System.out.print("7 ");
                break;
                case "eight": System.out.print("8 ");
                break;
                case "nine": System.out.print("9 ");
                break;

                default: System.out.print("Nothing@10");
                break;

            }

        }







    }
}