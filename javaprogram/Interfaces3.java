/*Interfaces-naming conflict*/
interface DemoI{
    /*No need of constructor, instance block, static block
    * Performance high as compare to abstract class.*/
    int x = 23;
    void m1();
    void m11();
//    void m12();
}
interface DemoI2{
    int x = 32;   // if same variable name in 2 different interfaces... call with interface name
    void m1();
    void m11(int i);
//    int m12();
}
class SampleDemo implements DemoI,DemoI2{
    @Override
    public void m1(){   // we can implements only one if same signature

    }
    @Override
    public void m11(){}
    @Override
    public void m11(int i){}    // Overloading { m11() and m11(int i) }

//    public void m12(){                /* not possible*/
//        System.out.println("Illigal");
//    }
//    public int m12(){
//        System.out.println(" Illegal");
//        return 4;
//    }
    /*variable access*/
    public void show(){
        System.out.println("DemoI variable :"+DemoI.x);
        System.out.println("DemoI2 variable :"+DemoI2.x);
    }
}

/*Marker Interfaces
*  e.g. - Serializable, Cloneable, SingleThreadModel*/
interface Serializable{
    // no methods

}
class SerializeImpl implements Serializable{
    public void disp(){
        System.out.println("Serializable......");
    }
}
interface Cloneable{
    //no methods
}
class CloneableImpl implements Cloneable{
    // known to jvm
    public void disp(){
        System.out.println("Cloneable.......");
    }
}


/*Adapter class*/
interface Servlet{
    void run();
    void show();
    void disp();
}
abstract class GenericServlet implements Servlet{   //Adapter class
    /*NO Object creation for this class as it is abstract
    * Can contain constructor....*/
    public void run(){}
    public void show(){}
}
abstract class HttpServlet extends GenericServlet{  //Adapter class
    public void disp(){
        System.out.println("\"Displaying Srvlet....");
    }
}
class MyServlet extends HttpServlet{
    public void run(){
        System.out.println("Servlet is running...");
    }
    public void show(){
        System.out.println("Servlet is showing.....");
    }

    @Override
    public void disp() {
        super.disp();
    }
}
public class Interfaces3 {
    public static void main(String[] args){
        DemoI ref = new SampleDemo();
        ref.m1();
        ref.m11();
        SampleDemo ref1 = new SampleDemo();
        ref1.show();

        /*Marker Interface*/
        Serializable ref2 = new SerializeImpl();
//        ref2.disp();
        CloneableImpl ref3 = new CloneableImpl();
        ref3.disp();

        /*Adapter class*/
        Servlet ref4 = new MyServlet();
        ref4.disp();
        ref4.run();
        ref4.show();

    }
}
