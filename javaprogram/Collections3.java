import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class Collections3 {
    public static void main(String[] args){
        //tight coupling
        ArrayList li = new ArrayList();

        //Loose coupling
        List lit = new ArrayList();
        Queue qu = new PriorityQueue();
        Set st = new TreeSet();


        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(66);
        list.add(58);
        list.add(56);
        list.add(69);

//        for (int i =0; i<list.size(); i++){
//            System.out.println(list.get(i));
//            list.add(50);   // infinte loop
//        }

        //failed fast
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
//            list.add(60);           // ConcurrentModificationException
        }

        //failed safe
            // failed but safely....
        CopyOnWriteArrayList listc = new CopyOnWriteArrayList();
        listc.add(200);
        listc.add(600);
        listc.add(210);
        listc.add(500);

        Iterator it = listc.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            listc.add(800);
        }

        System.out.println(listc);


        /*For sorting.......*/
        TreeSet tr = new TreeSet();
        tr.add(66);
        tr.add(633);
        tr.add(32);
        tr.add(61);
        tr.add(222);

        System.out.println(tr);

        ArrayList ar = new ArrayList();
        ar.add(62);
        ar.add(721);
        ar.add(81);
        ar.add(10);
        ar.add(522);
        ar.add(52);

        System.out.println(ar);

        Collections.sort(ar);
        System.out.println(ar);

        /*Note : Collections ---> class
        *         Collection ---> Interface*/


        ArrayList arr = new ArrayList();
        arr.add(52);
        arr.add("Anjani");
        arr.add('d');
        arr.add('A');
        arr.add(522.0);
        arr.add(625);

        //for this comparator or Compare...

        //Generics concept
        ArrayList<String> art = new ArrayList<String>();
        art.add("Anjani");
        art.add("Puspa");
        art.add("Michel");
        art.add("Sakil");

        Collections.sort(art);
        System.out.println(art);

        Collections.shuffle(art);
        System.out.println(art);

        System.out.println(Collections.frequency(arr, 52));

        int index = Collections.binarySearch(ar, 40);
        System.out.println(index);

        System.out.println(Collections.emptyEnumeration());;


    }
}
