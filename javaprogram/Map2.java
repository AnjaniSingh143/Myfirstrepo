import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;

class Students{
    private String name;
    private int age;
    private String city;
    private String gender;
    public Students(String name, int age, String city, String gender){
        this.name=name;
        this.age=age;
        this.city=city;
        this.gender=gender;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCity(){
        return city;
    }
    public String getGender(){
        return gender;
    }
    @Override
    public String toString(){
        return name +" "+age+" "+city+" "+gender;
    }
}
public class Map2 {
    public static void main(String... args){
        Students str1 = new Students("Anjani",21,"Patna","Male");
        Students str2 = new Students("Durgesh",20,"Kolkata","Male");
        Students str3 = new Students("Deepika",22,"Bengaluru","Female");

        HashMap hm = new HashMap();
        hm.put(1,str1);
        hm.put(2,str2);
        hm.put(3,str3);

        System.out.println(hm.toString());

        // There are different ways to access from hashmap...
        /*entrySet : -- it returns key-vale pair and return type is "Set"
        * keySet() : --  it return only keyset and return type is "Set"
        * values() : -- it return values only and return type is "Collection*/
        Collection t1 = hm.values();
        Iterator itr = t1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("****************");
        System.out.println("****************");

        Set t2 = hm.keySet();
        Iterator itr1 = t2.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        System.out.println("****************");
        System.out.println("****************");

        Set t3 = hm.entrySet();
        Iterator itr3 = t3.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }

        System.out.println("*************");
        System.out.println("***************");

        Collection cc = hm.values();
        Iterator itr4 = cc.iterator();
        while(itr4.hasNext()){
            System.out.println(itr4.next());
        }


    }
}
