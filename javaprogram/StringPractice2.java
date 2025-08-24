import java.util.*;
//import java.util.TreeSet;

class Employee implements Comparable<Employee>{
    int eid;
    String ename;
    //Constructor
    Employee(int eid,String ename){
        this.eid=eid;
        this.ename=ename;
    }
    @Override
    public String toString(){
        return eid+ "---->"+ename;
    }
    public int compareTo(Employee e1){
        return Integer.compare(this.eid,e1.eid);
//            int eid1 = this.eid;
//            Employee e1 = (Employee)obj;
//            int eid2 = e1.eid;
//
//            if (eid1<eid2)
//                return -1;
//            else if (eid1>eid2)
//                return +1;
//            else return 0;
    }

    @Override
    public int compareTo(Object obj) {
        return 0;
    }
}
public class StringPractice2 {
    public static void main(String[]  args){
        TreeSet<Employee> t = new TreeSet<>();

        Employee em = new Employee(111, "Anjani");
        Employee em1 = new Employee(112, "Durgesh");
        Employee em2 = new Employee(113, "Shubham");
        Employee em3 = new Employee(100,"Shashank");
        Employee em4 =new Employee(212, "Himanshu");
        Employee em5 = new Employee(88, "Priti");
        t.add(em);
        t.add(em1);
        t.add(em2);
        t.add(em3);
        t.add(em4);
        t.add(em5);
//        t.add(em);
        System.out.println(t);
    }
}
