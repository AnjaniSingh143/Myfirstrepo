// import java.util.Random;
import java.util.Scanner;

public class arraypractice {

    public static void main(String[] args){

    
         /*for class marks--- */
        Marks mg = new Marks();
        mg.displaymarks();
        System.out.println();

        /*for class marks--- */


        int z=0;
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[5][5];
        for(int i=0; i<5; i++){
            for(int j =0; j<5; j++){
                array[i][j] = z++;
            }
        }
       
        for (int[] is : array) {
           for (int is2 : is) {
            System.out.print(" "+ is2);
           }
           System.out.println();
        }
        sc.close();
    }
}

class Marks{
    Scanner scan = new Scanner(System.in);
    public void displaymarks(){
        int[] m = new int[6];
        for(int i=1; i<6; i++){
            System.out.print("Enter the marks of student "+i+": ");
            m[i] = scan.nextInt();
        }

        System.out.println("Here is the marks of all student.");
        for(int i=1; i<6; i++){
            System.out.print(m[i]+" ");
        }
        System.out.println();
    }
}