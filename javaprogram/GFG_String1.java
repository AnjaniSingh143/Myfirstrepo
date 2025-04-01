public class GFG_String1 {
    public static void main(String args[]){
        //program to print even length words
        String s1 = "There is a even words in this sentence";

        for (String w : s1.split(" ")){
            if (w.length() % 2==0){
                System.out.println(w);
            }
        }

        String name = "Anjani Singh";
        System.out.println(name.charAt(2));


//      program to insert string in another string
            //method 1
        StringBuffer s2 = new StringBuffer("GeeksGeeks");
        s2.replace(5,10,"ForGeeks");
        System.out.println(s2);
            //method 2

        String st1 = "GeeksGeeks";
        String newstr= "";
        for (int i=0; i<5; i++){
            newstr += st1.charAt(i);
        }
        newstr += "For";
        for (int i=5; i<st1.length(); i++){
            newstr += st1.charAt(i);
        }
        System.out.println("New String : "+newstr);




    }
}
