//inform the compiler plz search for ArrayList in class "java.util"
import java.sql.SQLOutput;
import java.util.ArrayList; //explicit import
import java.util.*;     // implicit import
import java.sql.Date;

import java.lang.Math;  // normal import
import static java.lang.Math.sqrt;      // static import
import static java.lang.Math.random;

import static java.lang.Math.*;     // valid
import static java.lang.Integer.*;
class Student123 extends java.util.ArrayList{

}

public class ImportStatement {
    public static void main(String... args){
        java.util.ArrayList ref = new java.util.ArrayList(); /* use it instead of importing..
                                                                fully qualified path*/
        ArrayList ref1 = new ArrayList();

        Date d = new Date(2000,05,8);
        System.out.println(d);

        System.out.println(sqrt(5));    //for static import
                                        /* not need to use Class name for static import*/

        System.out.println(Math.max(15,16));    //for normal import

        System.out.println(random());

        System.out.println(MAX_VALUE);
        System.out.println(MIN_VALUE);


        /*javac ====> search for the required class information in
        *               a. current working directory
        *               b. Did the programmer specified where the class is available*/
    }
}
