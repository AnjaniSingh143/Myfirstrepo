class Student2{
    private String name;
    private int age;
    private String city;
//    public void setData(String name, int age, String city){
//        this.name=name;
//        this.age=age;
//        this.city=city;
//    }
    //.....Instead of this setter method we use Constructor.....
    /* ------->Constructor is special type of method
        ------->there is no return type of constructor
        ------->Constructor is calling at the time of instantiation or object creation OR there is need of calling at the object creation
        -------> all the action can perform in the constructor that is perform in the method*/
    public Student2(String name, int age, String city){  //Constructor
//        super(); // it will call parent class constructor  / if there is no super method at first line
                                                                // jvm will invoke it by default
        this();  // it will call the same class constructor with zero parametarize i.e it will call line no. 26
        System.out.println("......Details of Student (Constructor-1).....");
        this.name=name;
        this.city=city;
        this.age=age;
    }
        // note:- this is called constructor chaining... by using this()
    //Constructor overloading...
    public Student2(){
            //Note:- this() and super() method must be at first statement.....
        this("Shashank");  // it will call the line no. 34
        System.out.println("....Detail of Student (Constructor-2)");
        name="Shubham";
        age=35;
        city="Delhi";
    }
    public Student2(String name){
        this("Anil",26);
        System.out.println("....Detail of Student (Constructor-3)");
        this.name = name;
        city = "Mumbai";
    }
    public Student2(String sa, int b, String sshd, int as){
        System.out.println("This is unusual constructor...");
        city = "Pune";
    }
    public Student2(String name, int age){
        this("adbd",45,"ahds",53);
        System.out.println("....Detail of Student (Constructor-4)");
        this.name = name;
        this.age= age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCity(){
        return city;
    }
}
class School{
    private String name;
    private String city;
    private int number;

    public School(){
        this("M.P.S. Academy");  /* this will call all the objects of same class Constructor
                                            with String type parameter i.e. School(String name).
                                        */
    }
    public School(String name){
        System.out.println();
        System.out.println("...Detail of School...");
        this.name=name;
        this.city="Hajipur";
        this.number=54686461;
    }
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    public int getNumber(){
        return number;
    }
}
public class EncapsulationPractice2 {
    public static void main(String[] args){
        Student2 st = new Student2("Anjani Singh", 24, "Patna");
        System.out.println(st.getName());
        System.out.println(st.getAge());
        System.out.println(st.getCity());

        Student2 st1 = new Student2();
        System.out.println(st1.getName());
        System.out.println(st1.getAge());
        System.out.println(st1.getCity());

        Student2 st2 = new Student2("pandey");
        System.out.println(st2.getName());
        System.out.println(st2.getAge());
        System.out.println(st2.getCity());

        Student2 st3 = new Student2("Durgesh",22);
        System.out.println(st3.getName());
        System.out.println(st3.getAge());
        System.out.println(st3.getCity());

        School sc = new School();
        System.out.println(sc.getName());
        System.out.println(sc.getCity());
        System.out.println(sc.getNumber());

//        School sc1 = new School("M.P.S.");




    }
}
