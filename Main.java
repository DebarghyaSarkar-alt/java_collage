import java.util.Scanner;

// Class 1: Handles array input and max finding
class ArrayOperations {
    private int[] arr;       // array
    private int size;        // size of array

    // Method to take input
    public void inputArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        size = sc.nextInt();

        arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Method to find maximum value
    public int findMax() {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}


// Class 2: Main class
public class Main {
    public static void main(String[] args) {

        ArrayOperations obj = new ArrayOperations();   // create object

        obj.inputArray();                               // take input
        int maxValue = obj.findMax();                   // find max

        System.out.println("Maximum value = " + maxValue);
    }
}
