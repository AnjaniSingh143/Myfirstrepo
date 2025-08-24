/*using lambda expression -- no extra class needed*/
public class Multithreading7 {
    public static void main(String... args){
//        Runnable r = () -> {
//            for(int i=0; i<5; i++){
//                System.out.println("User-defined thread!");
//            }
//        };
/*
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    System.out.println("User-defined");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        */

        /*Annonimous inner class*/
        /*
        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    System.out.println("User-defined thread");
                }
            }
        });
        t.start();
        */

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<4; i++){
                    System.out.println("User-defined thread!");
                }
            }
        }).start();

        for(int i=0; i<5; i++){
            System.out.println("Main thread!");
        }
    }
}
