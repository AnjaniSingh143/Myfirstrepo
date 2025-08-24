public class GFG_String3 {
    static boolean isrotation(String s1, String s2){
//        String m ="";
        for (int i=0; i<s2.length(); i++){
            s2= s2.charAt(s2.length()-1)+s2.substring(0,s2.length()-1);
            if(s2.equals(s1)){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(isrotation("abcd", "dabc"));
        String s1 = "abcd";
        String s2= "cdab";
        for(int i =0; i<s1.length(); i++){
            s2 = s2.charAt(s2.length()-1)+s2.substring(0,s2.length()-1);
            System.out.println(s2);
            if(s2.equals(s1)){
                System.out.println("matched");
                return;
            }
        }

    }
}
