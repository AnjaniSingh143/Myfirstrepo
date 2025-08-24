public class WrapperClass {
    public static void main(String[] args){
        // Wrapper Class
        int i = 33; //primitive type
        Integer x = 12;  //reference type

        /*Need --> to store primitive data to use utility methods*/

        //Utility methods......
        Integer x1 = Integer.valueOf(12);
        System.out.println(x1);
        Integer x2 = Integer.valueOf("23");
        System.out.println(x2);

//        Integer x3 = Integer.valueOf("Injnwef"); //RE
//        System.out.println(x3); // NumberFormatException

        Float x4 = Float.valueOf(15.0f);
        System.out.println(x4);
        Boolean x5 =Boolean.valueOf(true);
        System.out.println(x5);
        Boolean x6 = Boolean.FALSE;
        System.out.println(x6);

        Boolean x7 = Boolean.valueOf("dsdlk"); //false
        System.out.println(x7);

        Boolean x8 = Boolean.valueOf("TRUE");
        System.out.println(x8);
        System.out.println(x5.equals(x8));  // compare content
        System.out.println(x5 == x8);   // reference

        System.out.println(x6.equals(x7));

        /*Number System
        * base-2(binary),  base-8(octal),  base-10(Decimal),  base-16(hexadecimal)*/

        Integer x11 = Integer.valueOf("100",8);
        System.out.println(x11);
        System.out.println(Integer.valueOf("100",2));

        System.out.println(Integer.valueOf("1000",36));

        System.out.println("MAX_RADIX => "+Character.MAX_RADIX);
        System.out.println("MIN_RADIX => "+Character.MIN_RADIX);
    }
}
