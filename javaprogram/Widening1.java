public class Widening1 {
//    public static void m1(long i){
//        System.out.println("widening");
//    }
//    public static void m1(Integer i){
//        System.out.println("Autoboxing");
//    }
//    public static void m1(int... i){
//        System.out.println("Var-args");
//    }
    public static void m1(Long l){
        System.out.println("Long..");
    }
    public static void m1(Object o){
        System.out.println("Object class");
    }
    public static void main(String... args){
        int x =10; // primitive
        m1(x);  //primitive type --->do implicit typecasting ===>found----> m1(long i)
        int[] a = {10,20,30};
        m1(a);                  /*int ======> widening ===>long,float,double
                                              Autoboxing ==> Integer,Long
                                              widening ====> Number,Object*/
    }
}
