import java.util.Scanner;
interface Sal {
    void earnings();
    void deductions();
    void bonus();
}

abstract class Manager implements Sal {
    int basic;
    double earning;
    double deduction;

    Manager(int b) {
        basic = b;
        earning = basic + (0.8 * basic) + (0.15 * basic); // HRA + DA
        deduction = 0.12 * earning; // 12% deduction
    }

    public void earnings() {
        System.out.println("Earnings: " + earning);
    }

    public void deductions() {
        System.out.println("Deductions: " + deduction);
    }
}

// Concrete class (NOT abstract)
class Substaff extends Manager {
    double bonus;
    
    Substaff(int b) {
        super(b);
        bonus = 0.5 * basic;
    }


    public void bonus() {
        System.out.println("Bonus: " + bonus);
    }
}

public class lab4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bsic = sc.nextInt();
        Substaff ss = new Substaff(bsic);

        ss.earnings();
        ss.deductions();
        ss.bonus();
        sc.close(); 
    }
}
