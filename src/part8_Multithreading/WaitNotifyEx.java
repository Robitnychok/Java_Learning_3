package part8_Multithreading;

public class WaitNotifyEx {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}
class Market{
    private int breadCount = 0;
    public synchronized void getBread(){
        while (breadCount<1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("Customer bought 1 bread");
        System.out.println( breadCount +  "= bread left in the shop");
        notify();
    }
    public synchronized void putBread(){
        while (breadCount>=5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Producer added 1 bread");
        System.out.println( breadCount +  "= bread left in the shop");
        notify();
    }
}

class Producer implements Runnable{
    Market market;
    Producer (Market market){
        this.market = market;
    }
    public void run(){
        for (int i = 0; i<10; i++){
            market.putBread();
        }
    }
}

class Consumer implements Runnable{
    Market market;
    Consumer (Market market){
        this.market=market;
    }
    public void run(){
        for (int i = 0; i<10; i++){
            market.getBread();
        }
    }
}