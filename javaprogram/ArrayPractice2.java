import java.util.Scanner;
class ArrayPractice2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[3][2];
        System.out.println("Enter the names of students:");

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextLine();
            }
        }
        System.out.println("Here are all the students in array format:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }

}