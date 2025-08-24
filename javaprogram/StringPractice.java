public class StringPractice {
    public static void main(String[] args) {
        int x;
//        System.out.println(x);
//         we can declare with both the method
        String s1 = "Anjani";
        String s2 = new String("Anjani");

        String s3 = new String(" Singh");
        s1.concat(s3);  //Garbage collector in action
        System.out.println(s1); // return only Anjani as it is immutable
         // for this
        System.out.println(s1.concat(s3));
         //OR
        String name = s1.concat(s3);
        System.out.println(name);
         //OR use StringBuilder

        StringBuilder s4 = new StringBuilder("Sachin");
        StringBuilder s41 = new StringBuilder("Sachin");
        StringBuilder s5 = new StringBuilder(" tendulkar");
        s4.append(s5);
        System.out.println(s4);  //return Sachin tendulkar
        System.out.println(s5.length());


        System.out.println(s1 == s2); //false (both are refer to different object
        System.out.println(s1.equals(s2)); // true (compare content )

        System.out.println(s4==s41); //false
        System.out.println(s4.equals(s5)); // false ( compare reference)


    }
    }
