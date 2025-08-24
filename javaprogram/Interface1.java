/* Interfaces */

import java.util.Scanner;

interface Bank{     // 100% abstraction OR SRS
    /*By default methods are abstract and public in the interfaces
    * So, while implementing it methods should be public*/

    void deposit();
    void checkbalance();
    void withdraw();
}
abstract class Account1 implements Bank{ //not 100% abstract
    public int Amount;
    public int withdrawAmount;
    public int balance;
    Scanner sc = new Scanner(System.in);
    @Override   // indication to compiler that this method is overridden methhod.
    public void deposit(){
        System.out.print("Enter the amount:(in ₹) ");
        Amount = sc.nextInt();
        System.out.println("₹"+Amount+" has been deposited.");
        System.out.println();
    }
    @Override   // indication to compiler that this method is overridden methhod.
    public void checkbalance(){
        System.out.println("Your current balance is ₹"+Amount);
        System.out.println();
    }
//    @Override   // indication to compiler that this method is overridden methhod.
//    public void withdraw(){
//        System.out.println("Enter the amount for withdraw: ");
//        withdrawAmount = sc.nextInt();
//        balance = Amount - withdrawAmount;
//        System.out.println("Withdraw Amount : ₹"+withdrawAmount);
//        System.out.println("Now Your current balance is ₹"+balance);
//        System.out.println();
//
//    }
}
class CurrentAccount extends Account1{
    @Override
    public void withdraw(){
        System.out.println("Enter the amount for withdraw:(₹) ");
        withdrawAmount = sc.nextInt();
        balance = Amount - withdrawAmount;
        System.out.println("Withdraw Amount : ₹"+withdrawAmount);
        System.out.println("Now Your current balance is ₹"+balance);
        System.out.println();
    }
}
public class Interface1 {
    public static void main(String[] args){
//        Bank ref = new Account1();  //loose coupling....
//        ref.deposit();
//        ref.checkbalance();
//        ref.withdraw();

        Account1 ref1 =new CurrentAccount();    //loose coupling...
        ref1.deposit();
        ref1.checkbalance();
        ref1.withdraw();

        int a = 1;
        int b=2;
        int c=3;
        a|=4;
        b>>=1;
        c<<=1;
//        a^=c;
        System.out.println(a+" "+b+" "+c);

    }
}
