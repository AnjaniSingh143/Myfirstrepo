import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    public static void main(String... args){
        // ArrayList................
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
        System.out.println("************************");

        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add("Anjani");
        al1.add(15.25);
        System.out.println(al1);
        System.out.println("**************");

        // we can also copy object of an arraylist to another
        ArrayList al2 = new ArrayList();
        al2.addAll(al1);
        System.out.println("******************");

        al2.add(2,654);
        System.out.println("After add at index 2 "+al2);
        System.out.println("**************************");

        al2.add(0,"Elon");
        System.out.println("After add at first "+al2);
        System.out.println("******************");

        al2.add("xyz");
        System.out.println("after adding at rear end "+al2);

        //LinkedList...........
        LinkedList l1 = new LinkedList();
        l1.add(45);
        l1.addAll(al2);
        System.out.println(l1);
        System.out.println("************************");

        l1.addFirst("FirstElement");
        l1.addLast(54876);
        System.out.println(l1);

        System.out.println("****************");
        System.out.println(al2.contains(556));

        System.out.println(al2.isEmpty());
        System.out.println(al2.getClass());

        System.out.println(al2.size());

        al2.ensureCapacity(10);
        System.out.println(al2.size());

        al2.clear();
        System.out.println(al2);
        System.out.println(al2.size());

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");


        LinkedList ll1 = new LinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(40);
        ll1.add(30);
        ll1.add(50);
        ll1.add(40);

        System.out.println(ll1);
        System.out.println(ll1.indexOf(40));
        System.out.println(ll1.lastIndexOf(40));

//        ll1.addFirst(5);
//        System.out.println(ll1);
//        ll1.addLast(55);
//        System.out.println(ll1);

        ll1.offerFirst(5);
        System.out.println(ll1);
        ll1.offerLast(55);
        System.out.println(ll1);


        System.out.println(ll1.peek());

        System.out.println(ll1.peekFirst());    // extract copy of first element and no changes in the list
        System.out.println(ll1);

        System.out.println(ll1.pollFirst());    // extract first element and remove from the list
        System.out.println(ll1);


        //ArrayDeque
        /*no index based access
        * doubly Deque
        * duplicats allowed*/

        ArrayDeque dd = new ArrayDeque();
        dd.add(56);
        dd.add("Hyder");
        dd.add(635.0);
        dd.add(42);
        dd.add(42);

        System.out.println(dd);

        dd.addFirst(52);
        dd.addLast(45);
        System.out.println(dd);

        System.out.println();
        dd.pop();
        System.out.println(dd);



    }
}
