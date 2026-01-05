
import java.util.Scanner;


class rectangle{
    int length;
    int width;
    int area=0;
    int perimeter=0;
    void read(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length and width of the rectangle:");
        length = sc.nextInt();
        width = sc.nextInt();


    }
    void calculate(){

        area= length*width;
        perimeter= 2*(length+width);
        
    }
    void display(){
        System.out.println("Area of rectangle is: "+area);
        System.out.println("Perimeter of rectangle is: "+perimeter);
    }



    
}
public class lab2q4 {
    public static void main(String[] args) {
        
        rectangle r = new rectangle();
       
        r.read();
        r.calculate();
        r.display();
        

    }
}
