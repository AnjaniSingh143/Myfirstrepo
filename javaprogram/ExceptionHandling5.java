/*User-defined Exception*/
import java.util.Scanner;

class UnderAgeException extends Exception{
    public UnderAgeException(String message){
        super(message);
    }
}
class OverAgeException extends Exception{
    public OverAgeException(String message){
        super(message);
    }
}
class Customer{
    int age;
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.print("Enter your age :");
        age = sc.nextInt();
        System.out.println();
    }
    public void verify() throws UnderAgeException, OverAgeException{
        if(age<18){
            UnderAgeException uae = new UnderAgeException("Sorry, you are below 18!");
            System.out.println(uae.getMessage());
            throw(uae);
        }
        else if(age>60){
            OverAgeException oae = new OverAgeException("Sorry, you are over age!");
            System.out.println(oae.getMessage());
            throw(oae);
        }
        else{
            System.out.println("Verified!");
            System.out.println("You are eligible.");
        }
    }
}
class RTO{
    void access(){
        Customer ref = new Customer();
        try{
            ref.input();
            ref.verify();
        }
        catch(UnderAgeException | OverAgeException a){
            try{
                System.out.println("Re-enter your age.");
                ref.input();
                ref.verify();
            }
            catch(UnderAgeException | OverAgeException ae){
                try{
                    System.out.println("Re-enter your age.");
                    ref.input();
                    ref.verify();
                }
                catch(UnderAgeException | OverAgeException aae){
                    System.out.println();
                    System.out.println("Access denied!");
                    System.out.println("You crossed limit");
                    System.exit(0);
                }
            }
        }
    }
}
public class ExceptionHandling5 {
    public static void main(String... args){
        RTO at = new RTO();
        at.access();

    }
}
