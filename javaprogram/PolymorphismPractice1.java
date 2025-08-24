/*Run time Polymorphism*/
class Plane1{
    public void takeOff(){
        System.out.println("Plane is ready to takeoff");
    }
    public void landing(){
        System.out.println("Plane is ready for landing");
    }
    public void fly(){
        System.out.println("Plane is ready to fly.");
    }
}
class CargoPlane1 extends Plane1{
    public void fly(){
        System.out.println("cargoPlane is ready to fly");
    }
    public void run(){
        System.out.println("CargoPlane running on the track");
    }
}
class FighterPlane extends Plane1{
    public void fly(){
        System.out.println("Fighter Plane is ready to fly");
    }
}
class PassengerPlane1 extends Plane1{
    public void fly(){
        System.out.println("Passenger Plane is ready to fly");
    }
}
class Airport{
    public void call(Plane1 ref){
        ref.fly();
        ref.landing();
        ref.takeOff();
//        ref.run();
    }
}
public class PolymorphismPractice1 {
    public static void main(String[] args){
        /*tight coupling*/
//        CargoPlane1 f1 = new CargoPlane1();/*
        FighterPlane f2 = new FighterPlane();
//        PassengerPlane1 f4 = new PassengerPlane1();*/
        Plane1 ref = new CargoPlane1();

        Airport f3 = new Airport();
        f3.call(ref);
        f3.call(f2);    /* 1:M */
//        f3.call(f4);

//        /* this loose coupling
//        * And called Run-time Polymorphism*/
//        Plane1 ref;
//        ref=f1;
//        ref.landing();  // 1:M
//        ref.takeOff();
//        ref.fly();
//
//        ref = f2;
//        ref.fly();
//        ref.landing();  // 1:M
//        ref.takeOff();


    }
}
