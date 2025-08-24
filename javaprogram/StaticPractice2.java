import java.util.Scanner;

// Loan for different farmers...
class Farmer{
    private String name;
    private String fname;
    private String lname;
    private float pa;
    private float td;
    private float si;
    final private static float ri;

    static{
        ri = 3.5f;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly Enter your name and Principal amount:");
        fname =sc.next();
        lname = sc.next();
        pa=sc.nextFloat();
        System.out.println("Kindly Enter the time duration:");
        td = sc.nextFloat();
//        ri = 3.5f;      // it will occupy spaces for every objects that will create.
                            /* to avoid this make it static and use one static block.*/
    }
    float compute(){
        name =fname+" "+lname;
        si = (pa * td * ri)/100;
        return si;
    }
    void display(){
        input();
        compute();
        System.out.println(name+", Your interest is "+si);
//        compute();
    }
}
public class StaticPractice2 {
    public static void main(String[] args){
        Farmer f1 = new Farmer();
//        f1.input();
                             /* to avoid calling all the methods call all the methods in one method
                                of the same class.*/
//        f1.compute();
        f1.display();

        Farmer f2 = new Farmer();
//        f2.input();
        f2.display();

    }
}
