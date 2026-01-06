import java.util.Scanner;
class Plate{
    int Length, Breadth;
    Plate(int l, int b){
        Length = l;
        Breadth = b;
    }
    void display(){
        System.out.println("Length: " + Length);
        System.out.println("Breadth: " + Breadth);
    }
}
class Box extends Plate{
    int Height;
    Box(int l, int b, int h){
        super(l, b);
        Height = h;
    }
    void display(){
        super.display();
        System.out.println("Height: " + Height);
    }
}
class woodbox extends Box{
    int thickness;
    woodbox(int l, int b, int h, int t){
        super(l, b, h);
        thickness = t;
    }
    void display(){
        super.display();
        System.out.println("Thickness: " + thickness);
    }
}

public class lab3q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("u want plate(1),box(2),or woodbox(3):");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter length and breadth:");
            int l=sc.nextInt();
            int b=sc.nextInt();
            Plate p=new Plate(l,b);
            p.display();
        }
        else if(choice==2){
            System.out.println("Enter length,breadth and height:");
            int l=sc.nextInt();
            int b=sc.nextInt();
            int h=sc.nextInt();
            Box bo=new Box(l,b,h);
            bo.display();
        }
        else{
            System.out.println("Enter length,breadth,height and thickness:");
            int l=sc.nextInt();
            int b=sc.nextInt();
            int h=sc.nextInt();
            int t=sc.nextInt();
            woodbox w=new woodbox(l,b,h,t);
            w.display();
        }
        sc.close();
    }
}
