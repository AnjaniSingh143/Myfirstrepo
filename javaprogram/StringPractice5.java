import java.sql.SQLOutput;

public class StringPractice5 {
    public static void main(String[] args) {
        //Constructor of StringBuffer

        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.length()); //no. of character stored == 0
        System.out.println(sb1.capacity()); //How many character can be store, ans =16

        sb1.append("sdfhueeufhshfurh");
        System.out.println(sb1.length()); // 16
        System.out.println(sb1.capacity()); //16

        sb1.append('j'); // if we add new character , it will increase its capacity
        System.out.println(sb1.length()); //17
        System.out.println(sb1.capacity());  // new capacity = (old capacity +1)*2

        StringBuffer sb2 = new StringBuffer(100); // capacity is 100 and length is 0

        StringBuffer sb3 = new StringBuffer("Anjani");
        System.out.println(sb3.length()); // 6
        System.out.println(sb3.capacity()); // capacity = length + default capacity

        StringBuffer sb4 = new StringBuffer("Hey! Good Morning.");
        System.out.println(sb4.charAt(4)); // it will also count space
        System.out.println(sb4.charAt(17));
        sb4.setCharAt(17,'!');
        System.out.println(sb4);

        StringBuffer sb5 = new StringBuffer("SachinRameshTendulkar");
        System.out.println(sb5);
        sb5.insert(21,"10");
        System.out.println(sb5);
        sb5.delete(6,12);
        System.out.println(sb5);
        sb5.deleteCharAt(8);
        System.out.println(sb5);
        sb5.setLength(6);
        System.out.println(sb5);
        sb5.setCharAt(0,'s');
        System.out.println(sb5);

        StringBuffer sb6 = new StringBuffer(1000);
        System.out.println(sb6.capacity());
        sb6.append("sachin");
        System.out.println(sb6.capacity()); // it is wastage of memory location --1000

        sb6.trimToSize(); // trim capacity to length
        System.out.println(sb6.capacity());

        StringBuffer sb7 = new StringBuffer("\"kohli\"");
        System.out.println(sb7);
//        sb7.append("kohli");
        System.out.println(sb7.capacity()); // default capacity + length of string = 16+7


        //Method chaining........
        String  sb8 = "Anjani";
        String name = sb8.concat("Singh");
        System.out.println(name);
        int len = name.length();
        System.out.println(len);

        //method chaining
        System.out.println(sb8.concat("Kumar").length());

        StringBuffer sb9 = new StringBuffer("Mahendra");

        //method chaining
        sb9.append("Singh")
                .insert(sb9.length(),"Dhoni").
                reverse().
                append("CSK").
                append("7").reverse().delete(1,4);
        System.out.println(sb9);


        //convert string into uppercase
        String name1="anjnai";
        String newnam ="";
        for(int i=0; i<name1.length(); i++){
            newnam+=(char)(name1.charAt(i)-32);
        }
        System.out.println(newnam);

        //convert iNeUrOn to InEuRoN

        String ss = "iNeUrOn";
        String ss1 = "";
        for(int i=0; i<ss.length(); i++){
            if(ss.charAt(i)>='a' && ss.charAt(i)<='z'){
                ss1 += (char)(ss.charAt(i)-32);
            }
            else ss1+= (char)(ss.charAt(i)+32);
        }
        System.out.println(ss);
        System.out.println(ss1);

        //for reversing string.........
//        String ss2 = "ineuron";
        String ss2 = "iNeUrOn Java";
        String ss3 = "";
        for (int i=ss2.length()-1; i>=0; i--){
            ss3+=ss2.charAt(i);
        }
        System.out.println(ss3);

        //input = ineuron Java,  o/p = norueni avaJ
        String ss4 = "ineuron Java";
        String ss5 = "";
        for (String w :ss4.split(" ")) {
            for(int i=w.length()-1; i>=0; i--){
                ss5+= w.charAt(i);
            }
            ss5 += " ";
        }
        System.out.println(ss4);
        System.out.println(ss5);






    }
}
