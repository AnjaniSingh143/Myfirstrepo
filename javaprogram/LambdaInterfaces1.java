interface Demo13{
    void disp();
    void disp1();
}
//class Trial implements Demo13{      //normal ways to implement...
//    public void disp(){
//        System.out.println("Hello java!");
//    }
//    public void disp1(){
//        System.out.println("Hello java developer!");
//    }
//}

/* Functional interface==>
*                           interface having only one abstract method.
*                           functional interface and lambda expression work together.
*                           we cannot write lambda expression for interface having more than one abstract method
* Lambda operator ==> " -> "
* Lambda expression ==>
*                       (parameters) -> body*/
@FunctionalInterface
interface Demo14{
    void disp();
}
@FunctionalInterface
interface Calaculate {
    void calc(int... a);
}
public class LambdaInterfaces1 {
    public static void main(String... args){
//        Demo13 demo = new Demo13() {        //Anonimous inner class....
//            @Override
//            public void disp() {
//                System.out.println("Hello java!");
//            }
//            @Override
//            public void disp1(){
//                System.out.println("Hello java developer!");
//            }
//
//        };

        Demo14 d = () -> System.out.println("Hello Lambda expression!");
        Demo14 d1 = () -> {
            System.out.println("Hello java developer!");
            System.out.println("There is Lambda expression with Functional interface");
        };
        d.disp();
        d1.disp();


        Calaculate cal = (int[] a) ->{

            int total=0;
            for (int ele : a){
                total+=ele;
            }
            System.out.println("Sum = "+total);
        };
        cal.calc(new int[]{1,2,3,4,5});
    }
}
