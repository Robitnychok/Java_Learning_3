package part8_Multithreading;

public class SynchronizedBlock2 {
    static int counter2 = 0;
    public static void increment2(){
        synchronized(SynchronizedBlock2.class) {
            counter2++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter2);
    }
}
class R2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SynchronizedBlock2.increment2();
        }
    }
}
