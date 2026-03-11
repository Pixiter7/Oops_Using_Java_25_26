// UID: 24BCS12643
// Name: Himanshu Kumar

public class myThread extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println(i);
        }
        System.out.println("This is my thread");
    }
    public static void main(){
        myThread th = new myThread();
        th.start();
        try {
            th.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread2 th2 = new myThread2();
        th2.start();
        myThread3 th3 = new myThread3();
        Thread t3 = new Thread(th3);
        t3.start();
    }
}
class myThread2 extends Thread{
    public void run(){
        for(int i = 0; i<7; i++){
            System.out.println(i);
        }
        System.out.println("This is my thread");
    }

}
class myThread3 implements Runnable{
    public void run(){
        for(int i = 0; i<7; i++){
            System.out.println(i);
        }
        System.out.println("This is my thread");
    }

}