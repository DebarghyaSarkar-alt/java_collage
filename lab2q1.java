
import java.util.Scanner;


class Print {
    void evenodd(){
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
    }
}
public class lab2q1 {
    public static void main(String[] args) {
        Print p = new Print();
        p.evenodd();

    }
}
