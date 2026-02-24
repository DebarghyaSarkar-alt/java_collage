public class lab6_1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter size of the array:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements of the array:");
        int ch = 1;
        int i = 0;
        
        try {
           while (ch==1) {
            
            arr[i] = sc.nextInt();
            i++;
            System.out.println("Do you want to continue? (1 for yes, 0 for no)");
            ch = sc.nextInt();
            
        }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Array input complete.");
            sc.close();
        }

    }
}
