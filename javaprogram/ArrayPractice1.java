import java.util.Scanner;

class ArrayPractice1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[][] sname= new String[3][4]; // array declaration
        
        
        for (int i = 0; i < sname.length; i++) {
            for(int j=0; j<sname[i].length; j++){
                System.out.println("Enter the name of class "+(i+1)+" Student "+(j+1));
                sname[i][j] = sc.nextLine();
            }
            
        }

        //for display names...
        for(int i=0; i<sname.length; i++){
            for(int j=0; j<sname.length; j++){
                System.out.print("Class "+(i+1)+ " Student "+(j+1)+": "+sname[i][j]);;
            }
            System.out.println();
        }
        sc.close();



        

    }
}