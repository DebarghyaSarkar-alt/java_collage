class mythread extends Thread {
    static int count = 0;
    synchronized void increment(){
        count++;
    }
    public void run() {
        increment();
    }
}


public class examprep {
    public static void main(String[] args) {
       
        mythread t1 = new mythread();
        mythread t2 = new mythread();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count: " + mythread.count);
    }

}
