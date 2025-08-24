class Plane{
    private void fly(int planeNo){
        System.out.println("Plane "+planeNo+" is ready to fly.");
    }
    public void takeOff(){
        fly(6327);      //  because this is private.....
        System.out.println("Planes are ready to takeoff.");
    }
    public static void carryGoods(){
        System.out.println("Plane are suitable for carry goods.");
    }
}
class CargoPlane extends Plane{
    protected void fly(){        // Overriding method....
        System.out.println("Cargo plane are ready to fly");
    }
    public void carryPass(){            // Specialized method...
        System.out.println("You can use your carryPass in cargoPlane.");
    }
    public void fueled(){               // Specialized method....
        System.out.println("Cargoplane is fueled.");
    }
}
class PassengerPlane extends Plane{
    public void takeOff(int planeno){          // Overrinding method....
        System.out.println("Passenger plane are ready to takeoff");
    }
    public void noofPassengers(){           // Specialized method....
        System.out.println("There are 100+ passengers in this plane.");
    }
}
public class InheritanceParactice3 {
    public static void main(String[] args){
        CargoPlane pl = new CargoPlane();
        pl.fly();
        pl.carryPass();
        pl.fueled();
//        pl.fly(2322);
        pl.takeOff();
        CargoPlane.carryGoods();  // static method....

        PassengerPlane pl1 = new PassengerPlane();
//        pl1.fly(6212);
        pl1.noofPassengers();
        pl1.takeOff();
        pl1.takeOff(234);

    }
}
