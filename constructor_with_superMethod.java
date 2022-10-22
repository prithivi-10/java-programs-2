
class A {
    public A() {
        System.out.println("Inside the A() Constructor:");
    }

    public A(int k) {
        System.out.println("Inside the A(int k) Constructor:");
    }

}

class B extends A {
    public B() {
        super(7);   //if u didn't specify the super() it will always be there   eg: super() {defaylt constructor}
                      // it always call the default cunstructor:
        System.out.println("Inside the B() Construcctor:");
    }

}

public class constructor_with_superMethod {
    public static void main(String[] args) {

        System.out.println("Java program to know about the construct working in super():");
        System.out.println("============================================================");
        System.out.println("");
        
        B obj = new B();

    }
}