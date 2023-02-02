import java.util.*;

public class hashset_1 {
    public static void main(String[] args) {

        HashSet<Integer> op = new HashSet<Integer>();
        System.out.println("Java program for simple HashSet problem:");
        System.out.println("---------------------------------------\n");


        op.add(1);
        op.add(5);
        

        System.out.println("Contains or Not:");
        System.out.println("================\n");

        for(int i=1;i<=6;i++) {
            if(op.contains(i)) {
                System.out.println("The number "+i+" is present in the HashSet\n");
            }
            else {
                System.out.println("The number "+i+" is not present in the HashSet\n");
            }
        }





    }
}
