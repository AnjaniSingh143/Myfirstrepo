public class MethodOverloading{
    public static void main(String[] args){
        Overloading ov = new Overloading();
        int a =47; int b = 56; int c=67;
        float x =41.0f; float y=36f; float z=65.2f;
        double m=625.255; double n=53468.04123;
        ov.add();
        System.out.println(ov.add(a, b));
        System.out.println(ov.add(x,y));
        System.out.println(ov.add(m,n));
        System.out.println(ov.add(a, b, c)); // from here these are compile time polymorphism
        System.out.println(ov.add(x,y,z));   // ---- compiler check no. of parameters and discard all previous one
        System.out.println(ov.add(a, x, b)); // ---- then check datatype |(or sequence of data types).
        System.out.println(ov.add(m,n,c));

        MethodOverloading pr = new MethodOverloading();
        double p = 5868;
        pr.main(a);

    }
    // we can overload main method in java but JVM will call main method which have parameter -- String[] args
      // for calling it we have to create object of that main method.
    public static void main(int[] args){
        System.out.println("main method of int[] args parameters!");

    }
    public static void main( double a){
        System.out.println("double type main method.");
    }
}
class Overloading{
    int a ,b;
    // refer to process of making multiple methods with same name with different parameters within a class
    void add(){
        a=10; b=32;
        System.out.println(a+b);
    }
    int add(int a,int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    float add(float a, float b){
        return a+b;
    }
    float add(float a, float b, float c){
        return a+b+c;

    }
    float add(int a, float b, int c){
        return a+b+c;

    }
    double add(double a, double b){
        return a+b;
    }
    double add(double a, double b, int c){
        return a+b+c;
    }
}