import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Collections1 {
    public static void main(String... args){
        // Priority Queue
        /*  comes under collection api or framework
        *   It followed min heap data structure follow...
        *   */

        PriorityQueue pq = new PriorityQueue();
        pq.add(52);
        pq.add(66);
        pq.add(100);
        pq.add(642);
        pq.add(84);
        pq.add(120);
        pq.add(66);

        System.out.println(pq); // it will print like min heap data structure....
                /*printing through normal is not be in priority queue.*/
        System.out.println(pq.spliterator());


        /*TreeSet
        *   if array need to be sorted in ascending order
        *   follow binary treeset datastructure
        * object should be same type*/

        TreeSet tr = new TreeSet();
        tr.add(50);
        tr.add(75);
        tr.add(100);
        tr.add(150);
        tr.add(25);
        tr.add(125);
        tr.add(175);
        System.out.println(tr);
        System.out.println("****************");
        System.out.println(tr.ceiling(50)); //gives nearest higher
        System.out.println(tr.higher(50));  //gives higher than
        System.out.println(tr.floor(50));   // gives nearest lower
        System.out.println(tr.lower(50));   //gives lower than
        System.out.println("****************");

        System.out.println(tr.ceiling(40));
        System.out.println(tr.higher(40));
        System.out.println(tr.floor(40));
        System.out.println(tr.lower(40));


        /*HashSet-----
        *   hash function and hash table
        *   searching is very very fast
        *   time complexity -- O(1)
        *   order of insertion is not maintain
        * */

        HashSet ht = new HashSet();
        ht.add(45);
        ht.add(12.0);
        ht.add('a');
        ht.add(14.5f);
        ht.add("Anjani");
        ht.add(1254);
        System.out.println(ht);
        System.out.println(ht.hashCode());;
        System.out.println("*************");

        /*Linked HashSet----
        *   subclass of HashSet
        *   Order of insertion maintained*/
        LinkedHashSet lt = new LinkedHashSet();
        lt.add(24);
        lt.add(65.02);
        lt.add('d');
        lt.add("Singh");
        lt.add(95.0f);
        System.out.println(lt);


    }
}
