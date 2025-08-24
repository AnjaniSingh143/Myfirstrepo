/*Synchronnized block --  if some lines of code required to get lock*/
class Display2{
    ;;;;;;; // 1 lack lines of code
    public synchronized void wish(String name){
        ;;;;; // 1 lack lines of code
        for (int i=0; i<4; i++){
            System.out.println("Welcome "+name);
        }
        System.out.println("Thread which get lock :: "+Thread.currentThread().getName());

        // lock of class level, so only thread can access this region as this is critical
        synchronized (Display2.class){      // either "this, Display2.class, d" in paranthesis
            for (int i=0; i<5; i++){
                System.out.print("Good Morning, ");
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException a){

                }
                System.out.println(name);
            }
        }
        System.out.println("Thread which releases the lock :: "+Thread.currentThread().getName());
        ;;;;; // 1 lacks line of code
        for (int i=0; i<4; i++){
            System.out.println("Good to see you "+name);
        }
    }
}
class MyThread11 extends Thread{
    Display2 d;
    String name;
    MyThread11(Display2 d, String name){
        this.d=d;
        this.name = name;
    }
    @Override
    public void run(){
        d.wish(name);
    }
}
class MyThread12 extends Thread{
    Display2 d;
    String name;
    MyThread12(Display2 d, String name){
        this.d = d;
        this.name = name;
    }
    @Override
    public void run(){
        d.wish(name);
    }
}
public class Multithreading10 {
    public static void main(String... args){
        Display2 d = new Display2();

        MyThread11 t1 = new MyThread11(d,"Dhoni");
        MyThread12 t2 = new MyThread12(d,"Yuvraj");
        t1.setName("Captain Thread");
        t2.setName("Player Thread");

        t1.start();
        t2.start();

    }
}
