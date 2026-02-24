class A {
    void show() {
        System.out.println("Class A show()");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B show()");
    }
}

class C extends A {
    void show() {
        System.out.println("Class C show()");
    }
}
//this is method overriding example
public class lab3q3 {
    public static void main(String[] args) {
        A ref;

        ref = new A();
        ref.show();

        ref = new B();
        ref.show();

        ref = new C();
        ref.show();
    }
}
 
