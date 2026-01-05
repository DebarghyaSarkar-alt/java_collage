
import java.util.Scanner;


class Print {
    void display() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name");
        String name = sc.nextLine();

        System.out.println("Section");
        String section = sc.nextLine();

        System.out.println("Roll no");
        int roll = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Section: " + section);
        System.out.println("Roll No: " + roll);
    }
}


public class q1 {
    public static void main(String[] args) {
        Print p = new Print();
        p.display();

    }
}
