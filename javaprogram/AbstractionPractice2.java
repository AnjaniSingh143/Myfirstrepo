import java.util.Scanner;

abstract class Shapes{
    Scanner sc = new Scanner(System.in);
    static float area;
    final float pi = 3.14f;
    abstract public void input();
    abstract public void compute();

}
class Circle extends Shapes{
    int radius;
    public void input(){
        System.out.print("Enter radius of circle :");
        radius = sc.nextInt();
    }
    public void compute(){
        area = pi * (radius * radius);
        System.out.println("Area of circle is "+area+" square meter");
    }
}
class Rectangle extends Shapes{
    int length;
    float breadth;
    public void input(){
        System.out.println("Enter the length of the rectangle");
        length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        breadth = sc.nextFloat();
    }
    public void compute(){
        area = length * breadth;
        System.out.println("Area of the rectangle is "+area+" square meter");

    }
}
class Cylinder extends Shapes{
    float radius;
    float height;
    public void input(){
        System.out.println("Enter the value of radius of cylinder");
        radius = sc.nextFloat();
        System.out.println("Enter the value of height of cylinder");
        height = sc.nextFloat();
    }
    public void compute(){
        area= 2 * pi * radius * ( radius + height);
        System.out.println("Total surface area of cylinder is "+area+" square unit");
    }
}
class Geometry{
    public void result(Shapes sp){
        sp.input();
        sp.compute();
    }
}
public class AbstractionPractice2 {
    public static void main(String[] args){
        Circle ref1 = new Circle();
        Rectangle ref2 = new Rectangle();
        Cylinder ref3 = new Cylinder();

        Geometry ref =new  Geometry();
        ref.result(ref1);
        ref.result(ref2);
        ref.result(ref3);

    }
}
