
class Calculator {

   
    void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }
}


class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }

   
    static void show() {
        System.out.println("Animal static method");
    }
}

class Dog extends Animal {

   
    void sound() {
        System.out.println("Dog barks");
    }

  
    static void show() {
        System.out.println("Dog static method");
    }
}

public class sessionl2 {
    public static void main(String[] args) {

        
        Calculator c = new Calculator();
        c.add(10, 20);
        c.add(10, 20, 30);

       
        Animal a = new Dog();
        a.sound();   // runtime polymorphism

        Animal a2 = new Dog();
        a2.show();   
       
    }
}