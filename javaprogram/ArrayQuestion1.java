import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

/*You are given an array of integers. An element is a leader if it is greater than all the elements to its right. The rightmost element is always a leader.

Your task is to print all leader elements in the array in the order they appear from left to right in the original array.
input.........
16 17 4 3 5 2

output......
17 5 2

Explanation...
2 is a leader (last element).

5 > 2 → leader.

3 < 5, 4 < 5 → not leaders.

17 > all to its right → leader.

*/
class Leader{
    public static void leaderarr(){
        int[] arr = {16,17,4,3,5,2};

        int leader = arr[arr.length-1];

        ArrayList<Integer> list = new ArrayList<>();
        list.add(leader);

        for (int i=arr.length-2; i>=0; i--){

            if(arr[i]>leader){
                leader = arr[i];
                list.add(leader);
            }
        }

//        int[] ar = new int[list.size()];
//        int ind = list.size()-1;
//        for (int i=0; i<list.size(); i++){
//            ar[i]= list.get(ind);
//            ind--;
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(ar));
//        System.out.println(list);

        // instead of this...
        Collections.reverse(list);
        System.out.println(list);
    }
}
public class ArrayQuestion1 {
    public static void main(String... args){
        int[] ar = new int[]{5,9,2,7,6,3,4};
        int[] arr = new int[ar.length];
        for (int i=0; i<ar.length; i++){
            for (int j=1; j<ar.length; j++){
                if (ar[j]>ar[j-1]){
                    int temp = ar[j-1];
                    ar[j-1]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));

        //..........
//        System.out.println(Leader.leaderarr());
        Leader.leaderarr();
    }
}
