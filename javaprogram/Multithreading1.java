/* Multithreading
* 2 ways of defining thread
*   --> extending Thread class
*   --> implementing Runnable interface
*
* // using extend Thread class*/

//behind the scenes
//class Thread{
        // Heart of Multithreading
//    public void start(){
//        //Register the thread with ThreadScheduler
//        //All other mendatory low level activities
//        // invoke or call run() method
//    }
//    public void run(){
//        //no implementation
//    }
//}
class Mythread extends Thread{
//    public void start(){    //normal method , will not create any thread in this case
//        System.out.println("Starting thread");
//    }
    public void start(int a){
        super.start();  // create a thread
        System.out.println("Starting thread.");
    }

    @Override
    public void run(){  // predefined class in Thread

        //task for user defined thread
        for (int i =0; i<5; i++){
            System.out.println("Child Thread");
        }
    }
}
public class Multithreading1 {

    public static void main(String... args){
        Mythread ref = new Mythread();
//        ref.start();    // creating new thread and that will execute run method

//        ref.start();    /* IllegalStatException at runtime i.e. again it will creating thread*/
        ref.start(6);

        // 2 threads started and eagerly waiting for CPU time, scheduling done by ThreadScheduler
        //task for main thread
         for( int i =0; i<8; i++){
             System.out.println("Main Thread.");
         }
    }
}

/* Run this file many times and absorve the differences*/
