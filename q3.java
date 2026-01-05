
import java.util.Scanner;


class Print {
    void display() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Day");
        int day = sc.nextInt()%7;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");
        }
        sc.close();
        
    }
}





public class q3 {
    public static void main(String[] args) {
        Print p = new Print();
        p.display();

    }
}
