import java.util.TreeSet;
import java.util.*;
interface Comparable<E> {
    int compareTo(Object obj);

    int compareTo(Employee e1);
}
class Demo extends Object implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2){
            //write the logic to sorting as per user requirement
        return 1;
    }
    public boolean equals(Object obj){
            return true;
    }
}
public class StringPractice1 {
    public static void main(String[] args){
        //JVM uses Comparable CompareTo to sort the Object added to TreeSet
        //Compulsorily the Object should implement Comparable otherwise ClassCastException
        TreeSet ts =new TreeSet(); //by using an interface called "comparable"
        ts.add("A");
        ts.add("K");
        ts.add("Z");
        ts.add("L");
        ts.add("B");

        //Sorting happened becoz String class implements Comparable interface
        // and sorted using CompareTo method
        System.out.println(ts); //{A,B,K,L,Z}
        System.out.println();

        TreeSet ts1 = new TreeSet(); //by using an interface called "Comparable"
        ts1.add(new StringBuffer("A"));
        ts1.add(new StringBuffer("K"));
        ts1.add(new StringBuffer("Z"));
        ts1.add(new StringBuffer("L"));
        ts1.add(new StringBuffer("B"));

        /*Sorting if it has to happen then that object should implement Comparable
        otherwise it would result ClassCastException* */
        System.out.println(ts1); //{A,B,K,L,Z}

        TreeSet ts2 =new TreeSet(); //by using an interface called "comparable"
        ts2.add("A");
        ts2.add("K");
        ts2.add("Z");
//        ts2.add(new Integer("L")); /* ClassCastException*/
        ts2.add("B");

        System.out.println("A".compareTo("Z")); //-ve as obj1 has to come before obj2
        System.out.println("Z".compareTo("K")); //+ve as ob1 has to come After obj2
        System.out.println("A".compareTo("A")); //0 as equal
        System.out.println("A".compareTo(null)); //Exception
    }
}
