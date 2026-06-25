interface Animal {
    void sound();  
    default void eat() {   
        System.out.println("Animal is eating");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class sessionl1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();   
    }
}