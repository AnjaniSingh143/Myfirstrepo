import java.util.Arrays;

public class GFG2 {
    public static void main(String[] args) {
        //move all zero to the end
        int[] arr3 = {1,5,0,6,4,0,2,0};
        for(int j=0; j<arr3.length; j++) {
            for (int i = 0; i < arr3.length-1; i++) {
                if (arr3[i] == 0) {
                    int temp = arr3[i + 1];
                    arr3[i + 1] = arr3[i];
                    arr3[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
