/*Concept of DaemonThread
* ---Supporting thread
* ---Executing in background
* --- when heap region get full it will remove the unneccesary object*/
class MyThread24 extends Thread{
    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("Lazy Thread");      /*if we make this thread as daemon then
                                                        it will not execute furthure*/
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException ae){
                ae.printStackTrace();
            }
        }
    }

}
public class Multithreading14 {
    public static void main(String... args){
       //we cannot make main thread as Daemon as it started earlier...
//        System.out.println(Thread.currentThread().isDaemon());


        MyThread24 t= new MyThread24();
        t.setDaemon(true);      // we cannot make a thread as Daemon after starting the thread.
        t.start();

//        System.out.println(t.isDaemon());
        System.out.println("End of main thread.");

    }
}
