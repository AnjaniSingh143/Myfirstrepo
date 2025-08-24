import java.util.Scanner;
// import java.math.*;

public class Calculator1{
    public static void main(String[] args){
        Operation op = new Operation();
        // int result =op.sub();
        // System.out.println(result);
        
        // op.sub(); // error
        int a, b;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your command!");
        a =sc.nextInt();
        char s = sc.next().charAt(0);
        
        b = sc.nextInt();
        switch(s){
            case '+':
                System.out.println(op.add(a,b));
                break;
            case '-':
                System.out.println(op.sub(a,b));
                break;
            case '*':
                System.out.println(op.mult(a, b));
                break;
            case '/':
                System.out.println(op.div(a, b));
                break;
            case '%':
                System.out.println(op.mod(a, b));
                break;
            case '\\':
                System.out.println(op.floordiv(a, b));
        }

        
        
        

    }
}
class Operation{
     double add(double a, double b){
        System.out.print("Sum: ");
        return a+b;
    }
    double add( double a, double b, double c){
        System.out.print("Sum: ");
        return a+b+c;
    }
   
    double sub(double a, double b){
    System.out.print("Sub: ");
    return a - b;
    }
    double mult(double x, double y){
    System.out.print("Multiply: ");
    return x * y;
    }
    double div(double a, double b){
        System.out.print("Division: ");
        return a/b;
    }
    double mod(double a, double b){
        System.out.print("Modulo: ");
        return a%b;
    }
   int floordiv(int a, int b){
        System.out.print("FloorDivision: ");
        return Math.floorDiv(a, b);
   }

}