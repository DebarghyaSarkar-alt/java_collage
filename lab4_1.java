
abstract class student{
    int roll;
    int reg;
    void getinput(int r, int re){
        roll = r;
        reg = re;   

    }
    abstract void abstractcourse();
}
class kiitian extends student{
    
    void abstractcourse(){
        System.out.println("ROLL NO: " + roll);
        System.out.println("REG NO: " + reg);
        System.out.println("COURSE: CSE");
    }
}

public class lab4_1 {
    public static void main(String[] args) {
        kiitian k = new kiitian();
        k.getinput(123, 456789);
        k.abstractcourse();
    }
}
