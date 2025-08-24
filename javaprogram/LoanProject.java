import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

class Loan{
    protected static StringBuilder Benefiaciaryname;
    protected static long aadharno;
    protected static long mobno;
    public static int PrincipalAmount;
    public static int time;
    static float interest;
//    static float rate;

//    Loan(StringBuilder name, long aadharno, long mobno){
//
//        System.out.println();
//        Loan.Benefiaciaryname=name;
//        Loan.aadharno=aadharno;
//        Loan.mobno=mobno;
//    }
//    StringBuffer static fname;
    static Scanner sc = new Scanner(System.in);

    public static void getdata(){
        System.out.println("Enter the beneficiary name:");
        StringBuilder fname =new StringBuilder(sc.next());
        String lname =new String(sc.next());
        Benefiaciaryname=fname.append(" ").append(lname);

        System.out.print("Enter Aadhar No.: ");
        aadharno = sc.nextLong();
        int len = String.valueOf(Math.abs(aadharno)).length();
        if(len!=12){
            System.out.println("Invalid aadhar, Re-enter your aadhar: ");
            aadharno=sc.nextLong();
        }
        System.out.println("Enter Mobile No.: ");
        mobno=sc.nextLong();
        int len1 = String.valueOf(Math.abs(mobno)).length();
        if (len1!=10){
            System.out.println("Incorrect Mob. No., Please re-enter:");
            mobno=sc.nextLong();
        }
    }

    /*formatting in indian system...*/
    static final DecimalFormat formatter = new DecimalFormat("##,##,###.00");
    static final DecimalFormat formatter1 = new DecimalFormat("#### #### ####");
    static void printdata(){
        System.out.println();
        final String ANSI_BOLD = "\u001B[1m";
        final String ANSI_RESET = "\u001B[0m";
        System.out.println(ANSI_BOLD+"Beneficiary Name     "+"   AadharNumber    "+"     Mobile Number"+ANSI_RESET);
        System.out.println(ANSI_BOLD+"----------------     "+"   ------------    "+"     -------------"+ANSI_RESET);
        System.out.println(Benefiaciaryname+"       "+"     "+formatter1.format(aadharno)+"        "+"+91 "+mobno);
        System.out.println();
        System.out.println("Your Principal amount is ₹"+formatter.format(PrincipalAmount)+" for "+time+" years.");
    }

    public static void compute(float rate){
        interest = (PrincipalAmount* rate * time)/100;
        System.out.println("₹"+formatter.format(interest));
        float totalamount = PrincipalAmount+interest;
        System.out.println("TotalAmount : \u20B9"+totalamount);
    }

}
class PersonalLoan extends Loan{
    final private static float rate = 10.0f ;

//    PersonalLoan(StringBuilder name, long aadharno, long mobno) {
//        super(name, aadharno, mobno);
//    }


    static void getdata1(){
        System.out.print("Please, enter your personal loan amount (in rupees): ");
        PrincipalAmount= sc.nextInt();
        System.out.print("Time duration: ");
        time=sc.nextInt();

    }
    void result(){
        Loan.printdata();
        System.out.println("Your interest rate is "+rate+"% p.a.");
        System.out.println("Please, confirm your detail. [Yes/No]");
        String con = sc.next();
//        System.out.print();
        if (con.equals("Yes")) {
            System.out.print(Benefiaciaryname + ", your interest for the Personal loan is ");
            Loan.compute(rate);
        }
        else{
            Loan.getdata();
            result();
        }
    }
    public final void call1(){
        System.out.println();
        getdata1();
        result();
    }

}
class EducationLoan extends Loan{
    final private static  float rate = 7.0f;

//    EducationLoan(StringBuilder name, long aadharno, long mobno) {
//        super(name, aadharno, mobno);
//    }

