class Display1{
    public static synchronized void displayNumber(){
        for (int i=0; i<10; i++){
            System.out.print(i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException a){

            }
        }
    }

    public static synchronized void displayCharacter(){
        for (int i=65; i<75; i++){
            System.out.print((char)i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException ae){

            }
        }
    }
}
class MyThread5 extends Thread{
    Display1 d;
    MyThread5(Display1 d){
        this.d = d;
    }
    @Override
    public void run(){
        d.displayNumber();
    }
}
class MyThread6 extends Thread{
    Display1 d;
    MyThread6(Display1 d){
        this.d = d;
    }
    @Override
    public void run(){
        d.displayCharacter();
    }
}

public class Multithreading9 {
    public static void main(String... args){
        Display1 d = new Display1();

        MyThread5 t = new MyThread5(d);
        MyThread6 t1 = new MyThread6(d);
        t.setPriority(1);
        t.start();
        t1.start();
    }
}
