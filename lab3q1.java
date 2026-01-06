import java.util.Scanner;

class TwoD {
    int length, breadth;

    void get2D(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

class ThreeD extends TwoD {
    int height;

    void get3D(int l, int b, int h) {
        super.get2D(l, b);
        height = h;
    }

    int volume() {
        return super.area() * height;
    }
}

public class lab3q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("3D/2D Object");
        int choice = sc.nextInt();
        if (choice == 3) {
            System.out.println("Enter length: ");
            int length = sc.nextInt();

            System.out.println("Enter breadth: ");
            int breadth = sc.nextInt();

            System.out.println("Enter height: ");
            int height = sc.nextInt();

            ThreeD obj = new ThreeD();
            obj.get3D(length, breadth, height);
            System.out.println("price: " + obj.volume()*60);
        }
        else{
            System.out.println("Enter length: ");
            int length = sc.nextInt();

            System.out.println("Enter breadth: ");
            int breadth = sc.nextInt();

            TwoD obj = new TwoD();
            obj.get2D(length, breadth);
            System.out.println("Price: " + obj.area()*40);
        }

        
        

        sc.close();
    }

}
