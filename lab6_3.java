class NegetiveNumberException extends Exception {
    public NegetiveNumberException(String message) {
        super(message);
    }
}
class A{
    void ProcessInput()throws NegetiveNumberException {
        System.out.println("enter input");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0) {
            throw new NegetiveNumberException("Negative number not allowed");
        } else {
            System.out.println("You entered: " + num*2);
        }
        
    }
}
public class lab6_3 {
    public static void main(String[] args) {
        A a = new A();
        try {
            a.ProcessInput();
        } catch (NegetiveNumberException e) {
            System.out.println(e);
        }

    }
}
