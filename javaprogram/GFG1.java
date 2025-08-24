import java.util.Arrays;

public class GFG1 {
    public static void main(String[] args){
        //to find largest element in the array.....
        int[] arr = new int[]{12,35,1,10,34,1};
        int[] arr1 = {10,5,10};
        int[] arr2 = {10,10,10};


//        int i=0;
//        int largest=arr1[i];
//        for(i=0; i<arr1.length; i++){
//            if(arr1[i]>largest){
//                largest=arr1[i];
//            }
//
//        }
//        System.out.println("Largest number is "+largest);
//        for (i = 0; i < arr1.length; i++) {
//            if (arr1[i] == largest) {
//                arr1[i] = 0;
//            }
//        }
//        System.out.println(Arrays.toString(arr1));
//

        // to find second largest element........
        Second_largest tr = new Second_largest();
        int value = tr.sec_largest(arr2);
        System.out.println("Second largest element is "+value);

    }
}
class Second_largest {
    //    int[] arr = new int[6];

   public int sec_largest(int[] arr) {
//        int i = 0;
        int largest = arr[0];
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];

            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == largest) {
                arr[i] = 0;
            }
        }
        int seclargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > seclargest) {
               seclargest = arr[i];
                flag = true;
            }
//            return largest;

        }
        if(flag==true)
            return seclargest;

        return -1;
    }
}
