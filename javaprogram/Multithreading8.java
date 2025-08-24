/*This code gives inconsistance output
* to solve this use synchronized keyword
* synchronized --> at a time only one thread can execute*/
class Display{
    public synchronized void wish(String name){ // synchronized keyword gives consistance output
        for(int i=0; i<5; i++) {
            System.out.print("Good Morning : ");

            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException io) {

            }
            System.out.println(name);
        }
    }
}
class MyThread4 extends Thread{
    Display d;
    String name;
    public MyThread4(Display d, String name){
        this.d = d;
        this.name = name;
    }

    @Override
    public void run(){
        d.wish(name);
    }
}
public class Multithreading8 {
    public static void main(String... args){
       /* Display d = new Display();

        MyThread4  t = new MyThread4(d, "Sachin");
        MyThread4 t1 = new MyThread4(d,"Dhoni");    //two threads are apply on single object (d)
        t.start();                                  // it will lead to data inconsistency, to resolve this synchronization
        t1.start();

        */

        //  synchronization is not required, no impact of synchronization
        Display d = new Display();
        Display d1 = new Display();

        MyThread4 t = new MyThread4(d,"sachin");
        MyThread4 t1 = new MyThread4(d1,"dhoni");

        t.start();
        t1.start();

    }
}
