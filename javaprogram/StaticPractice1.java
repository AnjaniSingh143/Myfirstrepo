import org.w3c.dom.ls.LSOutput;

// Show the hierarchy order of execution.....
class Demo1{

    static int a1 =41;
    static int  b1 = 14;

    static int c;
    static{                                 //this block execute by default for every methods(if multiple methods)...
        System.out.println("Static block");
        c =a1+b1;
    }
    static void display1(){
        System.out.println("Static method.");
        System.out.println("result: "+c);
    }
    int a; int b;
    {
        a=10;
        b=20;
        System.out.println("Normal java block");
    }
    Demo1(){
        System.out.println("Normal Constructor.");
    }
    void display(){
        System.out.println("Normal method.");
    }


}
class Demo3{
    int a;
    int b;
    static int count;

    {                      /* If this block is static then it will execute once.*/
        count++;
     }
    Demo3(){
        System.out.println("Constructor 1");
//        count++;  /* instead of using multiple places use in a
//                      block it will call every time of object creation*/
    }
    Demo3(int a){
        this.a=a;
        System.out.println("Constructor 2");
//        count++;
    }
    Demo3(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Constructor 3");
//        count++;
    }
}
public class StaticPractice1 {
    public static void main(String[] args){
        Demo1 d = new Demo1();
        d.display();
        Demo1.display1();

        Demo3 d1 = new Demo3();
        Demo3 d2 = new Demo3(5);
        Demo3 d3 = new Demo3(4,5);
        System.out.println("No. of Objects created: "+Demo3.count);

    }
}
