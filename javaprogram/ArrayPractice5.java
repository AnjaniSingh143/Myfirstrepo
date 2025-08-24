import java.util.Arrays;

public class ArrayPractice5 {
    public static void main(String[] args){
        //sum of all the element in an array..................
        int[] arr = new int[]{42,12,52,82,8,2};
        int sum=0;
        for (int elem:arr) {
            sum+=elem;
        }
        System.out.println("Sum of all numbers = "+sum);

        // WAP to get min and max element in an array....................
        int i=0;
        int minVal = arr[i];
        int maxVal=arr[i];
        for(i=0; i<arr.length; i++){
            if (minVal<=arr[i]){

            }
            else{
                minVal=arr[i];
            }
            if(maxVal>=arr[i]){

            }
            else{
                maxVal=arr[i];

            }
        }
//        System.out.println(Arrays.stream(arr).max().getAsInt());
//        System.out.println(Arrays.stream(arr).min().getAsInt());



        System.out.println("Minimum Value: "+minVal);
        System.out.println("Maximum Value: "+maxVal);

        Practice ob = new Practice();
        ob.run();
    }
}
class Practice{
    static void run(){
        l1: for(int i=0; i<3; i++){
            System.out.println("Lets play!");
            for(int j=0; j<3; j++){ //lebelled block

                    if(i==j)
                        continue;
                    System.out.println(i+"...."+j);

            }
            System.out.println("hello");
        }
    }
}
