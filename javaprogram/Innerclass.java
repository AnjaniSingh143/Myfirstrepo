/**
*
* */
/* Inner class */
class A{   // we can't make outer class as static
//    B b = new B();
    class B{        //Inner class
        public void conf(){
            System.out.println("config........");
        }

    }
    static class C{
        public void disp(){
            System.out.println("displaying.....");
        }
    }
    public void show(){
        System.out.println("showing........");
//        b.conf();
    }
}
public class Innerclass {
    public static void main(String args[]){
        A a = new A();
        a.show();

        A.B ref1;           // for non static
        ref1 = a.new B();
        ref1.conf();

        A.C ref;            //for static class..
        ref = new A.C();
        ref.disp();


    }
}
