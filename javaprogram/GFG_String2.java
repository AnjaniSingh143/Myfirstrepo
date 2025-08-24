//import static jdk.internal.org.jline.utils.Colors.s;

public class GFG_String2 {
    static boolean ispalindrome(String s2){
//            String s = "abba";
        //method 1:
//        String s1 = "";
//        for (int i = s2.length() - 1; i >= 0; i--) {
//            s1+=(s2.charAt(i));
//        }
//        if (s2.equals(s1)) {
//            return true;
//        }
//        return false;
        // method 2....
        int left =0;
        int right = s2.length()-1;
        while(left<right){
            if(s2.charAt(left)!=s2.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String reverse(String s){
        String s1="";
        int left =0; int right = s.length()-1;
        while(left<=right){
            s1+=s.charAt(right);
            right--;
        }
        return s1;
    }
    public static void main(String[] args){
        String s2 ="abba";

        System.out.println(ispalindrome("abba"));;
        System.out.println(reverse("Geeks"));


    }
}
