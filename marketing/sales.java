package marketing;
import general.employee;
public class sales extends employee {
    public void tallowance(){
        double t = 0.05 * super.earnings;
        System.out.println("TA: " + t);
    }
}

