
import java.util.Scanner;


class topper{
    Scanner sc = new Scanner(System.in);
    void displayTopper(){
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine(); 

        String topName = "";
        String toproll="";
        int topMarks = 10;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = sc.nextLine();
            System.out.println("Enter roll of student " + (i + 1) + ":");
            String roll = sc.nextLine();
            System.out.println("Enter marks of student " + (i + 1) + ":");
            int marks = sc.nextInt();
            sc.nextLine(); 

            if (marks < topMarks) {
                topMarks = marks;
                topName = name;
                toproll=roll;
            }
        }

        System.out.println("Topper: " + topName + " with marks: " + topMarks +" Roll No: "+ toproll);
    }
}
public class lab2q5 {
    public static void main(String[] args) {
        topper t = new topper();
        t.displayTopper();
       
        

    }
}
