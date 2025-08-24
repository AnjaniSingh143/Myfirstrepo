/* Abstraction.....*/
abstract class Plane11{
    /*1. abstract method have not implementation
    * 2. if we declare method as abstract then class must be abstract
    * 3. we cannot create the object of abstract class
    * 4. abstract class can also have normal concrete methods or can have all concrete methods.
    * 5. we can have all the methods as abstract i.e. 100% abstraction
    * 6. instance variable cannot b3 abstract*/

    abstract public void flight_no();
    abstract public void takeoff();
    public void landing(){
        System.out.println("Plane1 should need long runway for landing");
    }
}
class PassengerPlane11 extends Plane11{
    public void flight_no(){
        System.out.println("Plane flight no is 54536");
    }
    public void takeoff(){
        System.out.println("PassengerPlane11 are ready  to takeoff");
    }
}
class CargoPlane11 extends Plane11{
    public void flight_no(){
        System.out.println("CargoPlane11 flight no is 547752");
    }
    public void takeoff(){
        System.out.println("CargoPlane11 are ready to takeoff...");
    }
}
public class AbstractionPractice1 {
    public static void main(String[] args){
//        Plane11 ref = new Plane11(); /* we cannot create object of abstract class as it has not implementation part*/
        /* we can create ref of abstract class*/
        Plane11 rf = new PassengerPlane11();
        rf.landing();
        rf.flight_no();
        rf.takeoff();

        rf = new CargoPlane11();
        rf.takeoff();
        rf.takeoff();
    }
}
