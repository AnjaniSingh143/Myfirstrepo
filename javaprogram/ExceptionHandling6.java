import java.io.BufferedReader;
import java.io.FileReader;

/*try with resource
* resources ==> interface that will implements AutoCloseable*/
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Fileread{
    void readtxt() throws IOException,Exception{
        /* for thos we always have to close the resources and need of finally block every time
        * ---to resolve this , we use try-with-resource*/
//        BufferedReader br = null;   // resource
//        try{
//            br = new BufferedReader(new FileReader("sample.text"));
//        }
//        catch(IOException ae){
//            ae.getStackTrace();
//        }
//        catch(Exception aee){
//            aee.getStackTrace();
//        }
//        finally{
//            if(br!=null) {
//                br.close();
//            }
//        }

        // try with resource
        try(BufferedReader br = new BufferedReader(new FileReader("sample.text")))
        {
            // use br as your requirement
            // automatically close the resources
            System.out.println(br);
            br.read();
        }
        // here br.close() called automatically
        catch (IOException ae){
            ae.getMessage();
            ae.getStackTrace();
            throw(ae);
        }
        catch (Exception aee){
            aee.getCause();
            throw(aee);
        }
    }
}
/*Overridden method with exception in child class*/
class Parent112{
    Scanner sc = new Scanner(System.in);
    void m1() throws IOException{   // only needed for checked exception when child class throws exception
        System.out.println("Enter Parent age :");
        int age = sc.nextInt();
    }
}
class Child11 extends Parent112{
    void m1() throws IOException{
        System.out.println("Enter Child age: ");
        try{
            int age = sc.nextInt();
        }
        catch(ArithmeticException ae){
            ae.getMessage();
        }
    }
}
class Student11{

}
class Employees11{

}
class Customer11{

}
public class ExceptionHandling6 {
    public static void main(String... args) throws Exception{
        try {
            Fileread ref = new Fileread();
            ref.readtxt();
        }
        catch(Exception a){
            System.out.println("Read failed!");
        }

        Parent112 p = new Child11();
        try{
            p.m1();
        }
        catch(Exception aae){
            aae.getStackTrace();
        }


        /*instanceof and isinstanceof  operator*/
        // instanceof........
            // use only when compiler know the object
        ArrayList ar = new ArrayList();
        ar.add(new Student11());
        ar.add(new Employees11());
        ar.add(new Customer11());

        Object o = ar.get(0);
        if(o instanceof Student11){ // here compiler know Student object
            Student11 s = (Student11)o;
            // perforn on s
        }
        else if(o instanceof Employees11){
            Employees11 e = (Employees11)o;
            //perform on e
        }
        else{
            Customer11 c = (Customer11) o;
            //perform on c
        }

        //.......
        //to use instanceof there should be some relation between argument type
        Thread th = new Thread();
        System.out.println(th instanceof Thread );  //true  // check th is Thread type or not
        System.out.println(th instanceof Object);   //true
        System.out.println(th instanceof Runnable); // true
//        System.out.println(th instanceof String); //CE
        String a = new String("Anjani");
        System.out.println(a instanceof Object);    ///true

        //isinstance() method
            // check whether the given object is particular type or not but at runtime
        Thread t = new Thread();
        System.out.println(Class.forName(args[0]).isInstance(t));


    }
}
