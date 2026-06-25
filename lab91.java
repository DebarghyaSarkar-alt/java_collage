
import java.util.Scanner;
class A extends Thread{
    
    int lower,upper,count;
    A(int lower,int upper){
        this.lower=lower;
        this.upper=upper;
        count=lower;
    }
    
    public void run(){
      for(int i=lower;i<=upper;i++){
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
             System.out.println(count++);
          
      }
    }
}

public class lab91 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of thread:");
        String name = sc.nextLine();
        System.out.println("lower range:");
        int lower = sc.nextInt();
        System.out.println("upper range:");
        int upper = sc.nextInt();
        A t1 = new A(lower,upper);
        t1.setName(name);
        System.out.println("name of thread: " + t1.getName());
        t1.start();
        


        
    }


}
