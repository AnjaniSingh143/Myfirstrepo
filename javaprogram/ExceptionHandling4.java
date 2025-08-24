import java.util.Scanner;

/*Customized Exception or user defined Exception*/
class InvalidCustomerException extends Exception{
    public InvalidCustomerException(String msg){
        super(msg);
    }
}
class Atm11{
    int pw;
    int uid;
    int userid = 439588;
    int password = 1432;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter your userId : ");
        uid= sc.nextInt();
        System.out.print("Enter password : ");
        pw = sc.nextInt();
        System.out.println();

    }
    void verify() throws InvalidCustomerException{
        if ((uid == userid) && (pw == password)){
            System.out.println("Verified ! ");
            System.out.println("Please collect your cash");
        }
        else{
//            System.out.println("Sorry! Your user id or password incorrect");
            InvalidCustomerException ice = new InvalidCustomerException("re-enter your detail!");
            System.out.println(ice.getMessage());
            throw(ice);
        }

    }
}
class Bank11 {
    void tranc(){
        Atm11 at = new Atm11();
        try {
            at.input();
            at.verify();
        }
        catch(InvalidCustomerException ae){
            try {
                System.out.println("2 attempts left!");
                System.out.println();
                at.input();
                at.verify();
            }
            catch(InvalidCustomerException aee){
                try {
                    System.out.println("1 attempts left!");
                    System.out.println();
                    at.input();
                    at.verify();
                }
                catch(InvalidCustomerException aeee){
                    System.out.println("Your card id blocked!");
                    System.exit(0);
                }
            }
        }
    }

}
public class ExceptionHandling4 {
    public static void main(String[] args){
        Bank11 ref = new Bank11();
        ref.tranc();

    }
}
