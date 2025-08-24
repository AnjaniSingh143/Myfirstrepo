//write a program to print the sum of N natural number.
import java.util.Scanner;
public class assig5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        //getting input from the user
        int N = sc.nextInt();
        System.out.println("Sum of N natural number:");
        int sum = 0;
        for(int i=1; i<N+1; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
} 