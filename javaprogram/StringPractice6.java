import java.util.Arrays;

public class StringPractice6 {
    public static void main(String[] args){

        // check strings are anagram or not.....---> both string are of same alphabet
        String ss = "agentleman";
        String ss2 = "elegantman";

        ss = ss.toLowerCase();
        ss2 = ss2.toLowerCase();

        char[] m = ss.toCharArray();
        char[] n = ss2.toCharArray();

        Arrays.sort(m);
        Arrays.sort(n);

        if(Arrays.equals(m,n)){
            System.out.println("It is anagram.");
        }
        else{
            System.out.println("It is not anagram.");
        }

        /// check for Panagram ---> strings should contains all alphabet character
        String ss3 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

        ss3 = ss3.replace(" ", "");
        char[] pan = ss3.toCharArray();
        int[] arr = new int[26];
        boolean flag = false;
        for(int i=0; i<pan.length; i++){
            int index = pan[i]-65;
            arr[index]++;
        }
        for (int i=0; i<arr.length; i++){
            if(arr[i]==0){
                flag=true;
            }
        }
        if (flag==true){
            System.out.println("It is not pangram.");
        }
        else{
            System.out.println("It is pangram");
        }


    }
}
