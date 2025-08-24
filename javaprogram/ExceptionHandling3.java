import java.util.Arrays;
import java.util.Scanner;

/*Exception Handling*/
class Alpha{
    Scanner sc = new Scanner(System.in);
    /*if Exception occur , it will direct to the caller func
            (in case there is no Exception Handler in it)*/
    void alpha() throws ArithmeticException{        // ducking using "throws"
        System.out.println("Connection established.....");
        System.out.println();
        System.out.println("Enter the first number.");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number.");
        int num2 = sc.nextInt();
        float div = num1/num2;
        System.out.println("Result = "+div);
        System.out.println("Connection terminated....");

    }
}
class Beta extends Alpha{
    void beta() throws ArithmeticException{     //ducking using "throws"
        Alpha ref = new Alpha();
        ref.alpha();
    }
}

class Alpha1{
    Scanner sc = new Scanner(System.in);
    /*if Exception occur , it will direct to the caller func
            (in case there is no Exception Handler in it)*/
    void alpha() throws ArithmeticException{        // ducking using "throws"
        System.out.println("Connection established.....");
        System.out.println();
        try {
            System.out.println("Enter the first number.");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number.");
            int num2 = sc.nextInt();
            float div = num1 / num2;
            System.out.println("Result = " + div);
        }
        catch(ArithmeticException asr){
            System.out.println("Exception handle in Alpha1 only");
            // if i want to handle the caller func also...
            // Re-throwing an Exception
            throw(asr);         // after throw no statement will execute
        }
        finally {
            System.out.println("Directed to caller class....");
        }

    }
}
public class ExceptionHandling3 {
    public static void main(String... args) throws InterruptedException{
//        try{
//            Beta ref = new Beta();
//            ref.beta();
//        }
//        catch(ArithmeticException ae){
//            System.out.println("Exception Handled in the main");
//        }

        try{
            Alpha1 ref1 = new Alpha1();
            ref1.alpha();
        }
        catch(ArithmeticException ad){
            System.out.println();
            /*methods of throwable -> getmessage(), gettoString(), printstackTrace()*/

//            System.out.println(ad.getMessage());    // /by zero
            System.out.println(ad.toString());;
            System.out.println(Arrays.toString(ad.getStackTrace()));
//            ad.notify();
//            System.out.println(Arrays.toString(ad.getSuppressed()));
            System.out.println();
            System.out.println(" Finally Exception handle in main class only");
        }
        finally {
            System.out.println("Connection terminated!....");
        }

        /*Unchecked Exception --> compiler will not force us to handle the exception
        * Checked Exception   --> it will checked by compiler
        *       like below....*/

//        Thread.sleep(5000); // compiler give the error
        // method 1:
//        try{
//            System.out.println("System ready to take a nap");
//            Thread.sleep(5000);
//            System.out.println("System start!");
//        }
//        catch(InterruptedException aee){
//            aee.printStackTrace();
//        }
//
//        //method 2:
//        System.out.println("System going to sleep");
//        Thread.sleep(5000);
//        System.out.println("Starting...");


    }
}
