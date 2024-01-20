package part8_Multithreading;

public class Ex2 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}
class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i < 500; i++) {
            System.out.println(i);
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i = 500; i > 0; i--) {
            System.out.println(i);
        }
    }
}