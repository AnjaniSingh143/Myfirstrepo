import java.nio.charset.StandardCharsets;

public class StringPractice4 {
    public static void main(String[] args) {
        //API LEVEL
         //Application Programming Interface
            // API is the .class file and give it to the users and make uses the benefit of it.
            //OR
            //Some one wrote the code, he will give the .class file, end users use the benefits
                // Entire java we are learning as API only

            // If the method name and class name is same then it called as "Constructor"

        char[] ch={'j','a','v','a'};
        String s1 = new String(ch);
        System.out.println(s1); //java

        byte[] b = {65,66,67,68,69};
        String s2 = new String(b);
        System.out.println(s2); //ABCDE--> |Unicode

        StringBuffer sb = new StringBuffer("Sachin");
        System.out.println("Your StringBuffer data is "+sb);

        String s3 = new String(sb);
        System.out.println("Your string data  is "+s3);
        System.out.println(s1+" "+s3);

        //STRING methods
        String name = new String("Anjani Singh");
        byte[] a = {65,66,67,68};
        System.out.println(a.toString());
        System.out.println(name.length()); //11 + 1 ---> count space also
        System.out.println(name.getBytes(StandardCharsets.UTF_8));
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(2,8)); //2-7 --> end-1
//        System.out.println(name.toString());

        Student1 std = new Student1();
        System.out.println(std); //Student1@hashcode
    }
}
class Student1{
    String name="Anjani";
    int id = 45;
}
