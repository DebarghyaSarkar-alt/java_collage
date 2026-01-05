
import java.util.Scanner;


class Print {
    void display() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st String");
        String firststr = sc.nextLine();
        System.out.println("Enter 2nd String");
        String secondstr = sc.nextLine();
        System.out.println(secondstr + " " + firststr);
        
        sc.close();
        
    }
}

public class q5 {
    public static void main(String[] args) {
        Print p = new Print();
        p.display();

    }
}


