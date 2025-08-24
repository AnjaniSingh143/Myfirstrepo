import java.util.*;

public class Collections2 {
    public static void main(String[] args){
        ArrayList lt = new ArrayList();
        lt.add(52);
        lt.add(85.02);
        lt.add('a');
        lt.add("Anjani singh");
        lt.add(52.0f);
        lt.add(lt);
        System.out.println(lt);

        LinkedList lt1 = new LinkedList();
        lt1.add(10);
        lt1.add(40);
        lt1.add(30);
        lt1.add(20);
        lt1.add(50);
        lt1.add(60);
        System.out.println(lt1);
        System.out.println("********************");

        /*printing on the console is not accessing the element
        *   There are many ways to access element from Collections*/

        // only for List type collections
        // 1. for-loop
        for (int i=0; i<lt.size(); i++){
            System.out.print(lt.get(i)+", ");
        }
        System.out.println();

        //2. for-each loop
        for (Object obj : lt1){
            System.out.print(obj+", ");
        }
        System.out.println();

        //3. Iterator
        System.out.println("Using Iterator");
        Iterator it = lt1.iterator();
        while(it.hasNext()){
//            Integer i = (Integer) it.next();
//            Object o = it.next();
            System.out.println(it.next());
        }
        
        System.out.println("For reverse order");
        //ListIterator --> for reverse order
        ListIterator rt = lt1.listIterator();
        while(rt.hasPrevious()){
            System.out.println(rt.previous());


        }

        /*If List type is not , then accessing through Iterator
        *   index based accessing is not allowed so, we use iterator()
        *
        * get() method is not present */

        TreeSet tr1 = new TreeSet();
        tr1.add(45);
        tr1.add(52);
        tr1.add(60);
        tr1.add(90);
        tr1.add(50);
        tr1.add(21);
        System.out.println(tr1);


        Iterator i = tr1.iterator();
        while(i.hasNext()==true){
            System.out.println(i.next());
        }

        Iterator t = tr1.descendingIterator();
        while(t.hasNext()){
            Integer ob = (Integer) t.next();
            System.out.println(ob);
        }
        // descendingIterator is aviable only for three classes
                // LinkedList, ArrayDequeue, TreeSet

    }
}
