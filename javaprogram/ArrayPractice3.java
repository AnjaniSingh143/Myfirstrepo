import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class Vehicle{
    String brand;
    int noOfwheels;
    Long cost;
    String color;
}
public class ArrayPractice3{
    public static void main(String args[]){
        //creating an array of Object
        Vehicle[] v = new Vehicle[3];

        //getting Number format
        @SuppressWarnings("deprecation")
        NumberFormat indianNumberFormat = NumberFormat.getInstance(new Locale("en","IN"));

        v[0]= new Vehicle(); 
        v[1]= new Vehicle();
        v[2]= new Vehicle(); ///Objects creating

        v[0].brand = "Mercedes";
        v[0].noOfwheels = 4;
        v[0].cost = 52102232L;
        v[0].color = "Black";

        v[1].brand = "BMW";
        v[1].noOfwheels = 4;
        v[1].cost = 43546532L;
        v[1].color = "White";

        v[2].brand = "Audi";
        v[2].noOfwheels = 4;
        v[2].cost = 83286436L;
        v[2].color = "Black";

        // System.out.println(v[0].brand);
        //if user wants to know details of brand name
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Brand name: ");
        String B_name = sc.nextLine(); 
        sc.close();
        switch (B_name) {
            case "Mercedes":
                System.out.println("Brand: "+v[0].brand);
                System.out.println("NoOfwheels: "+v[0].noOfwheels);
                System.out.println("Cost: "+indianNumberFormat.format(v[0].cost));
                System.out.println("Color: "+v[0].color);
            
                break;
            case "BMW":
            System.out.println("Brand: "+v[1].brand);
            System.out.println("NoOfwheels: "+v[1].noOfwheels);
            System.out.println("Cost: "+indianNumberFormat.format(v[1].cost));
            System.out.println("Color: "+v[1].color);
        
                break;
            case "Audi":
            System.out.println("Brand: "+v[2].brand);
            System.out.println("NoOfwheels: "+v[2].noOfwheels);
            System.out.println("Cost: "+indianNumberFormat.format(v[2].cost));
            System.out.println("Color: "+v[2].color);
        
                break;
            
        }
    }
}