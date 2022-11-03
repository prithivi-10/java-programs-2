import java.lang.*;
import java.util.*;

class A{

    public void show() {
        System.out.println("A show():");
    }

}

class B extends A {
    
    public void show() {
        System.out.println("B show():");
    }

    public void display() {
        System.out.println("B display():");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        

        A obj = new B();
        obj.show();

       // obj.display();               //  error in the dynamic method dispatch
                                       
                    // beacuse in the dynamic method dispatch methods must be rewritten (methodOverridding)



    }
}