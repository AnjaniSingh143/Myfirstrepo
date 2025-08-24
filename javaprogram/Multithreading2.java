/* multithreading using implementing  runnable interface*/

/*behind the scene
interface Runnable{
    void run();
}
class Thread implements Runnable{
    void start(){

    }
    public void run(){
        //no implementation
    }
}
*/
class MyRunnable implements Runnable{
    @Override
    public void run(){
        Thread.currentThread().setName("User Thread");
        for(int i=0; i<8; i++){
            System.out.println("Runnable thread");
        }
    }
}
public class Multithreading2 {
    public static void main(String... args){
        MyRunnable t = new MyRunnable();

        Thread r = new Thread(t); //execute implementation class run() of interface...
        r.start();
//        t.run();  // no threads are created but execute run() as simple method.
//        r.run();  // no threads are created but execute run() as simple method.

        for (int i=0; i<8; i++){
            System.out.println("Main thread.");
        }

        // to get thread name/......
        String name = Thread.currentThread().getName();
        System.out.println("main() is executed by : "+name);
        System.out.println(Thread.currentThread().getThreadGroup());

        System.out.println(r);

        System.out.println("User defined thread is executed by : "+r.getName());
        System.out.println();
        long id = Thread.currentThread().threadId();
        System.out.println(id);

    }
}
