package general;
import java.util.Scanner;

public class employee {
    protected int empid;
    protected double earnings;   // <-- make it a field
    private String ename;

    public void earning(){
        System.out.println("Enter employee details");
        Scanner sc = new Scanner(System.in);
        empid = sc.nextInt();
        ename = sc.next();

        System.out.println("Enter basic salary");
        double basic = sc.nextDouble();

        earnings = basic + (0.8*basic) + (0.15*basic); // HRA + DA
        System.out.println("Earnings: " + earnings);
    }
}
