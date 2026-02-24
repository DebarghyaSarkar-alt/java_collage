
import java.util.Scanner;


class p {
    static int count = 0;
    //constructor
    p() {
        count++;
    }

    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
    
}
public class lab2q2 {
    public static void main(String[] args) {
        
        p o= new p();
        p o1= new p();
        p.displayCount();

    }
}
