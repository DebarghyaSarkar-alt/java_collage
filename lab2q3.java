
import java.util.Scanner;


class  box{
    
    int volume(int length, int width, int height){
        return length*width*height;
    }
    
}
public class lab2q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        box b = new box();
        System.out.println("Enter length, width and height of the box:");
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int vol = b.volume(l, w, h);
        System.out.println("Volume of the box is: " + vol);
        
    }
}
