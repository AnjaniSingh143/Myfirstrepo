public class assig12{
    public static void main(String[] args){
        //making an array elements
        int a[]= {1,5,8,6,2,3,9,12,11};
        int evenSum=0;
        int oddSum=0;
        //loop for accessing each elements of array
        for(int i=0; i<9; i++){
            //checking element is odd or even and add them seperately   
            if(a[i]%2==0){
                
                evenSum=evenSum + a[i];
            }
            else{
                
                oddSum=oddSum + a[i];
            }
        }
        System.out.println("Sum of odd numbers: "+ oddSum);
        System.out.println("Sum of even numbers: "+evenSum);
    }
}