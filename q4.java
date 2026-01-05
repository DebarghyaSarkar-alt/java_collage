
import java.util.Scanner;


class Print {
    void palindrome() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        String num = sc.nextLine();
        int s =0;
        int e = num.length()-1;

        while(s<e){
            if(num.charAt(s)!=num.charAt(e)){ 
                System.out.println("Not a Palindrome");
                return;
            }
            s++;
            e--;

        }
        System.out.println("Palindrome");
        sc.close();
        
    }
}
public class q4 {
    public static void main(String[] args) {
        Print p = new Print();
        p.palindrome();

    }
}
