public class GFG_String4 {
    public static void main(String[] args){
        String s = "geeksforgeeks";
        char[] ch = s.toCharArray();
        li:for(int i=0; i<ch.length; i++){
            char point = ch[i];
                char left=ch[i];
                char right = ch[ch.length-1];
                while(left<right) {

                }
            for(int j=0; j<ch.length; j++){
                if(point != ch[j+1]){
                    System.out.println("First non-repeating character: "+point);
                    break li;
                }
            }
        }
    }
}
