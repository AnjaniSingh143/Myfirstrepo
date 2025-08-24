import java.util.Scanner;

interface Calculator2{
    Scanner sc = new Scanner(System.in);
    static void meth1(){
        System.out.println("Connection established to Calculator app.");
        try {
            System.out.println("Enter the first number.");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number.");
            int num2 = sc.nextInt();
            float div = num1/num2;
            System.out.println("Result = "+div);

            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the number you want to insert");
            int elem = sc.nextInt();
            System.out.println("Enter the position at which inserted");
            int pos = sc.nextInt();
            arr[pos] = elem;
            System.out.println(elem+" is inserted at position "+pos+" successfully!");
        }
        catch(ArithmeticException ae){
            System.out.println("Illegal division! divided by zero.");
        }
        catch(NegativeArraySizeException aee){
            System.out.println("Array size can't be negative!");
        }
        catch(ArrayIndexOutOfBoundsException aeee){
            System.out.println("you enter out of bound index(position)!");
        }
        catch(Exception aae){   /*Parent Exception (in case any left out)*/
            System.out.println("Wrong input!");
        }
        System.out.println("Connection terminated!");
    };
}
/*Seperate try-catch block
* if one try block get terminated other will continue to run
* but in above interface it is not possible*/

interface Calculator3 extends Calculator2{
    static void meth2(){
        System.out.println("Connection established to Calculator app.");
        try {
            System.out.println("Enter the first number.");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number.");
            int num2 = sc.nextInt();
            float div = num1 / num2;
            System.out.println("Result = " + div);
        }
        catch(ArithmeticException ae){
            System.out.println("Illegal division! divided by zero.");
        }
        int[] arr;
        int pos;
        int elem;
        try{
            try {

                System.out.println("Enter the size of the array");
                int size = sc.nextInt();
                arr = new int[size];

            }catch(NegativeArraySizeException aee){
                System.out.println("Array size can't be negative!");
                return ;    // return from the method...
            }

            System.out.println("Enter the number you want to insert");
            elem = sc.nextInt();

            try {
                System.out.println("Enter the position at which inserted");
                pos = sc.nextInt();
                arr[pos] = elem;
            }
            catch(ArrayIndexOutOfBoundsException aeee){
                System.out.println("you enter out of bound index(position)!");
                return;
            }
            System.out.println(elem + " is inserted at position " + pos + " successfully!");

        }

        catch(Exception aae){   /*Parent Exception (in case any left out)*/
            System.out.println("Wrong input!");
        }
        // it guaranteed to execute while returning from anywhere
        finally {
            System.out.println();
            System.out.println("Connection terminated!");
        }
    }

}
public class ExceptionHandling2 implements Calculator2, Calculator3 {

    public static void main(String... args){
        Calculator3.meth2();
    }
}
