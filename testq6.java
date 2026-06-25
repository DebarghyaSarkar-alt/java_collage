class T2 extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("T2: " + i);
        }
    }
}

class T1 extends Thread {
    T2 t2;

    
    T1(T2 t2) {
        this.t2 = t2;
    }

    public void run() {
        try {
            t2.join();  
        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("T1: " + i);
        }
    }
}

public class testq6 {
    public static void main(String[] args) {
        T2 t2 = new T2();
        T1 t1 = new T1(t2);

        t2.start();
        t1.start();
    }
}