/* scene behind the new keyword...........

new will create memory on the heap area
* JVM will search for Student12.class file in the current working directory
* ,if found load the .class data to method area
*   During the loading of .class file
*       a. static variable will get the memory set with default value
*       b. static block get executed
*  in the heap area, for the required object memory for instance variable is given
* JVM will set the default values to it.
*   a. Execute the instance block if available.
*   b. call the constructor to set the meaningful values to the instance variables.
*
* JVM will give the address of the object to hashing algorithm which generates the hashcode
* for the object and that hashcode will be returned s the reference to the programmer.*/
class Student12{
    static int i;
    String name;
    static{
        i=10;
        System.out.println("Value of i "+i);
    }
    public Student12(){
        System.out.println("Contructor with zero para...");
    }
    public Student12(String name){
        this.name=name;
        System.out.println("Student name is "+name);
    }
}
public class Newkeyword1 {
    public static void main(String... args) throws ClassNotFoundException,InstantiationException,IllegalAccessException{
//        Student12 ref = new Student12("Anjani Singh");  // instead of it...

        // Take the input of the the class name for which object should be created at the runtime
        String classname = args[0];

        //load the class file explicitly
        Class c = Class.forName(classname);

        //for the loaded class object is created using zero parameterize constructor only
        Object obj = c.newInstance();   // should compulsorily contains no arg. constructor.. for this
//        Object obj1 = c.newInstance("Anajni");

        //perform type casting to get Student13 object
        Student12 ref = (Student12)obj;
        System.out.println(ref);


        /*new ==> required class name known to compiler but not available at jvm,
                    then it would result in "ClassNotDefExceptio"
          newInstance() ==> required class details not available at jvm, then it would
                            result in "ClassNotFoundException"*/
    }
}
