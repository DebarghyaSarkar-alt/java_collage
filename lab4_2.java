import java.util.Scanner;
interface motor{
    int capacity = 100;
    void run();
    void consume();
}
class washingmachine implements motor{
    public void run() {
        System.out.println("Washing machine is running...");
    }

    public void consume() {
        System.out.println("Motor is consuming electricity...");
    }

}
    

public class lab4_2 {
    public static void main(String[] args) {
        
        washingmachine wm = new washingmachine();

        wm.run();
        wm.consume();

        System.out.println("Capacity of the motor is " + wm.capacity);
    }
}
