abstract class Computer{
    // we can also use innerclass inside the method.....
    // like we use in the main method --> anonimous inner class
    abstract public void config();
}
class AdvComputer extends Computer{     //this is for overrinding the  method
    public void config(){

        System.out.println("AdvComputer is confiig.......");
    }
}
class SuperComputer extends Computer{   // for implementing
    public void config(){
        System.out.println("SuperComputer is config...");

    }
}
public class Innerclass1 {
    public static void main(String[] args){
        AdvComputer ref = new AdvComputer(){    //Anonimous inner class [no name]
            public void config(){   //overridden method
                System.out.println("Its perefectly working...");
            }
        };
        ref.config();


    }
}
