import java.util.Arrays;
class Selection_sort{
    public void sort(int[] arr){
        for (int i=0; i<arr.length; i++){
            int min_index = i;
            for( int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min_index];
            arr[min_index] = temp;
        }
//        int[] array1 = Arrays.stream(array).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
public class Selectionsort {
    /*Recursive Selectionsort*/
    static int minindex(int a[], int i,int j){
        if (i==j){
            return i;
        }
        int k = minindex(a,i+1,j);
        return (a[i]<a[k])? i:k;
    }
    static void recursiveselectionsort(int a[], int n, int index){
        if(n==index)
            return;

        int k = minindex(a,index,n-1);

        if (k != n) {
            int temp = a[k];
            a[k]=a[index];
            a[index]=temp;
        }
        recursiveselectionsort(a,n,index+1);
    }
    public static void main(String[] args){
        Selection_sort ref = new Selection_sort();
        int[] arr = {6,14,2,9,7,0,5,10};
        ref.sort(arr);

        // recursiveselection
        int[] ar = new int[]{4,6,8,12,8,3,5};
        recursiveselectionsort(ar,ar.length,0);
        //print
        for (int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
}
