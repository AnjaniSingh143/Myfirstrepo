class Vehicle1{
    int noofwheels;
    String company;
    final void run(){
        System.out.println("Vehicle is running at the average speed of 40 kmph.");
    }
}
//final class Vehicles{     /* final class does not participate in inheritance*/
//    void disp(){
//        System.out.println("There are several types of vehicles");
//    }
//}
class Bike extends Vehicle1{
    final int i=39;
    void disp(){
//        i=12;   // we cannot change final variable as it is contant
        System.out.println(i);
        System.out.println("This is Bike class");
    }

//    void run(){         /* final method can inherited but cannot overidden*/
//        System.out.println("Bike can run upto 120 kmph");
//    }
}

//class car extends Vehicles{   // final class cannot be inherit...
//
//}
public class Final {
    public static void main(String[] args){

    }
}
