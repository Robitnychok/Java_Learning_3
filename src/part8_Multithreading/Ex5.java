package part8_Multithreading;

public class Ex5 {
    public static void main(String[] args) {

        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("My_Thread");
        myThread5.setPriority(9);
        System.out.println("Name of MyThread5 = " + myThread5.getName()
                            + " Priority of MyThread5 = " + myThread5.getPriority());

        MyThread5 myThread6 = new MyThread5();
        System.out.println("Name of MyThread6 = " + myThread6.getName()
                + " Priority of MyThread6 = " + myThread6.getPriority());

    }
}
class MyThread5 extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}