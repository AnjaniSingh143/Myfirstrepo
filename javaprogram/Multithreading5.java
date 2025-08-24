/*join() method --> for waiting another thread*/
class MyThread1 extends Thread{
    @Override
    public void run(){
        for (int i=0; i<8; i++){
            System.out.println("User-defined!");
        }
        try{
            Thread.sleep(2000); // pause the execution for 2sec
        }
        catch(InterruptedException a){

        }
    }
}
class MyThread2 extends Thread{
    static Thread mt;
    @Override
    public void run(){

        try{
            mt.join();      // User-defined thread is waiting for main thread
        }
        catch(InterruptedException ae){
            ae.printStackTrace();
        }
        for (int i=0; i<5; i++){

            System.out.println("User-defined1 thread");
        }
    }
}
public class Multithreading5 {
    public static void main(String... args) throws InterruptedException{
//        MyThread1 t = new MyThread1();
//        t.start();
//        t.join(1000,10); //main thread is waiting for User-defined thread
//        for (int i=0; i<8; i++){
//
//            System.out.println("Main Thread!");
//        }

        // for class MyThread2
        MyThread2.mt = Thread.currentThread();
        MyThread2 t1 = new MyThread2();
        t1.start();
        for (int i=0; i<5; i++){
            Thread.sleep(2000);
            System.out.println("Main Thread1");
        }


        /*if main method has only this*/
        Thread.currentThread().join();
        /*      it will join the main thread and there is only on thread
        *       so main thread is waiting for main thread and its continued
        *       it will goes in infinite waiting state..
        *       and it is known as "Deadlock"*/
    }
}
