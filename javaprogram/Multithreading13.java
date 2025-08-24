/*without synchronized it works good
* but after synchronized it would be deadlock.*/
class Multithreading131 {
    public synchronized void d1(Multithreading132 b){
        System.out.println("Thread-1 is start execute d1().");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException a){

        }
        System.out.println("Thread-1 is trying to call b.last().");
        b.last();
    }
    public synchronized void last(){
        System.out.println("Inside Multithreading131 last() method");
    }

}
class Multithreading132 {
    public synchronized void d2(Multithreading131 a){
        System.out.println("Thread-2 start executing d2().");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException aea){

        }
        System.out.println("Thread-2 is trying to call a.last().");
        a.last();
    }
    public synchronized void last(){
        System.out.println("Inside Multithreading132 last() method.");
    }

}
public class Multithreading13 extends Thread {
    Multithreading131 t1 = new Multithreading131();
    Multithreading132 t2 = new Multithreading132();

    public void m1(){
        this.start();
       t1.d1(t2);
    }
    @Override
    public void run(){
        t2.d2(t1);
    }

    public static void main(String... args){
        Multithreading13 t = new Multithreading13();
        t.m1();

    }
}
