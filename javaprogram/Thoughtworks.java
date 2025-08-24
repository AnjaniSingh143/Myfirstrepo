class Product1 {
    int total = 0;

    synchronized void produce() throws InterruptedException {
        for (int day = 1; day <= 5; day++) {
            total += day;
            System.out.println("Produced: " + day + " -> Total: " + total);
            Thread.sleep(1000);
            notify(); // Notify consumer
        }
    }

    synchronized void consume() throws InterruptedException {
        while (total <= 0) {
            wait(); // Wait for item
        }
        System.out.println("Consuming item. Total before: " + total);
        total--;
        System.out.println("Total after consume: " + total);
    }
}

class Producer1 extends Thread {
    Product1 p;

    Producer1(Product1 p) {
        this.p = p;
    }

    public void run() {
        try {
            p.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer1 extends Thread {
    Product1 p;

    Consumer1(Product1 p) {
        this.p = p;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                p.consume();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Thoughtworks {
    public static void main(String[] args) {
        Product1 product = new Product1();
        Producer1 producer = new Producer1(product);
        Consumer1 consumer = new Consumer1(product);

        consumer.start();
        producer.start();
    }
}
