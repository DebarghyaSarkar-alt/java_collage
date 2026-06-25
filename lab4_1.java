
abstract class student{
    int roll;
    int reg;
    student(int r, int re){
        roll = r;
        reg = re;   

    }
    abstract void abstractcourse();
}
class kiitian extends student{
    kiitian(int r, int re){
        super(r, re);
    }
    void abstractcourse(){
        System.out.println("ROLL NO: " + roll);
        System.out.println("REG NO: " + reg);
        System.out.println("COURSE: CSE");
    }
}

public class lab4_1 {
    public static void main(String[] args) {
        kiitian k = new kiitian(123, 456789);
        k.abstractcourse();
    }
}
