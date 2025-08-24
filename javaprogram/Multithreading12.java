import java.nio.channels.ScatteringByteChannel;

/*Inter-thread-communication with Producer and consumer through Prouducts*/
class Product{
    int total=0;

    public void item() throws InterruptedException{
        for (int day=1; day<=100; day++){
            total+=day;
            Thread.sleep(2000);
        }
    }
}
class Producer extends Thread{
    Product p =new Product();
    Customer c;
    @Override
    public void run(){

        produce();


    }
    synchronized void produce(){
        if (p.total>0){
            notify();
            System.out.println("Current item is "+p.total);
        }
        else{
            try{
                p.item();
            }
            catch (InterruptedException ae){
                ae.printStackTrace();
            }
        }
    }
}
class Consumer extends Thread{
    Producer pd=new Producer();
    Product p=new Product();
    @Override
    public void run() {
        consume();
    }


        synchronized void consume(){
            while(p.total<1){
                try{
                    wait();
                }
                catch(InterruptedException aee){
                    aee.printStackTrace();
                }

            }

        }

}

public class Multithreading12 {
    public static void main(String... args){
        Producer pd = new Producer();
        Consumer cm = new Consumer();
        pd.start();
        cm.start();

    }
}
