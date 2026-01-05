
import java.util.Scanner;


class Print {
    void grading() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("grade O");
        }
        else if(marks>=80){
            System.out.println("Grade E");
        }
        else if(marks>=70){
            System.out.println("Grade A");
        }
        else if(marks>=60){
            System.out.println("Grade B");
        }
        else if (marks>=50){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade Failed");
        }
        sc.close();

    }
}






public class q2 {
    public static void main(String[] args) {
        Print p = new Print();
        p.grading();

    }
    
}
