public class lab6_2 {
    public static void main(String[] args) {
        System.err.println("enter 1st NUM");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num1 = sc.nextInt();
        System.err.println("enter 2nd NUM");
        int num2 = sc.nextInt();
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Division operation complete.");
            sc.close();
        }
    }
}
