/*`yield() is for giving chance to priority thread*/
class MyRunnable2 implements Runnable{
    public void run(){
        for (int i=0; i<10; i++){
            Thread.yield();     // it causes pause the current executing thread and give chance to waiting thread of same priority...
            System.out.println("User--defined thread is running.");
        }
    }
}
public class Multithreading4 {
    public static void main(String... args){
        MyRunnable2 r = new MyRunnable2();
        Thread t = new Thread(r);
        t.start();
        for (int i=0; i<10; i++){
            Thread.yield();     // decided by ThreadSchedular
            System.out.println("Main thread is running.");
        }
    }
}
