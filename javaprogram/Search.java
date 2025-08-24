
public class Search{
    public static void main(String[] args){
        Binary_Search search = new Binary_Search();
        search.search(15);
    }

}
class Binary_Search{
    int [] arr = new int[]{5,12,15,18,21,28,36,44};
    int start =0;
    int end = arr.length-1;
    public int search(int target){
        int mid = (start + end)/2;
        if (target == arr[mid]) {
            return mid;
            
        }
        else if (target < arr[mid]) {
            end = mid;
        }
        else if (target > arr[mid]) {
            start = mid;
        }

        return -1;
    }
}