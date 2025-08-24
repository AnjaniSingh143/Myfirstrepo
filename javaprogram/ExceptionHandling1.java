import java.util.Scanner;
/*Exception occur at the run time
*   Handle by try-catch() block*/
public class ExceptionHandling1 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Connection to Calculator app is established.");
            System.out.println("Enter the first number:");
            int a = sc.nextInt();
            System.out.println("Enter the second number:");
            int b = sc.nextInt();
            float div = a / b;
            System.out.println("Result = "+div);
        }
        catch(Exception e){     //inbuilt class name in parameter
            System.out.println("Illegal division, by zero!");
        }
        System.out.println("Connection terminated!");
    }
}
