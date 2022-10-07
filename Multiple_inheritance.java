import java.util.*;


class Prithivi{
    public int method1(int a,int b){
        System.out.println("the value of a+b is:"+(a+b));
        return 0;
    }
}

class Raj extends Prithivi{
    public int method2(int a,int b){
        System.out.println("the value of a*b is:"+a*b);
        return 0;
    }
}

class Professional extends Raj {
    public void method3(int a,int b){
        System.out.println("the valus of a/b is:"+a/b);
       
    }
}





public class Multiple_inheritance {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter a:");
        int a=sc.nextInt();

        System.out.println("enter b:");
        int b= sc.nextInt();

        Professional obj = new Professional();
        obj.method1(a,b);
        obj.method2(a,b);
        obj.method3(a,b);


  

    }
}