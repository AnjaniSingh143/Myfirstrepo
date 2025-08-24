import java.util.Comparator;
import java.util.TreeSet;

// Employee class without Comparable
class Employee1 {
    int eid;
    String ename;

    // Constructor
    Employee1(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    @Override
    public String toString() {
        return eid + " ----> " + ename;
    }
}

// Custom Comparator to sort by Employee ID (eid)
class EmployeeComparator implements Comparator<Employee1> {
    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return Integer.compare(e1.eid, e2.eid);
    }
}

public class StringPractice3 {
    public static void main(String[] args) {
        // TreeSet with custom comparator
        TreeSet<Employee1> t = new TreeSet<>(new EmployeeComparator());

        t.add(new Employee1(111, "Anjani"));
        t.add(new Employee1(112, "Durgesh"));
        t.add(new Employee1(113, "Shubham"));
        t.add(new Employee1(100, "Shashank"));
        t.add(new Employee1(212, "Himanshu"));
        t.add(new Employee1(88, "Priti"));

        System.out.println(t);
    }
}
