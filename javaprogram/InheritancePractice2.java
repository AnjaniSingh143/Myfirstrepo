class Parentt{
    int a;

    int b;
    Parentt(){
        a=19;
        b=29;
        System.out.println("Parent class Constructor");
    }
    Parentt(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Parentt para constructor");
    }
}
class Childd extends Parentt{
    int x, y;
    Childd(){
//        super();     // it will call Parent class constructor
//        super(1238,2389);     // it will call parameterize parent class constructor
        this(38,4389);    // it will call same class constructor with parameterize.....
        System.out.println("Childd class constructor");

    }
    Childd(int x,int y){
//        super(2389,27470);
        super();
        this.x=x;
        this.y=y;
        System.out.println("Childd class paara constructor");
    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
public class InheritancePractice2 {
    public  static void main(String[] args){
        Childd ch1 = new Childd();
        ch1.disp();

        Childd ch2 = new Childd(1233,4343);
        ch1.disp();
    }
}
