/*Run-time Polymorphism*/
class Parent12{
    public void cry(){
        System.out.print("Parent12 is crying");

    }

}
class Child111 extends Parent12{
    public void cry(){
        System.out.println("Child111 is crying....");
    }
    public void eat(){          //Specializes mmethod/.....
        System.out.println("Child111 is hungery and wants some food.");
    }

}
class Child112 extends Parent12{
    public void cry(){
        System.out.println("Child112 is crying.....");
    }
    public void eat(){              //Specialized method....
        System.out.println("Child112 is also hungery and he also wants some food stubs....");
    }
}
public class PolymorphismPractice2 {
    public static void main(String[] args){
        Parent12 pp = new Child111();   //upcasting or loose_coupling
        pp.cry();
        Parent12 pp1 = new Child112();
        pp1.cry();


//        pp.eat();  /* directly from parent type ref you cannot access specialized method*/
        ((Child111)pp).eat();   //downcasting....
        ((Child112)pp1).eat();
    }
}