    static void getdata1(){
        System.out.print("Please, enter your Education loan amount (in rupees): ");
        PrincipalAmount= sc.nextInt();
        System.out.print("Time duration: ");
        time=sc.nextInt();

    }
    void result(){
        Loan.printdata();
        System.out.println("Your interest rate is "+EducationLoan.rate+"% p.a.");
        System.out.println("Please, confirm your detail. [Yes/No]");
        String con = sc.next();
//        System.out.print();
        if (con.equals("Yes")) {
            System.out.print(Benefiaciaryname + ", your interest for the Education loan is ");
            Loan.compute(rate);

        }
        else{
            Loan.getdata();
            result();
        }
    }
    public final void call2(){
        System.out.println();
        getdata1();
        result();
    }

}
class HomeLoan extends Loan{
    final private static float rate = 9.5f;

//    HomeLoan(StringBuilder name, long aadharno, long mobno) {
//        super(name, aadharno, mobno);
//    }

    static void getdata1(){
        System.out.print("Please, enter your HomeLoan amount (in rupees): ");
        PrincipalAmount= sc.nextInt();
        System.out.print("Time duration: ");
        time=sc.nextInt();

    }
    void result(){
        Loan.printdata();
        System.out.println("Your interest rate is "+rate+"% p.a.");
        System.out.println("Please, confirm your detail. [Yes/No]");
        String con = sc.next();
//        System.out.print();
        if (con.equals("Yes")) {
            System.out.print(Benefiaciaryname + ", your interest for the HomeLoan is ");
            Loan.compute(rate);
        }
        else{
            Loan.getdata();
            result();
        }
    }
    public final void call3(){
        System.out.println();
        getdata1();
        result();
    }

}
class CarLoan extends Loan{
    final private  static float rate = 8.3f;

//    CarLoan(StringBuilder name, long aadharno, long mobno) {
//        super(name, aadharno, mobno);
//    }

    static void getdata1(){
        System.out.print("Please, enter your Car loan amount (in rupees): ");
        PrincipalAmount= sc.nextInt();
        System.out.print("Time duration: ");
        time=sc.nextInt();

    }
    void result(){
        Loan.printdata();
        System.out.println("Your interest rate is "+this.rate+"% p.a.");
        System.out.println("Please, confirm your detail. [Yes/No]");
        String con = sc.next();
//        System.out.print();
        if (con.equals("Yes")) {
            System.out.print(Benefiaciaryname + ", your interest for the Car loan is ");
            Loan.compute(rate);
        }
        else{
            Loan.getdata();
            result();
        }
    }
     public final void call4(){
         System.out.println();
        getdata1();
        result();
    }

}

public class LoanProject {
    public static void main(String[] args){
//        PersonalLoan p1=new PersonalLoan();
//        EducationLoan p2 = new EducationLoan();
//        HomeLoan p3 = new HomeLoan();
//        CarLoan p4 = new CarLoan();
        System.out.println("Welcome to SBI !");
        System.out.println();
        Loan.getdata();

        int choice;
        String[] loanOption = new String[]{"PersonalLoan","EducationLoan","HomeLoan","CarLoan"};
        int i =0;

        System.out.println();
        System.out.println("Which one would you like to prefer........");
        for(String ele : loanOption){
            System.out.println((i+1)+". "+ele);
            i++;
        }

        while (true) {
            System.out.print("Enter your choice (1-" + loanOption.length + "): ");
            if (Loan.sc.hasNextInt()) {
                choice = Loan.sc.nextInt();
                if (choice >= 1 && choice <= loanOption.length) {
                    break;
                } else {
                    System.out.println("❌ Invalid choice. Try again.");
                }
            } else {
                System.out.println("❌ Please enter a number.");
                Loan.sc.next(); // clear invalid input
            }

        }

        switch (choice) {
            case 1 -> {
                PersonalLoan p1 = new PersonalLoan();
                p1.call1();
            }
            case 2 -> {
                EducationLoan p2 = new EducationLoan();
                p2.call2();
            }
            case 3 -> {
                HomeLoan p3 = new HomeLoan();
                p3.call3();
            }
            case 4 -> {
                CarLoan p4 = new CarLoan();
                p4.call4();
            }
        }




//        switch (choice) {
//            case 1 -> p4.call1();
//            case 2 -> p4.call2();
//            case 3 -> p4.call3();
//            case 4 -> p4.call4();
//        }


    }
}
