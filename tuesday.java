class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

// Class with method that throws exception
class Test {
    void checkNumber(int num) throws MyException {
        if (num < 0) {
            throw new MyException("Number cannot be negative");
        } else {
            System.out.println("Valid number: " + num);
        }
    }
}

public class tuesday {
    public static void main(String[] args) {
        Test t = new Test();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {
            t.checkNumber(n);
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}
