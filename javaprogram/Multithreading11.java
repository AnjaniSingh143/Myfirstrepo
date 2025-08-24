/*InterThreadCommunication
* use wait(), notify(), notifyall().. to communicate btn two threads*/
class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
        System.out.println("Child thread started calculation.");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += i;
            }

            this.notify();      // releases the lock for main thread
            System.out.println("Child thread giving notification call.");
        }
    }
}
public class Multithreading11 {
    public static void main(String... args) throws Exception{
        ThreadB t = new ThreadB();
        t.start();
//        System.out.println("No. of threads actively running : "+Thread.activeCount());

        synchronized(t){
            System.out.println("Main thread calling wait() thread.");
            t.wait();   // wait for Thread-0
            System.out.println("Main thread got notification call.");
            System.out.println(t.total);
        }

        // this approach is best instead of using sleep(), join()...,
        // it utilizes cpu time
        // synchronized means locking the line of code so that it will execute without any interruption

    }
}
