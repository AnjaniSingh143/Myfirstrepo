class Print{
    public static void disp(){      // static method participate in inheritance
        System.out.println("Printing....");
    }
}
class PrintNew extends Print{
    /* if we make static method in child class, it is not overridden
    * it is specialize mehtod and called as "method hinding"*/
    public static void disp(){
        System.out.println("Re Printing....");
    }
}
public class Methodhiding {
    public static void main(String... args){
        Print p = new PrintNew();
        p.disp();       // disp() of parent class is calling

//        PrintNew p1 = new PrintNew();
//        p1.disp();

    }
}
