/*Priority of the threads...*/
/*public static final int MIN_PRIORITY = 1;
* public static final int MAX_PRIORITY = 10;
* public static final int NORM_PRIORITY = 5;    // default priority
*
* more the priority quickly TS will allocate cpu time*/
class MyRunnable1 implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Child thread!");
        }
    }
}

public class Multithreading3 {
    public static void main(String... args){
        MyRunnable1 r = new MyRunnable1();
        Thread t = new Thread(r);


        // if i set priority then it will run according to sequence
        t.setPriority(2);
        System.out.println(t.getPriority());

        t.start();
//        t.setPriority(100); // Exception
        System.out.println("Priority of User-defined thread = "+t.getPriority());   //5


        for (int i=0; i<5; i++){
            System.out.println("main thread!");
        }
        System.out.println(Thread.currentThread().getPriority());   //5
    }

}
