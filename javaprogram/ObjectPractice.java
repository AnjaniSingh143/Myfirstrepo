import java.util.Scanner;

class Student{
    //instance variables
    int studentId;
    String name;
    int age;
    char gender;
    String email;


    void play(){
        System.out.println("Student is playing cricket.");
    }

    void study(){
        System.out.println("Student is studying in library.");
    }

    void drink(){
        System.out.println("He used to drink softdrinks.");

    }

    void sleep(){
        System.out.println("He is going to sleep at 11 PM.");
    }


}



class Calculator{
    float a,b,c;
    Scanner sc = new Scanner(System.in);


    float add(){
        
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        float sum = a + b + c;
        
        System.out.println("Sum: " + sum);
        return sum;
        
    }
    float add(float a, float b){ //method overloading...
        
        a = sc.nextFloat();
        b = sc.nextFloat();
        
        float sum = a + b;
        
        System.out.println("Sum: " + sum);
        return sum;
        
    }

    float sub(){
        a = sc.nextFloat();
        b = sc.nextFloat();
        
        System.out.print("Subtract: ");
        return (a - b);
    }
    float mult(){
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        System.out.print("Multiply: ");
        return a * b * c;
    }
    float div(){
        a = sc.nextFloat();
        b = sc.nextFloat();
        
        System.out.print("Division: ");
        return a / b;
    }

}
public class ObjectPractice{
    public static void main(String[] args){
        // System.out.println(studentId); // instance variable can't be directly accessed .
        //creating  an object......
        Student result = new Student();
        System.out.println(result.name);
        result.age = 21;
        System.out.println(result.age);

        result.drink();

        //calculator
        Calculator cal = new Calculator();
        cal.add();
        System.out.println(cal.sub());

        //Questions.....
        int x =0;
        int y = 0;
        for(short z=0; z<5; z++)
            if (++x>2 || ++y>2) { //here value does't increase, only check by increase
                    x++; //incresing of value is happening
            }
        System.out.println(x + " "+ y);
        

        // byte x = 10;
        // int x1 = 'a'; //we can store char as a string --- value would be 97
        // switch (x+1) {
        //     //we can't give same case value in different place.
        //     // also can't give out of the range value of the data_type of the variable (x)  
        //     case 1500:
        //         System.out.println("value not matched.");
                
        //         break;
        //     case 26:
        //         System.out.println("value not matched.");
        //         break;
        //     case 10:
        //         System.out.println("value matched.");
        //         break;
        //     default:
        //         System.out.println("value out of range.");
        //         break;
        // }
        
    }
}