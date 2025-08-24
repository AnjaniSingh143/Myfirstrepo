import com.sun.security.jgss.GSSUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

interface Atm1{
    Scanner sc = new Scanner(System.in);
    String[] tranArray = new String[]{"withdraw","Balance Enquiry","Deposit"};

    void pin();

    void withdraw() throws InterruptedException;
    void balanceEnq();
    void deposit() throws InterruptedException;
}
abstract class MainBranch implements Atm1{
    private float currentBalance = 254632.5f;
    @Override
    public void withdraw() throws InterruptedException{
        try{
            System.out.println("Enter the amount( in₹) you want to withdraw:");
            int witamount = sc.nextInt();
            System.out.println("Please wait for some time....");
            Thread.sleep(3000);
            System.out.println("Your transaction is successful!");
            currentBalance -= witamount;
            System.out.println("Your Balance is ₹"+currentBalance);
        }
        catch (ArithmeticException aes){
            System.out.println("Wrong input! Please try again");
            System.out.println(aes.getMessage());
            System.out.println();
        }
    }
    @Override
    public void balanceEnq() {
        System.out.println("Your Current Balance Amount is ₹"+currentBalance);
    }
    @Override
    public void deposit() throws InterruptedException{
        try{
            System.out.println("Enter the amount( in₹) you want to deposit:");
            int depAmount = sc.nextInt();
            System.out.println("Please insert cash in cash drawl!");
            Thread.sleep(3000);
            System.out.println("Your amount is deposited successfully.");
            currentBalance+=depAmount;
            System.out.println("Your balance is ₹"+currentBalance);

        }
        catch (ArithmeticException ase){
            System.out.println("Incorrect Amount entered! Please try again.");
            System.out.println(ase.getMessage());
        }
    }



}
class Branch1 extends MainBranch{
        int pin;

        @Override
        public void pin(){
            System.out.println("Connection established..........");
            System.out.println();
            try {
                System.out.print("Enter your PIN: ");
                sc.nextInt();
                System.out.println("PIN entered successfully.");
            }
            catch(InputMismatchException aae){
                System.out.println("Incorrect PIN! Please try again.");
                return;
            }
            for(int i=0; i<tranArray.length; i++){
                System.out.print(i+1 +"."+tranArray[i]+"   ");
            }
            System.out.println();
                try{
                    System.out.print("Enter your choice: ");
                    int choice = sc.nextInt();
                    switch(choice){
                        case 1:
                            withdraw();
                            return;
                        case 2:
                            balanceEnq();
                            return;
                        case 3:
                            deposit();
                    }

                }
                catch(ArrayIndexOutOfBoundsException aea){
                    System.out.println("Wrong Input!");
                    return;
                }
                catch(ArithmeticException aee){
                    System.out.println("Invalid Input!");
                    return;
                }
                catch(NegativeArraySizeException aaee){
                    System.out.println("Incorrect Input!");
                    return;
                }
                catch(Exception aaea){
                    System.out.println("Please try again!");
                    return;
                }
            finally {
                System.out.println();
                System.out.println("Connection terminated........");
            }
        }


}
public class ATM_Project {
    public static void main(String... args){
        try{
            Atm1 at = new Branch1();
            at.pin();
        }
        catch (Exception aw){
            System.out.println("Something went wrong!");
            System.out.println("Please try again!");
        }

    }
}
