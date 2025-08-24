public class WrapperClass1 {
    public static void main(String[] args){
        /*Wrapper class utility methods......
        * 1. valueOf() => string/ primitive to wrapper class object
        * 2. xxxvalue() => wrapper class object to primitive
        * 3. parsexxx() => string to primitive type*/
        Integer x1 = Integer.valueOf(24);
        System.out.println(x1);
        Character x2 = Character.valueOf('a');
        System.out.println(x2);

//        Float x3 = Floatvalue(Boolean.valueOf(true));
        System.out.println(x1.shortValue());
        System.out.println("Hashcode "+x2.hashCode());
        System.out.println(x1.floatValue());

        Boolean x4 = Boolean.parseBoolean("sjdkdj");
        System.out.println(x4);
        Integer x5 = Integer.parseInt("43");
        System.out.println(x5);

        //if value is in String and we have to use it in the primitive
        Integer x6 = Integer.parseInt("35");
        Integer x7 = Integer.parseInt("35");
        int sum = x6 +x7;
        System.out.println("Sum "+sum);

        Integer x22 = Integer.parseInt("100",5);    //binary to ....
        System.out.println("ParseInt (100,5) = "+x22);

        //command line argument
//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
////        System.out.println("comm sum : "+a+b); // String + int = Sting
//        //so for this
//        System.out.print("Command line result :");
////        System.out.println(a+b);

        // toString()
        //Objects
        String x8 = new String("246");
        System.out.println(x8.toString());  //hashcode in the case of object

        //wrapper class
        Integer x9 = Integer.valueOf("345");
        System.out.println(x9.toString()); // print conent
        Boolean x11 = Boolean.valueOf("ddf");
        System.out.println(x11.toString());

        //toString
        String x33 = Boolean.toString(true);
        System.out.println(x33);

        String result1 = Integer.toString(20,2);
        String result2 = Integer.toString(20,8);
        String result3 = Integer.toString(10,16);
        String result4 = Integer.toString(100,10);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        //instead
        String res1 = Integer.toBinaryString(25);
        String res2 = Integer.toOctalString(64);
        String res3 = Integer.toHexString(12);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);


    }
}
