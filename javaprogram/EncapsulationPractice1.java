class Employees{
    // if all the data members are private in a class, this class is known as "Bean".
    private int age;        // instance variable, Data members, Fields,
    private String name;
    private String city;

//    void setName(String a){
//        name=a;
//    }
    void setName(String name){
        this.name=name;             // if this keyword is not provide, it leads to shadwoing problem
    }                                   // if local variable and instance variable conflict
    void setAge(int age){
        if(age>0){
            this.age=age;
        }
        else{
            System.out.println("Provide valid age!");
        }
    }
    void setCity(String city){
        this.city=city;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getCity(){
        return city;
    }

}

/*Encapsulation ---> Data privacy, Data hiding, Binding,
                     Providing controlled access to data members
                     using private, setter, getters.....*/

public class EncapsulationPractice1 {
    public static void main(String[] args){
        Employees st = new Employees();
//        st.age=27; // we can access outside the class if not private
//        st.name="Anjani";  //error becz it is private

        st.setName("Anjani Singh");
        st.setAge(24);
        st.setCity("Patna");
        System.out.println(st.getName());
        System.out.println(st.getAge());
    }
}
