class Demo12{
    void disp(){
        System.out.println("Displaying Parent class...");
    }
    public void disp1(){
        System.out.println("Displaying another Parent class...");
    }
    public int add(){
        return 12+32;
    }
    public int mult(int a, int b){
        return a*b;
    }
}
class Demo121 extends Demo12{
    //overriding methods.....
    public void disp(){         // we can increase visibility while overridden...
        System.out.println("Displaying Child class..");
    }
//    void disp1(){             // visibility cannot be decreased while overriding...
//        System.out.println("Displaying another Child class..");
//    }
//    public float add(){      // return type cannot be different, it must be same...
//        return 122.2f+33f;
//    }

    public int mult(int a, int b, int c){       /*This is not overridden , it is specialized or
                                                    overloading method becoz mult(int a, int b) is also
                                                    in this class...*/
        return a*b*c;                           /* Parameter must be same for overriding....*/
    }
}

//For rule no. 3..........
class Interest {
    void disp(){
        System.out.println("you have to pay your interest.");
    }
}
class Loan1 extends Interest{
    public Interest compute(int interest){
        Interest t1 = new Interest();
        return t1;
    }
}
class PersonalLoan1 extends Loan1{
    /* This is overridden method irrespective of their return type is not same,
    *   But their return type is co-variant i.e. return type have parent-child relationship....*/
    public Loan1 compute(int p_interest){
        Loan1 t2 = new Loan1();
        return t2;
    }
}
public class OverridenPractice1 {
    public static void main(String[] args){
        
    }
}
