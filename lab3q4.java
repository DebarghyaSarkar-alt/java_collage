import java.util.Scanner;

class Account {
    int accNo;
    String name;
    double balance;

    void getData(int a, String n, double b) {
        accNo = a;
        name = n;
        balance = b;
    }

    void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    int aadhar;
    void getPersonData(int a, String n, double b, int ad) {
        super.getData(a, n, b);
        aadhar = ad;
    }

    // Method overriding
    void display() {
        super.display();  // call parent display
        System.out.println("Aadhar Number: " + aadhar);
    }
} 
public class lab3q4 {
    public static void main(String[] args) {
        Person p = new Person();
        p.getPersonData(12345, "John Doe", 10000.50, 987654321);
        p.display();
    }
}

