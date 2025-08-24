/*---HAS-A Relationship---*/
//Target Object...
class Employee12{   //target class
    String ename;
    int empId;
    String emptype;
    /* HAS-A relation*/
    Account account;
    //constructor injection...........
    public Employee12(String ename,int empId, String emptype,Account account){
        this.ename=ename;
        this.empId=empId;
        this.emptype=emptype;
        this.account=account;       //HAS-A relation within a constructor...
    }
    public void disp(){
        System.out.println("Employee Details...............");
        System.out.println("==================================");
        System.out.println("EMP_NAME   ::"+ename);
        System.out.println("EmpID      ::"+empId);
        System.out.println("EMP_TYPE   ::"+emptype);
        System.out.println("Account Details.................");
        System.out.println("==================================");
        System.out.println("A/C no.  :: "+account.acc_no);
        System.out.println("A/c type :: "+account.acc_type);
        System.out.println("A/C name :: "+account.acc_name);
        System.out.println();
    }

}
/* `Dependant object */
class Account{
    int acc_no;
    String acc_type;
    String acc_name;
    public Account(int acc_no, String acc_type, String acc_name){
        this.acc_no=acc_no;
        this.acc_type=acc_type;
        this.acc_name=acc_name;
    }

}
//for 1:M relation......
//Depandant object...
class Employee121{
    String emp_name;
     int emp_code;
    String city;
    public Employee121(String emp_name, int emp_code, String city){
        this.emp_name = emp_name;
        this.emp_code = emp_code;
        this.city = city;
    }
}
//Target object...
class Department121{
    private String dep_name;
    private String dep_type;
    private int emps;

    /*HAS_A relation (1:M)*/
    private Employee121[] emp;
    //constructor injection.....
    public Department121(String dep_name, String dep_type, int emps, Employee121[] emp){
        this.dep_name = dep_name;
        this.dep_type = dep_type;
        this.emps = emps;
        this.emp = emp;
    }
    public void disp(){
        System.out.println("Department Details..........");
        System.out.println("DEP_Name   :: "+dep_name);
        System.out.println("Dep_type   :: "+dep_type);
        System.out.println("NoOfEmp    :: "+emps);
        System.out.println("Employees Details...........");
        for (Employee121 employee : emp){
            System.out.println("Emp_name   :: "+employee.emp_name);
            System.out.println("Emp_code   :: "+employee.emp_code);
            System.out.println("Emp_city   :: "+employee.city);
            System.out.println();
        }
    }
}
public class HAS_A_relation {
    public static void main(String[] args){
        Account account = new Account(1384131646,"saving","SBI");
        Employee12 employee = new Employee12("Anjani",439588,"developer",account);
        employee.disp();        //1:1 relation....


        //1:M
        Employee121 ep1 = new Employee121("Anjani Singh",1738,"Hajipur");
        Employee121 ep2 = new Employee121("Shashank",2333,"Patna");
        Employee121 ep3 = new Employee121("Kundan",1323,"Varanasi");
        Employee121[] ref = new Employee121[3];
        ref[0]=ep1;
        ref[1]=ep2;
        ref[2]=ep3;

        Department121 dep = new Department121("Accountant","finance",23,ref);
        dep.disp();



    }
}
