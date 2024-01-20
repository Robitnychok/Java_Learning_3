package part8_Multithreading;

import java.util.Scanner;

public class Ex12 {
    static final Object lock = new Object();
    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }
    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }
    void whatsappCall() {
        synchronized (lock) {
            System.out.println("WhatsappCall call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsappCall call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpMobile());
        thread1.start();

        Thread thread2 = new Thread(new RunnableImplSkype());
        thread2.start();

        Thread thread3 = new Thread(new RunnableImplWhatsapp());
        thread3.start();
    }
}
class RunnableImpMobile implements Runnable{
    public void run(){
        new Ex12().mobileCall();
        }
    }
class RunnableImplSkype implements Runnable{
    public void run(){
        new Ex12().skypeCall();
    }
}
class RunnableImplWhatsapp implements Runnable{
    public void run(){
        new Ex12().whatsappCall();
    }
}
