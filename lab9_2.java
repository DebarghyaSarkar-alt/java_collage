
class A extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "I");
        System.out.println(Thread.currentThread().getName() + "Love");
        System.out.println(Thread.currentThread().getName() + "Java");
        System.out.println(Thread.currentThread().getName() + "Very");
        System.out.println(Thread.currentThread().getName() + "Much");
    }

}

public class lab9_2 {
    public static void main(String[] args) {
        A t1 = new A();
        t1.setName("thread 1");
        t1.start(); // begin t1

        try {
            t1.join(); // block until t1 has terminated
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        A t2 = new A();
        t2.setName("thread 2");
        t2.start(); // only now start t2
        // …optionally join t2 as well
    }
}
