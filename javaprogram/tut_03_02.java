/*String and its methods */
import java.util.Scanner;
public class tut_03_02{
    public static void main(String[] args){
        /*two methods to initialised String */
        String name = new String("Anjani singh is a B.Voc student.");
        String name1 = "Anjani Singh";
        int a = 85;
        float b = 546.02f;
        System.out.println(name);
        System.out.println(name1);

        System.out.printf("The two number is %d and %f\n",a,b,"\n");
        System.out.printf("The two number is %5d and %10.2f\n",a,b,"\n");/*to print white space before  */

        Scanner sc = new Scanner(System.in);
        String st = sc.next();/*to print first char before space */
        String sti = sc.nextLine();/*to print all the character */
        System.out.println(st);
        System.out.println(sti);

        int value = name1.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String upstring= name1.toUpperCase();
        System.out.println(upstring);


        String name2 = "  Anjani Singh  is a B.voc student. ";
        String trim1 = name2.trim();/*to delete space before and after */
        System.out.println(name2);
        System.out.println(trim1);

        /*to return a substring from start to the end Substring
        [note : that index start from 0] */
        System.out.println(name1.substring(2));

        /* to return a substring from start index to the end index
        . Start index is included and end index is excluded.*/
        System.out.println(name1.substring(2,6));

        System.out.println(name1.replace('A','P'));
        System.out.println(name.replace("Anj","Kan"));

        System.out.println("Is the string start with Anj : "+name.startsWith("Anj"));
        System.out.println("Is the string end with p : "+name.endsWith("p"));

        System.out.println("The character at 4th index is "+name.charAt(4));/*return character at a given
        index  */
        System.out.println("Position of a is "+name.indexOf("a"));/*return the index of the given string */
        System.out.println("Position of n after 2nd index is "+name.indexOf("n",2));/*return the index of a given string from 
        starting the given index */
        System.out.println("The last posiion of i is : "+name.lastIndexOf("i"));/*returns the last 
        index of the given string */

        /*Note:- while count index it also count white spaces. */
        System.out.println("The last position of j before 2nd index is  "+name.lastIndexOf("j",2));/*return the last
        index of the given string before the given index */
        System.out.println(name.equals("anjani singh"));/*return true if the given string
        is equal to false otherwise[case sensitive ignore] */

        System.out.println("I am scape sequence \" double quote");

        /*Scape sequences: */
        //:1. \t -> insert a tab in the text at this point
        //:2. \b-> insert a backspace in the text at this point.
        //3. \r->  insert a carriage return in the text at this point.

        System.out.println(" To insrt carriage\r is  ");

        //4. \f -> Insert a formfeed in the text at this point.                
        System.out.println("HI, This side Anjani \f Singh");

        //5. \' -> Insert a single quote character in the text at this point.
        //6. \" -> Insert a double quote character in the text.
        //7. \\ => Insert a backslash character in the text.

        // int len = name1.length();
        for (int i = name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }
        System.out.println();
        String m =String.valueOf(556);
        System.out.println(m);
        System.out.println(m.getClass());
        // String p = "Apple";
        // System.out.println(p.toUpperCase(Locale 2));

    }
}