//write a java program to check prime number
import java.util.Scanner;
public class assig6{
    public static void main(String[] args){
        System.out.print("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag=true;
        for(int i=2; i<=num/2; ++i){
            // condition for non prime
            if(num % i ==0){
                flag=false;
                break;
            }
        
        }
        if (num == 1){
            System.out.println(num + " is not a prime nor composite number.");
        
        }
        else if(!flag){
            System.out.println(num + " is not a prime number.");
        }
        else{ 
            System.out.println(num + " is a prime number.");
        }

    }
}