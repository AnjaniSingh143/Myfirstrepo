import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map1 {
    public static void main(String... args){
        /*Concept of Map
        *       when key-value data is there, go with map
        *       commonly used class is HashMap, TreeHashMap
        *       it is not part of Collection hierarchy*/

//        Map hm = new HashMap();     // loosely coupled

        //jdk 1.2
        // it doesnot preserved order of insertion
        HashMap hm = new HashMap();
        hm.put(10, "Sachin");
        hm.put(7, "MSD");
        hm.put(18, "Kohli");
        hm.put(45, "Rohit");
        System.out.println(hm);

        //jdk 1.4
        // maintained order of insertion
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(10,"Sachin");
        lhm.put(7, "MSD");
        lhm.put(18,"Kohli");
        lhm.put(45,"Rohit");
        System.out.println(lhm);

        System.out.println("***********************");
        System.out.println("************************");

        Collection c = hm.values();
        Iterator itr = c.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("***********************");
        System.out.println("***********************");

        Set s = hm.keySet();
        Iterator itr1 = s.iterator();
        while(itr1.hasNext()){
//            System.out.println(itr1.next());
            System.out.println("Key : "+itr1.next());
        }

        System.out.println("***********************");
        System.out.println("***********************");

        Set cc = hm.entrySet();
        Iterator itr2 = cc.iterator();
        while(itr2.hasNext()){
//            System.out.println(itr2.next());
            Map.Entry entry = (Entry) itr2.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("***********************");
        System.out.println("************************");

        Set cc2 = lhm.entrySet();
        Iterator itr3 = cc2.iterator();
        while(itr3.hasNext()){
            Map.Entry entry = (Entry) itr3.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
