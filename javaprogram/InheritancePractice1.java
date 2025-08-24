import org.w3c.dom.ls.LSOutput;

class Parent1{  // if extends keyword is not, by default it will extends Object class

    String name= "Anjani Singh";
    int age = 24;
    Parent1(){          // called because of by default super() method in child class constructor..
        System.out.println("Parent1 class constructor.....");
    }
      final void display(){
        System.out.println(name+" is "+age+" years old.");
    }

}
class Child1 extends Parent1{
    // properties of Parent1 + Properties of Object class.
    Child1(){         //this is by-default present if not make by developer...
        super();
        System.out.println("inside child1 class");
    }
    private  int a=10;
    private int b=20;
  void  display1(){
        System.out.println("Hii! Mr.");
        int c = a+b;
        System.out.println(c);
    }
}
/*Parent1 is a parent/Bare class/ existing class
* Child1 is a child class/sub-class/derived class*/
//multilevel inheritance.......
class Child2 extends Child1{
    // properties of Child1 + properties of Parent1
//    a = 27;   /* we can't use as it is private....
//                  private are not allowed in inheritance....*/

//    b = 38;
    static float c;
    static float add(float a, float b){
        c=a+b;
        System.out.println("This is static method.....");
        return c;
    }
}
//class Child3 extends Child2{
//
//}
public class InheritancePractice1 {
    public static void main(String[] args){
        Child2 ch = new Child2();
        ch.display();
        ch.display1();
    //    float result=Child2.add(545.42f,504.145f);
   //     System.out.println(result);
//        Child2.add(212.02f,242.4f);  // not work as methods return type is not void
    }
}
