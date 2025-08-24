import java.util.Vector;
import java.util.Enumeration;
public class Collections5 {
    public static void main(String... args){
        /*Vector Concept : ---
        *   All methods of Vector classes are synchronized  i.e. one thread can be accessable only one at a time
        *   Legacy classes :
        *       used when thread safety-built-in required and performance is overheaded.
        *   Index-based accessing
        *   duplicates and null value allowed
        *   Insertion-order maintained.
        *   Dynamic sizing...*/

        Vector vt = new Vector();
        vt.add(523);
        vt.add(642);
        vt.add(665);
        vt.add(656);
        vt.add(5656);
        vt.add("skd");
        
        System.out.println(vt);
        
        /*Enumeration is only for Vector classes
        *       Used in place of Iterator...*/
        
        Enumeration em = vt.elements();
        while(em.hasMoreElements()){
            System.out.println(em.nextElement());
        }
    }
}
