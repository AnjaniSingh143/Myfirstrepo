/* Interfaces */
interface Demo11{
    public static final int x = 12;
    int y=33;   //by default it is public static final
    /*we can't use another access modifier like private,
    * protected, native, etc*/

    void m1();
    void m2();
}
interface Demo22{
    void m3();
}
interface Demo33{
    void m5();
}
/*CASE 1 :  // a interface can extends any no. of interfaces at a time */
interface ComDemo extends Demo11,Demo22{
    void m4();
}
/*CASE 2: // a class can implements any no. of interface at a time */
class Sample implements Demo11,Demo22{
    public void m1(){
        System.out.println("method m1.");
    }
    public void m3(){
        System.out.println("method m3.");
    }
    public void m2(){
        System.out.println("method m2.");
    }
}
/*CASE 3 : a class can extend another class and can implements any no. of interfaces simultaneously
*            it should first extend and then implements...
*
* Note:- one class can extends only one class at a time.*/
class Sample1 extends Sample implements ComDemo,Demo33{
    public void m4(){
        System.out.println("method m4.");
    }
    public void m5(){
        System.out.println("method m5");
    }
}
public class Interface2 {
    public static void main(String[] args){
        Sample1 ref = new Sample1();
        ref.m1();
        ref.m2();
        ref.m3();;
        ref.m4();
    }
}
