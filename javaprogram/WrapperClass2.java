/*AutoBoxing => primitive to wrapper object, automatically by compiler
* AutoUnboxing => wrapper Object to primitive*/
public class WrapperClass2 {
    static Integer x1 = 10; //AutoBoxing
            /*behind the scene -- Integer x1 = Integer.ValueOf(10); */
    public static void main(String[] args){
        // AutoBoxing and AutoUnboxing
        int x2 = x1;    //AutoUnboxing
                /*behind the scene -- x1.intValue(); */

        m1(x2);


        //Case 2:
        Integer i1 = Integer.valueOf("55");
        Integer i2 = Integer.valueOf("55");
        System.out.println(i1==i2); //true --> matches address
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        Character i3 = Character.valueOf('d');
        Character i4 = Character.valueOf('d');
        System.out.println(i3==i4);
        System.out.println(i3.hashCode());  //100
        System.out.println(i4.hashCode());  //100

        int i5 = 55;
        System.out.println(i1==i5); //true-- same object

        Integer i6 = Integer.valueOf("1000");
        Integer i7 = Integer.valueOf("1000");   // it will create new object as value out of range
        System.out.println(i6==i7);   //false --> out of range ( -128 to 127 )



    }
    public static void m1(Integer x){   //AutoBoxing
        int k = x;              //AutoUnboxing
        System.out.println(k);  //10
    }
}
