import java.lang.module.FindException;
import java.util.Arrays;

public class ArrayPractice6 {
    public static  void main(String[] args){
        int[] a= new int[5];
        for (int elem:a) {
            System.out.print(elem+" ");
        }
        System.out.println();
        Arrays.fill(a, 4);
        for (int elem:a) {
            System.out.print(elem+" ");
        }
        System.out.println();
        int[] arr = new int[]{45,65,85,23,26,74};
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));

        System.out.println();

        int[] arr1 = new int[]{45,85,32,41,62,26,10};
        int index=Arrays.binarySearch(arr1,26);
        System.out.println("Key at index "+ index);
    }
}
