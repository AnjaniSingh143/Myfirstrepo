/*Interruption*/
class MyThread3 extends Thread{
    @Override
    public void run(){

        try{
            for (int i=0; i<8; i++){
                System.out.println("User-defined thread");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException a){
            System.out.println("main thread is interrupted");
        }
    }
}
/*if i use sleep() after thread get executed completely , then interrupt() has no use
* and if there is no sleep state of waiting state , in this case also...*/
public class Multithreading6 {
    public static void main(String... args) throws InterruptedException{
        MyThread3 t = new MyThread3();
        t.start();
//        t.interrupt();

        for (int i=0; i<5; i++){
//            Thread.currentThread().interrupt();
            System.out.println("Main thread ");
            Thread.sleep(2000);
        }

    }
}
