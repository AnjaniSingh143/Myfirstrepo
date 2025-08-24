import java.util.ArrayList;

class Student21{
    private String name;
    private int age;
    private int marks;

    public Student21(String name, int age, int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
//    public Students211(String name, int age, int marks){
//        this.name=name;
//        this.age=age;
//        this.marks=marks;
//    }

    public void getName(String name){
        this.name=name;
    }
    public void getAge(int age){
        this.age=age;
    }
    public void getMarks(int marks){
        this.marks=marks;
    }
}
public class Collections4 {
    public static void main(String... args){

        Student21 s1 = new Student21("Anjani", 21, 90);
        Student21 s2 = new Student21("Sneha", 20, 80);
        Student21 s3 = new Student21("Anshu",21,85);

        ArrayList<Student21> ar = new ArrayList<Student21>();
        ar.add(s1);
        ar.add(s2);
        ar.add(s3);
//        ar.add("dje");    // we cannot add another object as ar is of Student21 type----> cincept of Generics...
        System.out.println(ar);


    }
}
